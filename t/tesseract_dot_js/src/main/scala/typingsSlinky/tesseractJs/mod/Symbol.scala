package typingsSlinky.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol extends js.Object {
  var baseline: Baseline = js.native
  var bbox: Bbox = js.native
  var block: Block = js.native
  var choices: js.Array[Choice] = js.native
  var confidence: Double = js.native
  var image: js.Any = js.native
  var is_dropcap: Boolean = js.native
  var is_subscript: Boolean = js.native
  var is_superscript: Boolean = js.native
  var line: Line = js.native
  var page: Page = js.native
  var paragraph: Paragraph = js.native
  var text: String = js.native
  var word: Word = js.native
}

object Symbol {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    image: js.Any,
    is_dropcap: Boolean,
    is_subscript: Boolean,
    is_superscript: Boolean,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    text: String,
    word: Word
  ): Symbol = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], is_dropcap = is_dropcap.asInstanceOf[js.Any], is_subscript = is_subscript.asInstanceOf[js.Any], is_superscript = is_superscript.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseline(value: Baseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: Bbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoices(value: js.Array[Choice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_dropcap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dropcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_subscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_superscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraph(value: Paragraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord(value: Word): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

