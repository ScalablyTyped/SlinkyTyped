package typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SailsMiddleware extends Middleware {
  /** Express style middleware */
  def chain(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
}

object SailsMiddleware {
  @scala.inline
  def apply(
    chain: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
    runner: Runner
  ): SailsMiddleware = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction0(chain), runner = runner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SailsMiddleware]
  }
}

