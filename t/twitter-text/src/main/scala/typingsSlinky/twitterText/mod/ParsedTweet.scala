package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedTweet extends js.Object {
  var displayRangeEnd: Double = js.native
  var displayRangeStart: Double = js.native
  var permillage: Double = js.native
  var valid: Boolean = js.native
  var validRangeEnd: Double = js.native
  var validRangeStart: Double = js.native
  var weightedLength: Double = js.native
}

object ParsedTweet {
  @scala.inline
  def apply(
    displayRangeEnd: Double,
    displayRangeStart: Double,
    permillage: Double,
    valid: Boolean,
    validRangeEnd: Double,
    validRangeStart: Double,
    weightedLength: Double
  ): ParsedTweet = {
    val __obj = js.Dynamic.literal(displayRangeEnd = displayRangeEnd.asInstanceOf[js.Any], displayRangeStart = displayRangeStart.asInstanceOf[js.Any], permillage = permillage.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validRangeEnd = validRangeEnd.asInstanceOf[js.Any], validRangeStart = validRangeStart.asInstanceOf[js.Any], weightedLength = weightedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTweet]
  }
  @scala.inline
  implicit class ParsedTweetOps[Self <: ParsedTweet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermillage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permillage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightedLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

