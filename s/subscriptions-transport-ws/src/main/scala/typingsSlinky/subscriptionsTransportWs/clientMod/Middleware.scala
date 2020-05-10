package typingsSlinky.subscriptionsTransportWs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  def applyMiddleware(options: OperationOptions, next: js.Function): Unit = js.native
}

object Middleware {
  @scala.inline
  def apply(applyMiddleware: (OperationOptions, js.Function) => Unit): Middleware = {
    val __obj = js.Dynamic.literal(applyMiddleware = js.Any.fromFunction2(applyMiddleware))
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyMiddleware(value: (OperationOptions, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMiddleware")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

