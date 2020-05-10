package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the message input to be sent to the assistant if the user selects the corresponding disambiguation option. */
@js.native
trait DialogSuggestionValue extends js.Object {
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
}

object DialogSuggestionValue {
  @scala.inline
  def apply(): DialogSuggestionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSuggestionValue]
  }
  @scala.inline
  implicit class DialogSuggestionValueOps[Self <: DialogSuggestionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: MessageInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
  }
  
}

