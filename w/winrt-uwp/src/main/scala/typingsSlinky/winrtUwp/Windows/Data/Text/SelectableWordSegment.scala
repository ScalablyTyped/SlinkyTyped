package typingsSlinky.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
@js.native
trait SelectableWordSegment extends js.Object {
  /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
  var sourceTextSegment: TextSegment = js.native
  /** Gets the text of the selected word identified by this SelectableWordSegment object. */
  var text: String = js.native
}

object SelectableWordSegment {
  @scala.inline
  def apply(sourceTextSegment: TextSegment, text: String): SelectableWordSegment = {
    val __obj = js.Dynamic.literal(sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableWordSegment]
  }
  @scala.inline
  implicit class SelectableWordSegmentOps[Self <: SelectableWordSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceTextSegment(value: TextSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTextSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

