package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
@js.native
trait DocumentAnalysis extends js.Object {
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the full document of the input content. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.native
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the document. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.native
  /** **`2017-09-21`:** A warning message if the overall content exceeds 128 KB or contains more than 1000 sentences. The service analyzes only the first 1000 sentences for document-level analysis and the first 100 sentences for sentence-level analysis. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.native
}

object DocumentAnalysis {
  @scala.inline
  def apply(): DocumentAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAnalysis]
  }
  @scala.inline
  implicit class DocumentAnalysisOps[Self <: DocumentAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTone_categories(value: js.Array[ToneCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tone_categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTone_categories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tone_categories")(js.undefined)
        ret
    }
    @scala.inline
    def withTones(value: js.Array[ToneScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tones")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

