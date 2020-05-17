package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarBase.mod.AssetType.credit12
import typingsSlinky.stellarBase.mod.AssetType.credit4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalanceLineAsset[T /* <: credit4 | credit12 */]
  extends BalanceLine[js.Any] {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: T = js.native
  var balance: String = js.native
  var buying_liabilities: String = js.native
  var last_modified_ledger: Double = js.native
  var limit: String = js.native
  var selling_liabilities: String = js.native
}

object BalanceLineAsset {
  @scala.inline
  def apply[T](
    asset_code: String,
    asset_issuer: String,
    asset_type: T,
    balance: String,
    buying_liabilities: String,
    last_modified_ledger: Double,
    limit: String,
    selling_liabilities: String
  ): BalanceLineAsset[T] = {
    val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceLineAsset[T]]
  }
  @scala.inline
  implicit class BalanceLineAssetOps[Self[t] <: BalanceLineAsset[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAsset_code(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_issuer(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_type(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuying_liabilities(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_liabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_modified_ledger(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_modified_ledger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling_liabilities(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_liabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

