package typingsSlinky.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightOptions extends js.Object {
  var alternateField: js.UndefOr[String] = js.native
  var fl: js.UndefOr[String | js.Array[String]] = js.native
  var formatter: js.UndefOr[String] = js.native
  var fragmenter: js.UndefOr[String] = js.native
  var fragsize: js.UndefOr[Double] = js.native
  var highlightMultiTerm: js.UndefOr[Boolean] = js.native
  var maxAlternateFieldLength: js.UndefOr[Double] = js.native
  var maxAnalyzedChars: js.UndefOr[Double] = js.native
  var maxMultiValuedToExamine: js.UndefOr[Double] = js.native
  var maxMultiValuedToMatch: js.UndefOr[Double] = js.native
  var mergeContiguous: js.UndefOr[Boolean] = js.native
  var on: Boolean = js.native
  var payloads: js.UndefOr[Boolean] = js.native
  var preserveMulti: js.UndefOr[Boolean] = js.native
  var q: js.UndefOr[String | js.Array[String]] = js.native
  var qparser: js.UndefOr[String] = js.native
  var regexMaxAnalyzedChars: js.UndefOr[Double] = js.native
  var regexPattern: js.UndefOr[String] = js.native
  var regexSlop: js.UndefOr[Double] = js.native
  var requireFieldMatch: js.UndefOr[Boolean] = js.native
  var simplePost: js.UndefOr[String] = js.native
  var simplePre: js.UndefOr[String] = js.native
  var snippets: js.UndefOr[Double] = js.native
  var usePhraseHighlighter: js.UndefOr[Boolean] = js.native
}

object HighlightOptions {
  @scala.inline
  def apply(on: Boolean): HighlightOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
  @scala.inline
  implicit class HighlightOptionsOps[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternateField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateField")(js.undefined)
        ret
    }
    @scala.inline
    def withFl(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fl")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmenter")(js.undefined)
        ret
    }
    @scala.inline
    def withFragsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragsize")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMultiTerm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMultiTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMultiTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMultiTerm")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAlternateFieldLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternateFieldLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAlternateFieldLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAlternateFieldLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAnalyzedChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnalyzedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAnalyzedChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnalyzedChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMultiValuedToExamine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiValuedToExamine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMultiValuedToExamine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiValuedToExamine")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMultiValuedToMatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiValuedToMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMultiValuedToMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiValuedToMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeContiguous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeContiguous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeContiguous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeContiguous")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withQparser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qparser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQparser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qparser")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMaxAnalyzedChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMaxAnalyzedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMaxAnalyzedChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMaxAnalyzedChars")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireFieldMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireFieldMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireFieldMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireFieldMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplePost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplePost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePost")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplePre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplePre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePre")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippets")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePhraseHighlighter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePhraseHighlighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePhraseHighlighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePhraseHighlighter")(js.undefined)
        ret
    }
  }
  
}

