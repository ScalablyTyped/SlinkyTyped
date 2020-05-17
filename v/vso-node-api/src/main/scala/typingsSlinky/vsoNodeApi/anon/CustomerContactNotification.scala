package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerContactNotification extends js.Object {
  var customerContactNotification: scala.Double = js.native
  var publisherMemberUpdateNotification: scala.Double = js.native
  var qnaNotification: scala.Double = js.native
  var reviewNotification: scala.Double = js.native
}

object CustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: scala.Double,
    publisherMemberUpdateNotification: scala.Double,
    qnaNotification: scala.Double,
    reviewNotification: scala.Double
  ): CustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerContactNotification]
  }
  @scala.inline
  implicit class CustomerContactNotificationOps[Self <: CustomerContactNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerContactNotification(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerContactNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherMemberUpdateNotification(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherMemberUpdateNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnaNotification(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnaNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewNotification(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewNotification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

