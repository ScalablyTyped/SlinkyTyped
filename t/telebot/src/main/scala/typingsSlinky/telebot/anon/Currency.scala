package typingsSlinky.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  var currency: String = js.native
  var description: String = js.native
  var isFlexible: js.UndefOr[Boolean] = js.native
  var need: js.UndefOr[Email] = js.native
  var notification: js.UndefOr[Boolean] = js.native
  var payload: String = js.native
  var photo: js.UndefOr[Url] = js.native
  var prices: js.Array[_] = js.native
  var providerToken: String = js.native
  var replyMarkup: js.UndefOr[js.Any] = js.native
  var replyToMessage: js.UndefOr[Double] = js.native
  var startParameter: String = js.native
  var title: String = js.native
}

object Currency {
  @scala.inline
  def apply(
    currency: String,
    description: String,
    payload: String,
    prices: js.Array[_],
    providerToken: String,
    startParameter: String,
    title: String
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], startParameter = startParameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlexible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlexible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFlexible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlexible")(js.undefined)
        ret
    }
    @scala.inline
    def withNeed(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyMarkup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToMessage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToMessage")(js.undefined)
        ret
    }
  }
  
}

