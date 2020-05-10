package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechRecognitionAlternative. */
@js.native
trait SpeechRecognitionAlternative extends js.Object {
  /** A score that indicates the service's confidence in the transcript in the range of 0.0 to 1.0. A confidence score is returned only for the best alternative and only with results marked as final. */
  var confidence: js.UndefOr[Double] = js.native
  /** Time alignments for each word from the transcript as a list of lists. Each inner list consists of three elements: the word followed by its start and end time in seconds, for example: `[["hello",0.0,1.2],["world",1.2,2.5]]`. Timestamps are returned only for the best alternative. */
  var timestamps: js.UndefOr[js.Array[String]] = js.native
  /** A transcription of the audio. */
  var transcript: String = js.native
  /** A confidence score for each word of the transcript as a list of lists. Each inner list consists of two elements: the word and its confidence score in the range of 0.0 to 1.0, for example: `[["hello",0.95],["world",0.866]]`. Confidence scores are returned only for the best alternative and only with results marked as final. */
  var word_confidence: js.UndefOr[js.Array[String]] = js.native
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(transcript: String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  @scala.inline
  implicit class SpeechRecognitionAlternativeOps[Self <: SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranscript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withWord_confidence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord_confidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_confidence")(js.undefined)
        ret
    }
  }
  
}

