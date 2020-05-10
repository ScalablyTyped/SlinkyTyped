package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Document conversion settings. */
@js.native
trait Conversions extends js.Object {
  /** A list of HTML conversion settings. */
  var html: js.UndefOr[HtmlSettings] = js.native
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var json_normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.native
  /** A list of PDF conversion settings. */
  var pdf: js.UndefOr[PdfSettings] = js.native
  /** A list of Document Segmentation settings. */
  var segment: js.UndefOr[SegmentSettings] = js.native
  /** A list of Word conversion settings. */
  var word: js.UndefOr[WordSettings] = js.native
}

object Conversions {
  @scala.inline
  def apply(): Conversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversions]
  }
  @scala.inline
  implicit class ConversionsOps[Self <: Conversions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: HtmlSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withJson_normalizations(value: js.Array[NormalizationOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_normalizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson_normalizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_normalizations")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: PdfSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: SegmentSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: WordSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

