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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount_id(value: String): Self = this.set("account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalancesVarargs(value: BalanceLine[AssetType]*): Self = this.set("balances", js.Array(value :_*))
    
    @scala.inline
    def setBalances(value: js.Array[BalanceLine[AssetType]]): Self = this.set("balances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Flags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = this.set("paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignersVarargs(value: AccountSigner*): Self = this.set("signers", js.Array(value :_*))
    
    @scala.inline
    def setSigners(value: js.Array[AccountSigner]): Self = this.set("signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubentry_count(value: Double): Self = this.set("subentry_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholds(value: AccountThresholds): Self = this.set("thresholds", value.asInstanceOf[js.Any])
  }
}
