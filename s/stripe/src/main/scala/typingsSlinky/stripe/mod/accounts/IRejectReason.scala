package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.stripeStrings.fraud
import typingsSlinky.stripe.stripeStrings.other
import typingsSlinky.stripe.stripeStrings.terms_of_service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRejectReason extends js.Object {
  /**
    * The reason for rejecting the account. May be one of "fraud",
    * "terms_of_service", or "other".
    */
  var reason: fraud | terms_of_service | other
}

object IRejectReason {
  @scala.inline
  def apply(reason: fraud | terms_of_service | other): IRejectReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRejectReason]
  }
}

