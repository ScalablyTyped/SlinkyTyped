package typingsSlinky.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var blocks: js.Array[Block] = js.native
  var confidence: Double = js.native
  var html: String = js.native
  var lines: js.Array[Line] = js.native
  var oem: String = js.native
  var paragraphs: js.Array[Paragraph] = js.native
  var psm: String = js.native
  var symbols: js.Array[Symbol] = js.native
  var text: String = js.native
  var version: String = js.native
  var words: js.Array[Word] = js.native
}

object Page {
  @scala.inline
  def apply(
    blocks: js.Array[Block],
    confidence: Double,
    html: String,
    lines: js.Array[Line],
    oem: String,
    paragraphs: js.Array[Paragraph],
    psm: String,
    symbols: js.Array[Symbol],
    text: String,
    version: String,
    words: js.Array[Word]
  ): Page = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], oem = oem.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], psm = psm.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[Block]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[Line]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphs(value: js.Array[Paragraph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPsm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("psm")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: js.Array[Word]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

