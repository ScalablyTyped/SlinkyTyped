package typingsSlinky.shopifyPrime.giftCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCardOptions extends js.Object {
  /**
    * Field and direction to order results by
    */
  var order: String = js.native
  /**
    * Text to search gift cards
    */
  var query: String = js.native
  /**
    * Restrict results to only enabled/disabled gift cards. Note: This is only usabled
    * with the /admin/gift_cards.json api and not /admin/gift_cards/search.json
    */
  var status: String = js.native
}

object GiftCardOptions {
  @scala.inline
  def apply(order: String, query: String, status: String): GiftCardOptions = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCardOptions]
  }
  @scala.inline
  implicit class GiftCardOptionsOps[Self <: GiftCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

