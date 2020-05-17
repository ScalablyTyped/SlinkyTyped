package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesFilterEmptyReviews extends js.Object {
  var enumValues: FilterEmptyReviews = js.native
}

object EnumValuesFilterEmptyReviews {
  @scala.inline
  def apply(enumValues: FilterEmptyReviews): EnumValuesFilterEmptyReviews = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFilterEmptyReviews]
  }
  @scala.inline
  implicit class EnumValuesFilterEmptyReviewsOps[Self <: EnumValuesFilterEmptyReviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: FilterEmptyReviews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

