package typingsSlinky.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionParams
  extends /* key */ StringDictionary[js.Any] {
  var p: js.UndefOr[String] = js.native
  /**
    * Transaction Affiliation
    *
    * Specifies the affiliation or store name.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Member`
    */
  var ta: js.UndefOr[String] = js.native
  /**
    * Transaction ID
    *
    * **Required for transaction hit type.**
    *
    *
    * A unique identifier for the transaction. This value should be the same for both the Transaction
    * hit and Items hits associated to the particular transaction.
    *
    * Max length: 500 Bytes
    *
    * Example value: `OD564`
    */
  var ti: js.UndefOr[String] = js.native
  /**
    * Transaction Revenue
    *
    * Specifies the total revenue associated with the transaction. This value should include any
    * shipping or tax costs.
    *
    * Example value: `15.47`
    */
  var tr: js.UndefOr[String | Double] = js.native
  /**
    * Transaction Shipping
    *
    * Specifies the total shipping cost of the transaction.
    *
    * Example value: `3.50`
    */
  var ts: js.UndefOr[String | Double] = js.native
  /**
    * Transaction Tax
    *
    * Specifies the total tax of the transaction.
    *
    * Example value: `11.20`
    */
  var tt: js.UndefOr[String | Double] = js.native
}

object TransactionParams {
  @scala.inline
  def apply(): TransactionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionParams]
  }
  @scala.inline
  implicit class TransactionParamsOps[Self <: TransactionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ta")(js.undefined)
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
    @scala.inline
    def withTr(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
    @scala.inline
    def withTs(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(js.undefined)
        ret
    }
    @scala.inline
    def withTt(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tt")(js.undefined)
        ret
    }
  }
  
}

