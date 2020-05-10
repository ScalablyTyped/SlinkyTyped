package typingsSlinky.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZXCVBNResult extends js.Object {
  /**
    * how long it took zxcvbn to calculate an answer,
    * in milliseconds.
    */
  var calc_time: Double = js.native
  /**
    * same keys as result.crack_times_seconds,
    * with friendlier display string values:
    * "less than a second", "3 hours", "centuries", etc.
    */
  var crack_times_display: ZXCVBNAttackTime = js.native
  /**
    * dictionary of back-of-the-envelope crack time
    * estimations, in seconds, based on a few scenarios.
    */
  var crack_times_seconds: ZXCVBNAttackTime = js.native
  /**
    * verbal feedback to help choose better passwords. set when score <= 2.
    */
  var feedback: ZXCVBNFeedback = js.native
  /**
    * estimated guesses needed to crack password
    */
  var guesses: Double = js.native
  /**
    * order of magnitude of result.guesses
    */
  var guesses_log10: Double = js.native
  /**
    * Integer from 0-4 (useful for implementing a strength bar):
    * 0 too guessable: risky password. (guesses < 10^3)
    * 1 very guessable: protection from throttled online attacks. (guesses < 10^6)
    * 2 somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
    * 3 safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
    * 4 very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
    */
  var score: ZXCVBNScore = js.native
  /**
    * the list of patterns that zxcvbn based the
    * guess calculation on.
    */
  var sequence: js.Array[ZXCVBNSequence] = js.native
}

object ZXCVBNResult {
  @scala.inline
  def apply(
    calc_time: Double,
    crack_times_display: ZXCVBNAttackTime,
    crack_times_seconds: ZXCVBNAttackTime,
    feedback: ZXCVBNFeedback,
    guesses: Double,
    guesses_log10: Double,
    score: ZXCVBNScore,
    sequence: js.Array[ZXCVBNSequence]
  ): ZXCVBNResult = {
    val __obj = js.Dynamic.literal(calc_time = calc_time.asInstanceOf[js.Any], crack_times_display = crack_times_display.asInstanceOf[js.Any], crack_times_seconds = crack_times_seconds.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZXCVBNResult]
  }
  @scala.inline
  implicit class ZXCVBNResultOps[Self <: ZXCVBNResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalc_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calc_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrack_times_display(value: ZXCVBNAttackTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crack_times_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrack_times_seconds(value: ZXCVBNAttackTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crack_times_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback(value: ZXCVBNFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuesses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuesses_log10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guesses_log10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: ZXCVBNScore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: js.Array[ZXCVBNSequence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

