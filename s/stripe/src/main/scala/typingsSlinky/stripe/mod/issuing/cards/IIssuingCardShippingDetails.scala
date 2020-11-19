package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.delivered
import typingsSlinky.stripe.stripeStrings.failure
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.returned
import typingsSlinky.stripe.stripeStrings.shipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIssuingCardShippingDetails extends IIssuingCardShippingAddress {
  
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: String = js.native
  
  /**
    * A unix timestamp representing a best estimate of when the card will be delivered.
    */
  var eta: Double = js.native
  
  /**
    * The delivery status of the card. One of pending, shipped, delivered, returned, failure, or canceled.
    */
  var status: pending | shipped | delivered | returned | failure | canceled = js.native
  
  /**
    * A tracking number for a card shipment.
    */
  var tracking_number: String = js.native
  
  /**
    * A link to the shipping carrier’s site where you can view detailed information about a card shipment.
    */
  var tracking_url: String = js.native
}
object IIssuingCardShippingDetails {
  
  @scala.inline
  def apply(
    address: ICardholderBillingAddress,
    carrier: String,
    eta: Double,
    name: String,
    status: pending | shipped | delivered | returned | failure | canceled,
    tracking_number: String,
    tracking_url: String
  ): IIssuingCardShippingDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_url = tracking_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardShippingDetails]
  }
  
  @scala.inline
  implicit class IIssuingCardShippingDetailsOps[Self <: IIssuingCardShippingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEta(value: Double): Self = this.set("eta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | shipped | delivered | returned | failure | canceled): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_number(value: String): Self = this.set("tracking_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_url(value: String): Self = this.set("tracking_url", value.asInstanceOf[js.Any])
  }
}
