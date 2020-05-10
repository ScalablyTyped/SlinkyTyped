package typingsSlinky.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies a sub-string of a source text string. Your app can use this structure to obtain the segment of your provided text that is identified by AlternateWordForm , SelectableWordSegment , WordSegment , or SemanticTextQuery . */
@js.native
trait TextSegment extends js.Object {
  /** The number of characters in the associated text segment. */
  var length: Double = js.native
  /** The zero-based index of the start of the associated text segment. */
  var startPosition: Double = js.native
}

object TextSegment {
  @scala.inline
  def apply(length: Double, startPosition: Double): TextSegment = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSegment]
  }
  @scala.inline
  implicit class TextSegmentOps[Self <: TextSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

