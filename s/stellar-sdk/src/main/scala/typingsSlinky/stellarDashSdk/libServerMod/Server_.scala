package typingsSlinky.stellarDashSdk.libServerMod

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType
import typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation
import typingsSlinky.stellarDashBase.stellarDashBaseMod.Transaction
import typingsSlinky.stellarDashSdk.libAccountUnderscoreCallUnderscoreBuilderMod.AccountCallBuilder
import typingsSlinky.stellarDashSdk.libAccountUnderscoreResponseMod.AccountResponse
import typingsSlinky.stellarDashSdk.libAssetsUnderscoreCallUnderscoreBuilderMod.AssetsCallBuilder
import typingsSlinky.stellarDashSdk.libEffectUnderscoreCallUnderscoreBuilderMod.EffectCallBuilder
import typingsSlinky.stellarDashSdk.libFriendbotUnderscoreBuilderMod.FriendbotBuilder
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.FeeStatsResponse
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.SubmitTransactionResponse
import typingsSlinky.stellarDashSdk.libLedgerUnderscoreCallUnderscoreBuilderMod.LedgerCallBuilder
import typingsSlinky.stellarDashSdk.libOfferUnderscoreCallUnderscoreBuilderMod.OfferCallBuilder
import typingsSlinky.stellarDashSdk.libOperationUnderscoreCallUnderscoreBuilderMod.OperationCallBuilder
import typingsSlinky.stellarDashSdk.libOrderbookUnderscoreCallUnderscoreBuilderMod.OrderbookCallBuilder
import typingsSlinky.stellarDashSdk.libPathUnderscoreCallUnderscoreBuilderMod.PathCallBuilder
import typingsSlinky.stellarDashSdk.libPaymentUnderscoreCallUnderscoreBuilderMod.PaymentCallBuilder
import typingsSlinky.stellarDashSdk.libServerMod.Server.Options
import typingsSlinky.stellarDashSdk.libServerMod.Server.Timebounds
import typingsSlinky.stellarDashSdk.libTradeUnderscoreAggregationUnderscoreCallUnderscoreBuilderMod.TradeAggregationCallBuilder
import typingsSlinky.stellarDashSdk.libTradesUnderscoreCallUnderscoreBuilderMod.TradesCallBuilder
import typingsSlinky.stellarDashSdk.libTransactionUnderscoreCallUnderscoreBuilderMod.TransactionCallBuilder
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/server", "Server")
@js.native
class Server_ protected () extends js.Object {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
  val serverURL: URI = js.native
  def accounts(): AccountCallBuilder = js.native
  def assets(): AssetsCallBuilder = js.native
  def effects(): EffectCallBuilder = js.native
  def feeStats(): js.Promise[FeeStatsResponse] = js.native
  def fetchBaseFee(): js.Promise[Double] = js.native
  def fetchTimebounds(seconds: Double): js.Promise[Timebounds] = js.native
  def fetchTimebounds(seconds: Double, _isRetry: Boolean): js.Promise[Timebounds] = js.native
  def friendbot(address: String): FriendbotBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  def offers(resource: String, resourceParams: String*): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  def paths(source: String, destination: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def strictReceivePaths(source: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictReceivePaths(source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]): PathCallBuilder = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[SubmitTransactionResponse] = js.native
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

