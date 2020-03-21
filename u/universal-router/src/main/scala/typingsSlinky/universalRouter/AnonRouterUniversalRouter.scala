package typingsSlinky.universalRouter

import typingsSlinky.universalRouter.universalRouterSyncMod.Context
import typingsSlinky.universalRouter.universalRouterSyncMod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRouterUniversalRouter[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object AnonRouterUniversalRouter {
  @scala.inline
  def apply[C /* <: Context */, R](router: UniversalRouter[C, R]): AnonRouterUniversalRouter[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRouterUniversalRouter[C, R]]
  }
}

