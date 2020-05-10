package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.textAreaSelectedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when text in this text area is selected.
		 */
@js.native
trait TextAreaSelectedEvent extends TextAreaBaseEvent {
  /**
  			 * Dictionary that describes the position and length of the selected text.
  			 */
  var range: textAreaSelectedParams = js.native
}

object TextAreaSelectedEvent {
  @scala.inline
  def apply(range: textAreaSelectedParams, source: TextArea): TextAreaSelectedEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaSelectedEvent]
  }
  @scala.inline
  implicit class TextAreaSelectedEventOps[Self <: TextAreaSelectedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: textAreaSelectedParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

