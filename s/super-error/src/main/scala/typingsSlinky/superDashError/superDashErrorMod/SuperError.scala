package typingsSlinky.superDashError.superDashErrorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperError
  extends Error
     with /* k */ StringDictionary[js.Any] {
  def causedBy(err: js.Error): this.type
}

object SuperError {
  @scala.inline
  def apply(
    causedBy: js.Error => SuperError,
    message: String,
    name: String,
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    stack: String = null
  ): SuperError = {
    val __obj = js.Dynamic.literal(causedBy = js.Any.fromFunction1(causedBy), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperError]
  }
}

