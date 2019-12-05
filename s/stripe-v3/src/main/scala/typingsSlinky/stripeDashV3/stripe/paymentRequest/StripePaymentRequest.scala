package typingsSlinky.stripeDashV3.stripe.paymentRequest

import typingsSlinky.stripeDashV3.Anon_ApplePay
import typingsSlinky.stripeDashV3.Anon_Options
import typingsSlinky.stripeDashV3.Anon_OptionsShippingOption
import typingsSlinky.stripeDashV3.stripeDashV3Strings.cancel
import typingsSlinky.stripeDashV3.stripeDashV3Strings.paymentmethod
import typingsSlinky.stripeDashV3.stripeDashV3Strings.shippingaddresschange
import typingsSlinky.stripeDashV3.stripeDashV3Strings.shippingoptionchange
import typingsSlinky.stripeDashV3.stripeDashV3Strings.source
import typingsSlinky.stripeDashV3.stripeDashV3Strings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequest extends js.Object {
  def canMakePayment(): js.Promise[Anon_ApplePay | Null] = js.native
  @JSName("on")
  def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_paymentmethod(
    event: paymentmethod,
    handler: js.Function1[/* response */ StripePaymentMethodPaymentResponse, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_shippingaddresschange(event: shippingaddresschange, handler: js.Function1[/* response */ Anon_Options, Unit]): Unit = js.native
  @JSName("on")
  def on_shippingoptionchange(
    event: shippingoptionchange,
    handler: js.Function1[/* response */ Anon_OptionsShippingOption, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_source(event: source, handler: js.Function1[/* response */ StripeSourcePaymentResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_token(event: token, handler: js.Function1[/* response */ StripeTokenPaymentResponse, Unit]): Unit = js.native
  def show(): Unit = js.native
  def update(options: StripePaymentRequestUpdateOptions): Unit = js.native
}

