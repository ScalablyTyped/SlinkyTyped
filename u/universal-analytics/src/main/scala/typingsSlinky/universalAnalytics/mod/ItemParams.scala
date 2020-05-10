package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Item Code
    *
    * Specifies the SKU or item code.
    *
    * Max length: 500 Bytes
    *
    * Example value: `SKU47`
    */
  var ic: js.UndefOr[String] = js.native
  /**
    * Item Name
    *
    * **Required for item hit type.**
    *
    * Specifies the item name.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Shoe`
    */
  var in: js.UndefOr[String] = js.native
  /**
    * Item Price
    *
    * Specifies the price for a single item / unit.
    *
    * Example value: `3.50`
    */
  var ip: js.UndefOr[String | Double] = js.native
  /**
    * Item Quantity
    *
    * Specifies the number of items purchased.
    *
    * Example value: `4`
    */
  var iq: js.UndefOr[String | Double] = js.native
  /**
    * Item Category
    *
    * Specifies the category that the item belongs to.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Blue`
    */
  var iv: js.UndefOr[String] = js.native
  var p: js.UndefOr[String] = js.native
  /**
    * Transaction ID
    *
    * **Required for item hit type.**
    *
    * A unique identifier for the transaction. This value should be the same for both the Transaction
    * hit and Items hits associated to the particular transaction.
    *
    * Max length: 500 Bytes
    *
    * Example value: `OD564`
    */
  var ti: js.UndefOr[String] = js.native
}

object ItemParams {
  @scala.inline
  def apply(): ItemParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemParams]
  }
  @scala.inline
  implicit class ItemParamsOps[Self <: ItemParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ic")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIq(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq")(js.undefined)
        ret
    }
    @scala.inline
    def withIv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withTi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ti")(js.undefined)
        ret
    }
  }
  
}

