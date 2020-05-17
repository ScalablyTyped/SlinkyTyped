package typingsSlinky.winrtUwp.Windows.Data.Text

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a word from your provided text. */
@js.native
trait WordSegment extends js.Object {
  /** Gets the alternate forms (if any) associated with the current word. */
  var alternateForms: IVectorView[AlternateWordForm] = js.native
  /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
  var sourceTextSegment: TextSegment = js.native
  /** Gets the text of the word identified by this WordSegment object. */
  var text: String = js.native
}

object WordSegment {
  @scala.inline
  def apply(alternateForms: IVectorView[AlternateWordForm], sourceTextSegment: TextSegment, text: String): WordSegment = {
    val __obj = js.Dynamic.literal(alternateForms = alternateForms.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordSegment]
  }
  @scala.inline
  implicit class WordSegmentOps[Self <: WordSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateForms(value: IVectorView[AlternateWordForm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateForms")(value.asInstanceOf[js.Any])
        ret
    }
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

