package typingsSlinky.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validation extends js.Object {
  var messages: StringDictionary[String] = js.native
  var overrideMessages: Boolean = js.native
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit = js.native
}

object Validation {
  @scala.inline
  def apply(
    errorFilter: (String, String, String) => Unit,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  @scala.inline
  implicit class ValidationOps[Self <: Validation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorFilter(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMessages(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

