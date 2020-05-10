package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomerContactNotification extends js.Object {
  var customerContactNotification: Double = js.native
  var publisherMemberUpdateNotification: Double = js.native
  var qnaNotification: Double = js.native
  var reviewNotification: Double = js.native
}

object AnonCustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: Double,
    publisherMemberUpdateNotification: Double,
    qnaNotification: Double,
    reviewNotification: Double
  ): AnonCustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomerContactNotification]
  }
  @scala.inline
  implicit class AnonCustomerContactNotificationOps[Self <: AnonCustomerContactNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerContactNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerContactNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherMemberUpdateNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherMemberUpdateNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnaNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnaNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewNotification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

