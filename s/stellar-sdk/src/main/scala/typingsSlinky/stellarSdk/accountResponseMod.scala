package typingsSlinky.stellarSdk

import typingsSlinky.std.Record
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.anon.Value
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.AccountThresholds
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BalanceLine
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.Flags
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CallFunctionTemplateOptions
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.EffectRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OfferRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OperationRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.PaymentOperationRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.TradeRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountResponseMod {
  
  @JSImport("stellar-sdk/lib/account_response", "AccountResponse")
  @js.native
  class AccountResponse protected () extends StObject {
    def this(response: AccountRecord) = this()
    
    val _baseAccount: js.Any = js.native
    
    def accountId(): String = js.native
    
    val account_id: String = js.native
    
    val balances: js.Array[BalanceLine[AssetType]] = js.native
    
    def data(options: Value): js.Promise[Value] = js.native
    
    val data_attr: Record[String, String] = js.native
    
    def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
    
    val flags: Flags = js.native
    
    val home_domain: js.UndefOr[String] = js.native
    
    val id: String = js.native
    
    def incrementSequenceNumber(): Unit = js.native
    
    val inflation_destination: js.UndefOr[String] = js.native
    
    val last_modified_ledger: Double = js.native
    
    def offers(): js.Promise[CollectionPage[OfferRecord]] = js.native
    def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OfferRecord]] = js.native
    
    def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
    
    val paging_token: String = js.native
    
    def payments(): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    
    var sequence: String = js.native
    
    def sequenceNumber(): String = js.native
    
    val signers: js.Array[AccountRecordSigners] = js.native
    
    val subentry_count: Double = js.native
    
    val thresholds: AccountThresholds = js.native
    
    def trades(): js.Promise[CollectionPage[TradeRecord]] = js.native
    def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TradeRecord]] = js.native
  }
}
