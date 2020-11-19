package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerRecord
  extends BaseResponse[scala.Nothing] {
  
  var base_fee: Double = js.native
  
  var base_fee_in_stroops: Double = js.native
  
  var base_reserve: String = js.native
  
  var base_reserve_in_stroops: Double = js.native
  
  var closed_at: String = js.native
  
  def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  
  var fee_pool: String = js.native
  
  var hash: String = js.native
  
  var header_xdr: String = js.native
  
  var id: String = js.native
  
  var max_tx_set_size: Double = js.native
  
  var operation_count: Double = js.native
  
  def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  
  var paging_token: String = js.native
  
  var prev_hash: String = js.native
  
  var protocol_version: Double = js.native
  
  def self(): js.Promise[LedgerRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[LedgerRecord] = js.native
  
  var sequence: Double = js.native
  
  var total_coins: String = js.native
  
  var transaction_count: Double = js.native
  
  def transactions(): js.Promise[CollectionPage[TransactionRecord]] = js.native
  def transactions(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TransactionRecord]] = js.native
  @JSName("transactions")
  var transactions_Original: CallCollectionFunction[TransactionRecord] = js.native
  
  var tx_set_operation_count: Double | Null = js.native
}
