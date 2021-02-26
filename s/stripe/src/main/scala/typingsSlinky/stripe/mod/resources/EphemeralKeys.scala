package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.ephemeralKeys.ICustomer
import typingsSlinky.stripe.mod.ephemeralKeys.IEphemeralKey
import typingsSlinky.stripe.mod.ephemeralKeys.IStripeVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.EphemeralKeys")
@js.native
class EphemeralKeys () extends StObject {
  
  def create(customer: ICustomer, stripe_version: IStripeVersion): js.Promise[IEphemeralKey] = js.native
  def create(customer: ICustomer, stripe_version: IStripeVersion, response: IResponseFn[IEphemeralKey]): js.Promise[IEphemeralKey] = js.native
}
