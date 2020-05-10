package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarBase.mod.AssetType.native
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalanceLineNative extends js.Object {
  var asset_type: native = js.native
  var balance: String = js.native
  var buying_liabilities: String = js.native
  var selling_liabilities: String = js.native
}

object BalanceLineNative {
  @scala.inline
  def apply(asset_type: native, balance: String, buying_liabilities: String, selling_liabilities: String): BalanceLineNative = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceLineNative]
  }
  @scala.inline
  implicit class BalanceLineNativeOps[Self <: BalanceLineNative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset_type(value: native): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuying_liabilities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_liabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling_liabilities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_liabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

