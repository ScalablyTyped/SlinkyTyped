package typingsSlinky.swaggerNodeRunner.mod

import typingsSlinky.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestifyMiddleware extends Middleware {
  /** Register this Middleware with `app`  */
  def register(app: Server): Unit = js.native
}

object RestifyMiddleware {
  @scala.inline
  def apply(register: Server => Unit, runner: Runner): RestifyMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestifyMiddleware]
  }
  @scala.inline
  implicit class RestifyMiddlewareOps[Self <: RestifyMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: Server => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

