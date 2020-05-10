package typingsSlinky.universalRouter

import typingsSlinky.universalRouter.mod.Context
import typingsSlinky.universalRouter.mod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRouter[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R] = js.native
}

object AnonRouter {
  @scala.inline
  def apply[C, R](router: UniversalRouter[C, R]): AnonRouter[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRouter[C, R]]
  }
  @scala.inline
  implicit class AnonRouterOps[Self[c, r] <: AnonRouter[c, r], C, R] (val x: Self[C, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, R]) with Other]
    @scala.inline
    def withRouter(value: UniversalRouter[C, R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

