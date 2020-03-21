package typingsSlinky.testingLibraryReactHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookResult[R] extends js.Object {
  val current: R
  val error: js.Error
}

object HookResult {
  @scala.inline
  def apply[R](current: R, error: js.Error): HookResult[R] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookResult[R]]
  }
}

