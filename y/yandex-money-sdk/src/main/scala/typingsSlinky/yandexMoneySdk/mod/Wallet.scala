package typingsSlinky.yandexMoneySdk.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.AccountInfoResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferAcceptResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferRejectResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.OperationDetailsResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryOptions
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentOptions
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentOptions
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet.SendAuthenticatedRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wallet extends js.Object {
  def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit = js.native
  def incomingTransferAccept(
    operation_id: String,
    protectionCode: String,
    callback: ResponseCallback[IncomingTransferAcceptResult]
  ): Unit = js.native
  def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit = js.native
  def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit = js.native
  def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit = js.native
  def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit = js.native
  def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit = js.native
  def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit = js.native
}

@JSImport("yandex-money-sdk", "Wallet")
@js.native
object Wallet extends TopLevel[WalletStatic]

