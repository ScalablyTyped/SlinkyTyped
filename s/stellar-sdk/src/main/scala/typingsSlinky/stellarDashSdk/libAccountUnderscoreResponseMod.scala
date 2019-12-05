package typingsSlinky.stellarDashSdk

import typingsSlinky.std.Record
import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.AccountThresholds
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BalanceLine
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.Flags
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AccountRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AccountRecordSigners
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CallFunctionTemplateOptions
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.EffectRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OfferRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OperationRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentOperationRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.TradeRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_response", JSImport.Namespace)
@js.native
object libAccountUnderscoreResponseMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord extends any ? std.Pick<stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, utility-types.utility-types/dist/mapped-types.SetComplement<keyof stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, '_links'>> : never */ @js.native
  class AccountResponse protected () extends js.Object {
    def this(response: AccountRecord) = this()
    val _baseAccount: js.Any = js.native
    val account_id: String = js.native
    val balances: js.Array[BalanceLine[AssetType]] = js.native
    val data_attr: Record[String, String] = js.native
    val flags: Flags = js.native
    val id: String = js.native
    val inflation_destination: String = js.native
    val last_modified_ledger: Double = js.native
    val paging_token: String = js.native
    var sequence: String = js.native
    val signers: js.Array[AccountRecordSigners] = js.native
    val subentry_count: Double = js.native
    val thresholds: AccountThresholds = js.native
    def accountId(): String = js.native
    def data(options: Anon_Value): js.Promise[Anon_Value] = js.native
    def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
    def incrementSequenceNumber(): Unit = js.native
    def offers(): js.Promise[CollectionPage[OfferRecord]] = js.native
    def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OfferRecord]] = js.native
    def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
    def payments(): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def sequenceNumber(): String = js.native
    def trades(): js.Promise[CollectionPage[TradeRecord]] = js.native
    def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TradeRecord]] = js.native
  }
  
}

