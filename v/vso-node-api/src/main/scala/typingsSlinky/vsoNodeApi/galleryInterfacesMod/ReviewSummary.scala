package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewSummary extends js.Object {
  /**
    * Average Rating
    */
  var averageRating: Double = js.native
  /**
    * Count of total ratings
    */
  var ratingCount: Double = js.native
  /**
    * Split of count accross rating
    */
  var ratingSplit: js.Array[RatingCountPerRating] = js.native
}

object ReviewSummary {
  @scala.inline
  def apply(averageRating: Double, ratingCount: Double, ratingSplit: js.Array[RatingCountPerRating]): ReviewSummary = {
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any], ratingSplit = ratingSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewSummary]
  }
  @scala.inline
  implicit class ReviewSummaryOps[Self <: ReviewSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatingSplit(value: js.Array[RatingCountPerRating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingSplit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

