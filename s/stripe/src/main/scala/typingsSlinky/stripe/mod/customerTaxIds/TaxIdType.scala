package typingsSlinky.stripe.mod.customerTaxIds

import typingsSlinky.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.au_abn
  - typingsSlinky.stripe.stripeStrings.eu_vat
  - typingsSlinky.stripe.stripeStrings.in_gst
  - typingsSlinky.stripe.stripeStrings.no_vat
  - typingsSlinky.stripe.stripeStrings.nz_gst
  - typingsSlinky.stripe.stripeStrings.unknown_
*/
trait TaxIdType extends js.Object

object TaxIdType {
  @scala.inline
  def au_abn: typingsSlinky.stripe.stripeStrings.au_abn = this.cast("au_abn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eu_vat: typingsSlinky.stripe.stripeStrings.eu_vat = this.cast("eu_vat")
  @scala.inline
  def in_gst: typingsSlinky.stripe.stripeStrings.in_gst = this.cast("in_gst")
  @scala.inline
  def no_vat: typingsSlinky.stripe.stripeStrings.no_vat = this.cast("no_vat")
  @scala.inline
  def nz_gst: typingsSlinky.stripe.stripeStrings.nz_gst = this.cast("nz_gst")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

