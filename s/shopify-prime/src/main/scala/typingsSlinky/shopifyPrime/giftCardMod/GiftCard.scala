package typingsSlinky.shopifyPrime.giftCardMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCard extends ShopifyObject {
  /**
    * A unique numeric identifier of the application that issued the gift card (if it was issued by an application).
    */
  var api_client_id: js.UndefOr[Double] = js.native
  /**
    * The balance of the gift card.
    */
  var balance: js.UndefOr[Double] = js.native
  /**
    * The gift card code which consists of a minimum of 8 alphanumeric characters. For security reasons, this is only available upon creation of the gift card.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[js.Date] = js.native
  /**
    * The currency of the gift card.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was disabled. The API returns this value in ISO 8601 format.
    */
  var disabled_at: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the gift card expires. The format must be YYYY-MM-DD.
    */
  var expires_on: js.UndefOr[js.Date] = js.native
  /**
    * Initial card value
    */
  var initial_value: js.UndefOr[Double] = js.native
  /**
    * The last four characters of the gift card code.
    */
  var last_characters: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier of the line_item that caused the creation of this gift card (if it was created by an order).
    */
  var line_item_id: js.UndefOr[Double] = js.native
  /**
    * Because gift cards are alternate payment methods, the gift card code is masked the same way a credit card would be.
    */
  var masked_code: js.UndefOr[String] = js.native
  /**
    * The text of an optional note that a shop owner can attach to the gift card. Not visible to merchants.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier of the order that caused the creation of this gift card (if it was created by an order).
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * When specified, the gift card will be rendered using gift_card.SUFFIX.liquid instead of gift_card.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[js.Date] = js.native
  /**
    * A unique numeric identifier of the user that issued the gift card (if it was issued by a user).
    */
  var user_id: js.UndefOr[Double] = js.native
}

object GiftCard {
  @scala.inline
  def apply(): GiftCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GiftCard]
  }
  @scala.inline
  implicit class GiftCardOps[Self <: GiftCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_client_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_client_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled_at(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_at")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires_on(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_on")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_value")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_characters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_characters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_characters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_characters")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_item_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_item_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_item_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMasked_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masked_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasked_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masked_code")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

