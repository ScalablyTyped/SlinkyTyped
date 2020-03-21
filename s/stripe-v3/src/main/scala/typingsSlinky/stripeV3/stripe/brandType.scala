package typingsSlinky.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.Visa
  - typingsSlinky.stripeV3.stripeV3Strings.`American Express`
  - typingsSlinky.stripeV3.stripeV3Strings.MasterCard
  - typingsSlinky.stripeV3.stripeV3Strings.Discover
  - typingsSlinky.stripeV3.stripeV3Strings.JCB
  - typingsSlinky.stripeV3.stripeV3Strings.`Diners Club`
  - typingsSlinky.stripeV3.stripeV3Strings.Unknown
*/
trait brandType extends js.Object

object brandType {
  @scala.inline
  def `American Express`: typingsSlinky.stripeV3.stripeV3Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typingsSlinky.stripeV3.stripeV3Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typingsSlinky.stripeV3.stripeV3Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typingsSlinky.stripeV3.stripeV3Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typingsSlinky.stripeV3.stripeV3Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typingsSlinky.stripeV3.stripeV3Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typingsSlinky.stripeV3.stripeV3Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

