package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterEmptyReviews extends js.Object {
  var filterEmptyReviews: scala.Double = js.native
  var filterEmptyUserNames: scala.Double = js.native
  var none: scala.Double = js.native
}

object FilterEmptyReviews {
  @scala.inline
  def apply(filterEmptyReviews: scala.Double, filterEmptyUserNames: scala.Double, none: scala.Double): FilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEmptyReviews]
  }
  @scala.inline
  implicit class FilterEmptyReviewsOps[Self <: FilterEmptyReviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterEmptyReviews(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEmptyReviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterEmptyUserNames(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEmptyUserNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

