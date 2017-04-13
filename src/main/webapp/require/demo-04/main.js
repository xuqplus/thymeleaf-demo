/**
 * web应用程序入口
 */
require(['hello'], function (hello) {
    console.log(hello.plus(1, 2));
});