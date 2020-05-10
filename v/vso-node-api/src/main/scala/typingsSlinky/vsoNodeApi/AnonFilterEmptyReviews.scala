package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterEmptyReviews extends js.Object {
  var filterEmptyReviews: Double = js.native
  var filterEmptyUserNames: Double = js.native
  var none: Double = js.native
}

object AnonFilterEmptyReviews {
  @scala.inline
  def apply(filterEmptyReviews: Double, filterEmptyUserNames: Double, none: Double): AnonFilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterEmptyReviews]
  }
  @scala.inline
  implicit class AnonFilterEmptyReviewsOps[Self <: AnonFilterEmptyReviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterEmptyReviews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEmptyReviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterEmptyUserNames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEmptyUserNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

