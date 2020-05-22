package typingsSlinky.stripe.mod.customerTaxIds

import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.unavailable
import typingsSlinky.stripe.stripeStrings.unverified
import typingsSlinky.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxIdVerification extends js.Object {
  /**
    * Verification status, one of pending, unavailable, unverified, or verified.
    */
  var status: pending | unavailable | unverified | verified
  /**
    * Verified address.
    */
  var verified_address: String
  /**
    * Verified name.
    */
  var verified_name: String
}

object ITaxIdVerification {
  @scala.inline
  def apply(
    status: pending | unavailable | unverified | verified,
    verified_address: String,
    verified_name: String
  ): ITaxIdVerification = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxIdVerification]
  }
}

