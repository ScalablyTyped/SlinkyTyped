package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlInputBox extends js.Object {
  /**
  		 * A string to show as placeholder in the input box to guide the user.
  		 */
  var placeholder: String = js.native
  /**
  		 * Setter and getter for the contents of the input box.
  		 */
  var value: String = js.native
}

object SourceControlInputBox {
  @scala.inline
  def apply(placeholder: String, value: String): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlInputBox]
  }
  @scala.inline
  implicit class SourceControlInputBoxOps[Self <: SourceControlInputBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

