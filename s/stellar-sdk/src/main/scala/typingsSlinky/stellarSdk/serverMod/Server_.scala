package typingsSlinky.stellarSdk.serverMod

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod.FeeBumpTransaction
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.mod.Transaction
import typingsSlinky.stellarSdk.accountCallBuilderMod.AccountCallBuilder
import typingsSlinky.stellarSdk.accountResponseMod.AccountResponse
import typingsSlinky.stellarSdk.assetsCallBuilderMod.AssetsCallBuilder
import typingsSlinky.stellarSdk.claimableBalancesCallBuilderMod.ClaimableBalanceCallBuilder
import typingsSlinky.stellarSdk.effectCallBuilderMod.EffectCallBuilder
import typingsSlinky.stellarSdk.friendbotBuilderMod.FriendbotBuilder
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.SubmitTransactionResponse
import typingsSlinky.stellarSdk.ledgerCallBuilderMod.LedgerCallBuilder
import typingsSlinky.stellarSdk.offerCallBuilderMod.OfferCallBuilder
import typingsSlinky.stellarSdk.operationCallBuilderMod.OperationCallBuilder
import typingsSlinky.stellarSdk.orderbookCallBuilderMod.OrderbookCallBuilder
import typingsSlinky.stellarSdk.pathCallBuilderMod.PathCallBuilder
import typingsSlinky.stellarSdk.paymentCallBuilderMod.PaymentCallBuilder
import typingsSlinky.stellarSdk.serverMod.Server.Options
import typingsSlinky.stellarSdk.serverMod.Server.SubmitTransactionOptions
import typingsSlinky.stellarSdk.serverMod.Server.Timebounds
import typingsSlinky.stellarSdk.tradeAggregationCallBuilderMod.TradeAggregationCallBuilder
import typingsSlinky.stellarSdk.tradesCallBuilderMod.TradesCallBuilder
import typingsSlinky.stellarSdk.transactionCallBuilderMod.TransactionCallBuilder
import typingsSlinky.urijs.mod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/server", "Server")
@js.native
class Server_ protected () extends js.Object {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
  
  def accounts(): AccountCallBuilder = js.native
  
  def assets(): AssetsCallBuilder = js.native
  
  def checkMemoRequired(transaction: FeeBumpTransaction): js.Promise[Unit] = js.native
  def checkMemoRequired(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[Unit] = js.native
  
  def claimableBalances(): ClaimableBalanceCallBuilder = js.native
  
  def effects(): EffectCallBuilder = js.native
  
  def feeStats(): js.Promise[FeeStatsResponse] = js.native
  
  def fetchBaseFee(): js.Promise[Double] = js.native
  
  def fetchTimebounds(seconds: Double): js.Promise[Timebounds] = js.native
  def fetchTimebounds(seconds: Double, _isRetry: Boolean): js.Promise[Timebounds] = js.native
  
  def friendbot(address: String): FriendbotBuilder = js.native
  
  def ledgers(): LedgerCallBuilder = js.native
  
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  
  def offers(): OfferCallBuilder = js.native
  
  def operations(): OperationCallBuilder = js.native
  
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  
  def payments(): PaymentCallBuilder = js.native
  
  val serverURL: URI = js.native
  
  def strictReceivePaths(source: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictReceivePaths(source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]): PathCallBuilder = js.native
  
  def submitTransaction(transaction: FeeBumpTransaction): js.Promise[SubmitTransactionResponse] = js.native
  def submitTransaction(transaction: FeeBumpTransaction, opts: SubmitTransactionOptions): js.Promise[SubmitTransactionResponse] = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[SubmitTransactionResponse] = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]], opts: SubmitTransactionOptions): js.Promise[SubmitTransactionResponse] = js.native
  
  def tradeAggregation(
    base: Asset,
    counter: Asset,
    start_time: Double,
    end_time: Double,
    resolution: Double,
    offset: Double
  ): TradeAggregationCallBuilder = js.native
  
  def trades(): TradesCallBuilder = js.native
  
  def transactions(): TransactionCallBuilder = js.native
}
