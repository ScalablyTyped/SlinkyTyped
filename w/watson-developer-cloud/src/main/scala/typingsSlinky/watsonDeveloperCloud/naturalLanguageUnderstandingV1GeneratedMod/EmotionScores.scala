package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EmotionScores. */
@js.native
trait EmotionScores extends js.Object {
  /** Anger score from 0 to 1. A higher score means that the text is more likely to convey anger. */
  var anger: js.UndefOr[Double] = js.native
  /** Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust. */
  var disgust: js.UndefOr[Double] = js.native
  /** Fear score from 0 to 1. A higher score means that the text is more likely to convey fear. */
  var fear: js.UndefOr[Double] = js.native
  /** Joy score from 0 to 1. A higher score means that the text is more likely to convey joy. */
  var joy: js.UndefOr[Double] = js.native
  /** Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness. */
  var sadness: js.UndefOr[Double] = js.native
}

object EmotionScores {
  @scala.inline
  def apply(): EmotionScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionScores]
  }
  @scala.inline
  implicit class EmotionScoresOps[Self <: EmotionScores] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anger")(js.undefined)
        ret
    }
    @scala.inline
    def withDisgust(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disgust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisgust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disgust")(js.undefined)
        ret
    }
    @scala.inline
    def withFear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fear")(js.undefined)
        ret
    }
    @scala.inline
    def withJoy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joy")(js.undefined)
        ret
    }
    @scala.inline
    def withSadness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sadness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSadness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sadness")(js.undefined)
        ret
    }
  }
  
}

