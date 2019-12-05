package typingsSlinky.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.AccountInfoResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.IncomingTransferAcceptResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.IncomingTransferRejectResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationDetailsResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationHistoryOptions
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationHistoryResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.ProcessPaymentOptions
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.ProcessPaymentResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.RequestPaymentOptions
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.RequestPaymentResult
import typingsSlinky.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.SendAuthenticatedRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wallet extends js.Object {
  def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit
  def incomingTransferAccept(
    operation_id: String,
    protectionCode: String,
    callback: ResponseCallback[IncomingTransferAcceptResult]
  ): Unit
  def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit
  def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit
  def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit
  def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit
  def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit
  def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit
}

@JSImport("yandex-money-sdk", "Wallet")
@js.native
object Wallet extends TopLevel[WalletStatic]

