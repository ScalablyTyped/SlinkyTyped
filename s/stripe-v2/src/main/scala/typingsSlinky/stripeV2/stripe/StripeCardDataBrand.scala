package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV2.stripeV2Strings.Visa
  - typingsSlinky.stripeV2.stripeV2Strings.`American Express`
  - typingsSlinky.stripeV2.stripeV2Strings.MasterCard
  - typingsSlinky.stripeV2.stripeV2Strings.Discover
  - typingsSlinky.stripeV2.stripeV2Strings.JCB
  - typingsSlinky.stripeV2.stripeV2Strings.`Diners Club`
  - typingsSlinky.stripeV2.stripeV2Strings.Unknown
*/
trait StripeCardDataBrand extends js.Object

object StripeCardDataBrand {
  @scala.inline
  def `American Express`: typingsSlinky.stripeV2.stripeV2Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typingsSlinky.stripeV2.stripeV2Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typingsSlinky.stripeV2.stripeV2Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typingsSlinky.stripeV2.stripeV2Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typingsSlinky.stripeV2.stripeV2Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typingsSlinky.stripeV2.stripeV2Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typingsSlinky.stripeV2.stripeV2Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

