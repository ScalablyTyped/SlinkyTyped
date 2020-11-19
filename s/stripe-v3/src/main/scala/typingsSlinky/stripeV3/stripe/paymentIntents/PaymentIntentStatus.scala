package typingsSlinky.stripeV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method
  - typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation
  - typingsSlinky.stripeV3.stripeV3Strings.requires_action
  - typingsSlinky.stripeV3.stripeV3Strings.processing
  - typingsSlinky.stripeV3.stripeV3Strings.requires_capture
  - typingsSlinky.stripeV3.stripeV3Strings.canceled
  - typingsSlinky.stripeV3.stripeV3Strings.succeeded
*/
trait PaymentIntentStatus extends js.Object
object PaymentIntentStatus {
  
  @scala.inline
  def canceled: typingsSlinky.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.canceled]
  
  @scala.inline
  def processing: typingsSlinky.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.processing]
  
  @scala.inline
  def requires_action: typingsSlinky.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_action]
  
  @scala.inline
  def requires_capture: typingsSlinky.stripeV3.stripeV3Strings.requires_capture = "requires_capture".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_capture]
  
  @scala.inline
  def requires_confirmation: typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation]
  
  @scala.inline
  def requires_payment_method: typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method]
  
  @scala.inline
  def succeeded: typingsSlinky.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.succeeded]
}
