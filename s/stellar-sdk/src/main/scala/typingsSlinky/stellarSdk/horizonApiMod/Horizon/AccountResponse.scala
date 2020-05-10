package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.stellarSdkStrings.data
import typingsSlinky.stellarSdk.stellarSdkStrings.effects
import typingsSlinky.stellarSdk.stellarSdkStrings.offers
import typingsSlinky.stellarSdk.stellarSdkStrings.operations
import typingsSlinky.stellarSdk.stellarSdkStrings.payments
import typingsSlinky.stellarSdk.stellarSdkStrings.trades
import typingsSlinky.stellarSdk.stellarSdkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountResponse extends BaseResponse[transactions | operations | payments | effects | offers | trades | data] {
  var account_id: String = js.native
  var balances: js.Array[BalanceLine[AssetType]] = js.native
  var data: StringDictionary[String] = js.native
  var flags: Flags = js.native
  var id: String = js.native
  var paging_token: String = js.native
  var sequence: String = js.native
  var signers: js.Array[AccountSigner] = js.native
  var subentry_count: Double = js.native
  var thresholds: AccountThresholds = js.native
}

object AccountResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    account_id: String,
    balances: js.Array[BalanceLine[AssetType]],
    data: StringDictionary[String],
    flags: Flags,
    id: String,
    paging_token: String,
    sequence: String,
    signers: js.Array[AccountSigner],
    subentry_count: Double,
    thresholds: AccountThresholds
  ): AccountResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account_id = account_id.asInstanceOf[js.Any], balances = balances.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], subentry_count = subentry_count.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountResponse]
  }
  @scala.inline
  implicit class AccountResponseOps[Self <: AccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalances(value: js.Array[BalanceLine[AssetType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Flags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigners(value: js.Array[AccountSigner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubentry_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subentry_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholds(value: AccountThresholds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

