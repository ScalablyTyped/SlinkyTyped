package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.optionsBaseMod.ListOptions
import typingsSlinky.shopifyPrime.redirectMod.Redirect
import typingsSlinky.shopifyPrime.redirectsMod.RedirectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/redirects", JSImport.Namespace)
@js.native
object servicesRedirectsMod extends js.Object {
  
  @js.native
  class Redirects protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Gets a count of all of the shop's redirects.
      * @param options Options for filtering the results.
      */
    def count(): js.Promise[Double] = js.native
    def count(options: RedirectOptions): js.Promise[Double] = js.native
    
    /**
      * Creates a new redirect.
      */
    def create(redirect: Redirect): js.Promise[Redirect] = js.native
    
    /**
      * Deletes the redirect with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Retrieves the redirect with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[Redirect] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Redirect] = js.native
    
    /**
      * Gets a list of up to 250 of the shop's redirects.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Redirect]] = js.native
    def list(options: RedirectOptions with ListOptions with FieldOptions): js.Promise[js.Array[Redirect]] = js.native
    
    /**
      * Updates the redirect with the given id.
      * @param tag The updated redirect.
      */
    def update(id: Double, redirect: Redirect): js.Promise[Redirect] = js.native
  }
  
  @js.native
  class default protected () extends Redirects {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
