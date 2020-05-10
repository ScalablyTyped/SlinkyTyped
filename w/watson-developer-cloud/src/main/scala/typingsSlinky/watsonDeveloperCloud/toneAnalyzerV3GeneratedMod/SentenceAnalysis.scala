package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SentenceAnalysis. */
@js.native
trait SentenceAnalysis extends js.Object {
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the first character of the sentence in the overall input content. */
  var input_from: js.UndefOr[Double] = js.native
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the last character of the sentence in the overall input content. */
  var input_to: js.UndefOr[Double] = js.native
  /** The unique identifier of a sentence of the input content. The first sentence has ID 0, and the ID of each subsequent sentence is incremented by one. */
  var sentence_id: Double = js.native
  /** The text of the input sentence. */
  var text: String = js.native
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the sentence. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.native
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the sentence. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.native
}

object SentenceAnalysis {
  @scala.inline
  def apply(sentence_id: Double, text: String): SentenceAnalysis = {
    val __obj = js.Dynamic.literal(sentence_id = sentence_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceAnalysis]
  }
  @scala.inline
  implicit class SentenceAnalysisOps[Self <: SentenceAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentence_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput_from(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_from: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_from")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_to")(js.undefined)
        ret
    }
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
  }
  
}

