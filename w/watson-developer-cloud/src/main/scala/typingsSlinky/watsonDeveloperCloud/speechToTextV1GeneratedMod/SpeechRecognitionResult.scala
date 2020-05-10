package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechRecognitionResult. */
@js.native
trait SpeechRecognitionResult extends js.Object {
  /** An array of alternative transcripts. The `alternatives` array can include additional requested output such as word confidence or timestamps. */
  var alternatives: js.Array[SpeechRecognitionAlternative] = js.native
  /** An indication of whether the transcription results are final. If `true`, the results for this utterance are not updated further; no additional results are sent for a `result_index` once its results are indicated as final. */
  var final_results: Boolean = js.native
  /** A dictionary (or associative array) whose keys are the strings specified for `keywords` if both that parameter and `keywords_threshold` are specified. The value for each key is an array of matches spotted in the audio for that keyword. Each match is described by a `KeywordResult` object. A keyword for which no matches are found is omitted from the dictionary. The dictionary is omitted entirely if no matches are found for any keywords. */
  var keywords_result: js.UndefOr[js.Object] = js.native
  /** An array of alternative hypotheses found for words of the input audio if a `word_alternatives_threshold` is specified. */
  var word_alternatives: js.UndefOr[js.Array[WordAlternativeResults]] = js.native
}

object SpeechRecognitionResult {
  @scala.inline
  def apply(alternatives: js.Array[SpeechRecognitionAlternative], final_results: Boolean): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], final_results = final_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  @scala.inline
  implicit class SpeechRecognitionResultOps[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinal_results(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords_result(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords_result: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_result")(js.undefined)
        ret
    }
    @scala.inline
    def withWord_alternatives(value: js.Array[WordAlternativeResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord_alternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_alternatives")(js.undefined)
        ret
    }
  }
  
}

