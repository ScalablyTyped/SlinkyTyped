package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is returned after a user selects a payment method and approves a payment request. */
@js.native
trait PaymentResponse extends js.Object {
  
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  val details: js.Any = js.native
  
  val methodName: java.lang.String = js.native
  
  val payerEmail: java.lang.String | Null = js.native
  
  val payerName: java.lang.String | Null = js.native
  
  val payerPhone: java.lang.String | Null = js.native
  
  val requestId: java.lang.String = js.native
  
  val shippingAddress: PaymentAddress | Null = js.native
  
  val shippingOption: java.lang.String | Null = js.native
  
  def toJSON(): js.Any = js.native
}
