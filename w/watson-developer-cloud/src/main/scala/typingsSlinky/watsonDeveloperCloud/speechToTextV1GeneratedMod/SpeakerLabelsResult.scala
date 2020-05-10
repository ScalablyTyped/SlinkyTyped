package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeakerLabelsResult. */
@js.native
trait SpeakerLabelsResult extends js.Object {
  /** A score that indicates the service's confidence in its identification of the speaker in the range of 0.0 to 1.0. */
  var confidence: Double = js.native
  /** An indication of whether the service might further change word and speaker-label results. A value of `true` means that the service guarantees not to send any further updates for the current or any preceding results; `false` means that the service might send further updates to the results. */
  var final_results: Boolean = js.native
  /** The start time of a word from the transcript. The value matches the start time of a word from the `timestamps` array. */
  var from: Double = js.native
  /** The numeric identifier that the service assigns to a speaker from the audio. Speaker IDs begin at `0` initially but can evolve and change across interim results (if supported by the method) and between interim and final results as the service processes the audio. They are not guaranteed to be sequential, contiguous, or ordered. */
  var speaker: Double = js.native
  /** The end time of a word from the transcript. The value matches the end time of a word from the `timestamps` array. */
  var to: Double = js.native
}

object SpeakerLabelsResult {
  @scala.inline
  def apply(confidence: Double, final_results: Boolean, from: Double, speaker: Double, to: Double): SpeakerLabelsResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], final_results = final_results.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], speaker = speaker.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakerLabelsResult]
  }
  @scala.inline
  implicit class SpeakerLabelsResultOps[Self <: SpeakerLabelsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinal_results(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeaker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

