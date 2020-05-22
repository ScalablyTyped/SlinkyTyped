package typingsSlinky.universalRouter.anon

import typingsSlinky.universalRouter.mod.Context
import typingsSlinky.universalRouter.mod.UniversalRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router[C /* <: Context */, R] extends js.Object {
  var router: UniversalRouter[C, R]
}

object Router {
  @scala.inline
  def apply[C, R](router: UniversalRouter[C, R]): Router[C, R] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router[C, R]]
  }
}

