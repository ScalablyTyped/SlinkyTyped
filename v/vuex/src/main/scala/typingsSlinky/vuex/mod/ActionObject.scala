package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionObject[S, R] extends Action[S, R] {
  @JSName("handler")
  var handler_Original: ActionHandler[S, R] = js.native
  var root: js.UndefOr[Boolean] = js.native
  def handler(injectee: ActionContext[S, R]): js.Any = js.native
  def handler(injectee: ActionContext[S, R], payload: js.Any): js.Any = js.native
}

