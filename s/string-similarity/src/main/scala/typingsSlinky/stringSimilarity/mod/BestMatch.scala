package typingsSlinky.stringSimilarity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BestMatch extends js.Object {
  var bestMatch: Rating = js.native
  var bestMatchIndex: Double = js.native
  var ratings: js.Array[Rating] = js.native
}

object BestMatch {
  @scala.inline
  def apply(bestMatch: Rating, bestMatchIndex: Double, ratings: js.Array[Rating]): BestMatch = {
    val __obj = js.Dynamic.literal(bestMatch = bestMatch.asInstanceOf[js.Any], bestMatchIndex = bestMatchIndex.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestMatch]
  }
  @scala.inline
  implicit class BestMatchOps[Self <: BestMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestMatch(value: Rating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestMatchIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestMatchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatings(value: js.Array[Rating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

