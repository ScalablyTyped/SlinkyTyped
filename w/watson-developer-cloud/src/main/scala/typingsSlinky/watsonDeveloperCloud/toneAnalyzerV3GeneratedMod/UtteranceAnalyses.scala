package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** UtteranceAnalyses. */
@js.native
trait UtteranceAnalyses extends js.Object {
  /** An array of `UtteranceAnalysis` objects that provides the results for each utterance of the input. */
  var utterances_tone: js.Array[UtteranceAnalysis] = js.native
  /** **`2017-09-21`:** A warning message if the content contains more than 50 utterances. The service analyzes only the first 50 utterances. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.native
}

object UtteranceAnalyses {
  @scala.inline
  def apply(utterances_tone: js.Array[UtteranceAnalysis]): UtteranceAnalyses = {
    val __obj = js.Dynamic.literal(utterances_tone = utterances_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalyses]
  }
  @scala.inline
  implicit class UtteranceAnalysesOps[Self <: UtteranceAnalyses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtterances_tone(value: js.Array[UtteranceAnalysis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utterances_tone")(value.asInstanceOf[js.Any])
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

