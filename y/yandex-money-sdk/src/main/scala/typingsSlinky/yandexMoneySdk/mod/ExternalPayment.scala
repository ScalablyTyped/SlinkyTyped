package typingsSlinky.yandexMoneySdk.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessOptions
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessResult
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestOptions
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPayment extends js.Object {
  def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit
  def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit
}

@JSImport("yandex-money-sdk", "ExternalPayment")
@js.native
object ExternalPayment extends TopLevel[ExternalPaymentStatic]

