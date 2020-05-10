package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonAdminResponseForReview extends js.Object {
  var enumValues: AnonAdminResponseForReview = js.native
}

object AnonEnumValuesAnonAdminResponseForReview {
  @scala.inline
  def apply(enumValues: AnonAdminResponseForReview): AnonEnumValuesAnonAdminResponseForReview = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonAdminResponseForReview]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonAdminResponseForReviewOps[Self <: AnonEnumValuesAnonAdminResponseForReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonAdminResponseForReview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

