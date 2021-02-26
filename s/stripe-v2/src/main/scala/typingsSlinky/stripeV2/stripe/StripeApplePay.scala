package typingsSlinky.stripeV2.stripe

import typingsSlinky.stripeV2.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeApplePay extends StObject {
  
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ],
    onErrorHanlder: js.Function1[/* error */ Message, Unit]
  ): js.Any = js.native
  
  def checkAvailability(resopnseHandler: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
}
object StripeApplePay {
  
  @scala.inline
  def apply(
    buildSession: (StripeApplePayPaymentRequest, js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ], js.Function1[/* error */ Message, Unit]) => js.Any,
    checkAvailability: js.Function1[/* result */ Boolean, Unit] => Unit
  ): StripeApplePay = {
    val __obj = js.Dynamic.literal(buildSession = js.Any.fromFunction3(buildSession), checkAvailability = js.Any.fromFunction1(checkAvailability))
    __obj.asInstanceOf[StripeApplePay]
  }
  
  @scala.inline
  implicit class StripeApplePayMutableBuilder[Self <: StripeApplePay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildSession(
      value: (StripeApplePayPaymentRequest, js.Function2[
          /* result */ StripeApplePaySessionResult, 
          /* completion */ js.Function1[/* value */ js.Any, Unit], 
          Unit
        ], js.Function1[/* error */ Message, Unit]) => js.Any
    ): Self = StObject.set(x, "buildSession", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheckAvailability(value: js.Function1[/* result */ Boolean, Unit] => Unit): Self = StObject.set(x, "checkAvailability", js.Any.fromFunction1(value))
  }
}
