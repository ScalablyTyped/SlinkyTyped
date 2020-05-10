package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatingCountPerRating extends js.Object {
  /**
    * Rating value
    */
  var rating: Double = js.native
  /**
    * Count of total ratings
    */
  var ratingCount: Double = js.native
}

object RatingCountPerRating {
  @scala.inline
  def apply(rating: Double, ratingCount: Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingCountPerRating]
  }
  @scala.inline
  implicit class RatingCountPerRatingOps[Self <: RatingCountPerRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

