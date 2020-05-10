package typingsSlinky.stripe.mod.issuing.cardholders

import typingsSlinky.stripe.AnonAddressICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderCreateOptions extends ICardholderUpdateOptions {
  /**
    * The cardholder’s billing address.
    */
  @JSName("billing")
  var billing_ICardholderCreateOptions: AnonAddressICardholderBillingAddress = js.native
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String = js.native
  /**
    * The type of cardholder. Possible values are individual or business_entity.
    */
  var `type`: CardholderType = js.native
}

object ICardholderCreateOptions {
  @scala.inline
  def apply(billing: AnonAddressICardholderBillingAddress, name: String, `type`: CardholderType): ICardholderCreateOptions = {
    val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderCreateOptions]
  }
  @scala.inline
  implicit class ICardholderCreateOptionsOps[Self <: ICardholderCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling(value: AnonAddressICardholderBillingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CardholderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

