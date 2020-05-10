package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when user interacts with a URL in the text area. See [handleLinks](Titanium.UI.TextArea.handleLinks).
		 */
@js.native
trait TextAreaLinkEvent extends TextAreaBaseEvent {
  /**
  			 * This is false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
  /**
  			 * An array of two numbers [location, length] describing the character range of the text associated with this URL.
  			 */
  var range: js.Array[_] = js.native
  /**
  			 * The URL that is associated with this event.
  			 */
  var url: String = js.native
}

object TextAreaLinkEvent {
  @scala.inline
  def apply(bubbles: Boolean, range: js.Array[_], source: TextArea, url: String): TextAreaLinkEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaLinkEvent]
  }
  @scala.inline
  implicit class TextAreaLinkEventOps[Self <: TextAreaLinkEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

