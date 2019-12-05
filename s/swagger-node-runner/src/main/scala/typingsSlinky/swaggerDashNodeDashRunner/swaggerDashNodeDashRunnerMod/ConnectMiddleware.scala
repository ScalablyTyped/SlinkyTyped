package typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Application
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectMiddleware extends Middleware {
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
  /** Register this Middleware with `app`  */
  def register(app: Application): Unit
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
}

