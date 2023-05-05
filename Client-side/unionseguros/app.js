var createError = require('http-errors');
const express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var SOATProcesoRouter = require('./routes/SOATProceso');
var SOATRouter = require('./routes/SOAT');
var adminPlanSOATRouter = require('./routes/adminPlanSOAT');
var adminDetallePlanSOATRouter = require('./routes/adminDetallePlanSOAT');

const app = express();

// Start the server
const PORT = 3000
app.listen(PORT, function () {
  console.log(`Server listening on port ${PORT}`)
})

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
