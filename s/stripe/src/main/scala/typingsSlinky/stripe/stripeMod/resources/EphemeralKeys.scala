package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.ephemeralKeys.ICustomer
import typingsSlinky.stripe.stripeMod.ephemeralKeys.IEphemeralKey
import typingsSlinky.stripe.stripeMod.ephemeralKeys.IStripeVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.EphemeralKeys")
@js.native
class EphemeralKeys () extends js.Object {
  def create(customer: ICustomer, stripe_version: IStripeVersion): js.Promise[IEphemeralKey] = js.native
  def create(customer: ICustomer, stripe_version: IStripeVersion, response: IResponseFn[IEphemeralKey]): js.Promise[IEphemeralKey] = js.native
}

