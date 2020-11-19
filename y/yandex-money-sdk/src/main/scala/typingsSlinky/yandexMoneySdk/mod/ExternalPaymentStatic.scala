package typingsSlinky.yandexMoneySdk.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment.GetInstanceIdResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalPaymentStatic extends Instantiable1[/* instanceId */ String, ExternalPayment] {
  
  def getInstanceId(clientId: String, callback: ResponseCallback[GetInstanceIdResult]): Unit = js.native
}
