package typingsSlinky.universalRouter.anon

import typingsSlinky.universalRouter.universalRouterSyncMod.Context
import typingsSlinky.universalRouter.universalRouterSyncMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterUniversalRouter[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object RouterUniversalRouter {
  @scala.inline
  def apply[C, R](router: UniversalRouter[C, R]): RouterUniversalRouter[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterUniversalRouter[C, R]]
  }
}

