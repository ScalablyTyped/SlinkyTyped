package typingsSlinky.universalRouter.anon

import typingsSlinky.universalRouter.universalRouterSyncMod.Context
import typingsSlinky.universalRouter.universalRouterSyncMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterUniversalRouter[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R] = js.native
}

object RouterUniversalRouter {
  @scala.inline
  def apply[C, R](router: UniversalRouter[C, R]): RouterUniversalRouter[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterUniversalRouter[C, R]]
  }
  @scala.inline
  implicit class RouterUniversalRouterOps[Self[c, r] <: RouterUniversalRouter[c, r], C, R] (val x: Self[C, R]) extends AnyVal {
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

