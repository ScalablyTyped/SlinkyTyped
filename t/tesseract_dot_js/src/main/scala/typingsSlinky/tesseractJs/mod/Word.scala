package typingsSlinky.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word extends js.Object {
  var baseline: Baseline = js.native
  var bbox: Bbox = js.native
  var block: Block = js.native
  var choices: js.Array[Choice] = js.native
  var confidence: Double = js.native
  var direction: String = js.native
  var font_id: Double = js.native
  var font_name: String = js.native
  var font_size: Double = js.native
  var in_dictionary: Boolean = js.native
  var is_bold: Boolean = js.native
  var is_italic: Boolean = js.native
  var is_monospace: Boolean = js.native
  var is_numeric: Boolean = js.native
  var is_serif: Boolean = js.native
  var is_smallcaps: Boolean = js.native
  var is_underlined: Boolean = js.native
  var language: String = js.native
  var line: Line = js.native
  var page: Page = js.native
  var paragraph: Paragraph = js.native
  var symbols: js.Array[Symbol] = js.native
  var text: String = js.native
}

object Word {
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    direction: String,
    font_id: Double,
    font_name: String,
    font_size: Double,
    in_dictionary: Boolean,
    is_bold: Boolean,
    is_italic: Boolean,
    is_monospace: Boolean,
    is_numeric: Boolean,
    is_serif: Boolean,
    is_smallcaps: Boolean,
    is_underlined: Boolean,
    language: String,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: String
  ): Word = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], font_id = font_id.asInstanceOf[js.Any], font_name = font_name.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], in_dictionary = in_dictionary.asInstanceOf[js.Any], is_bold = is_bold.asInstanceOf[js.Any], is_italic = is_italic.asInstanceOf[js.Any], is_monospace = is_monospace.asInstanceOf[js.Any], is_numeric = is_numeric.asInstanceOf[js.Any], is_serif = is_serif.asInstanceOf[js.Any], is_smallcaps = is_smallcaps.asInstanceOf[js.Any], is_underlined = is_underlined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
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
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn_dictionary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_bold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_italic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_monospace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_monospace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_numeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_serif(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_serif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_smallcaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_smallcaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_underlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_underlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
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
    def withSymbols(value: js.Array[Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
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

