package typingsSlinky.swaggerNodeRunner.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod._Global_.Express.Application
import typingsSlinky.expressServeStaticCore.mod._Global_.Express.Request
import typingsSlinky.expressServeStaticCore.mod._Global_.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectMiddleware extends Middleware {
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  /** Register this Middleware with `app`  */
  def register(app: Application): Unit = js.native
}

object ConnectMiddleware {
  @scala.inline
  def apply(
    middleware: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
    register: Application => Unit,
    runner: Runner
  ): ConnectMiddleware = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction0(middleware), register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectMiddleware]
  }
  @scala.inline
  implicit class ConnectMiddlewareOps[Self <: ConnectMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMiddleware(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: Application => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

