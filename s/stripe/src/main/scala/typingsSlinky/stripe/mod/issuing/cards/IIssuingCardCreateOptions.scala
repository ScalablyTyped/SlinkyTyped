package typingsSlinky.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an Issuing Card object.
  */
@js.native
trait IIssuingCardCreateOptions extends IIssuingCardUpdateOptions {
  /**
    * The currency for the card. This currently must be usd.
    */
  var currency: String = js.native
  /**
    * The card this is meant to be a replacement for (if any).
    */
  var replacement_for: js.UndefOr[String] = js.native
  /**
    * If replacement_for is specified, this should indicate why that card is being replaced. One of damage, expiration, loss, or theft.
    */
  var replacement_reason: js.UndefOr[IssuingCardReplacementReason] = js.native
  /**
    * The address where the card will be shipped.
    */
  var shipping: js.UndefOr[IIssuingCardShippingAddress] = js.native
  /**
    * The type of card to issue. Possible values are physical or virtual.
    */
  var `type`: IssuingCardType = js.native
}

object IIssuingCardCreateOptions {
  @scala.inline
  def apply(currency: String, `type`: IssuingCardType): IIssuingCardCreateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardCreateOptions]
  }
  @scala.inline
  implicit class IIssuingCardCreateOptionsOps[Self <: IIssuingCardCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IssuingCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement_for(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement_for: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_for")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacement_reason(value: IssuingCardReplacementReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: IIssuingCardShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
  }
  
}

