var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var SOATProcesoRouter = require('./routes/SOATProceso');
var SOATRouter = require('./routes/SOAT');
var adminPlanSOATRouter = require('./routes/adminPlanSOAT');
var adminDetallePlanSOATRouter = require('./routes/adminDetallePlanSOAT');

var http = require('http');

//create a server object:
http.createServer(function (req, res) {
  res.write('A Monk in Cloud'); //write a response to the client
  res.end(); //end the response
}).listen(80); //the server object listens on port 80

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/SOATProceso', SOATProcesoRouter);
app.use('/public', express.static('public'));
app.use('/SOAT', SOATRouter)

app.use('/admin/planSOAT', adminPlanSOATRouter);
app.use('/admin/detallePlanSOAT', adminDetallePlanSOATRouter);

// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use(function (err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;
