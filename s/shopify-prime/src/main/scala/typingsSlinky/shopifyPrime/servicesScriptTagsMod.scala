package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.DateOptions
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.optionsBaseMod.ListOptions
import typingsSlinky.shopifyPrime.scriptTagMod.ScriptTag
import typingsSlinky.shopifyPrime.scriptTagsMod.ScriptTagOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/script_tags", JSImport.Namespace)
@js.native
object servicesScriptTagsMod extends js.Object {
  
  @js.native
  class ScriptTags protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Gets a count of all of the shop's script tags.
      * @param options Options for filtering the results.
      */
    def count(): js.Promise[Double] = js.native
    def count(options: ScriptTagOptions): js.Promise[Double] = js.native
    
    /**
      * Creates a new script tag.
      */
    def create(tag: ScriptTag): js.Promise[ScriptTag] = js.native
    
    /**
      * Deletes the script tag with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Retrieves the script tag with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[ScriptTag] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[ScriptTag] = js.native
    
    /**
      * Gets a list of up to 250 of the shop's script tags.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[ScriptTag]] = js.native
    def list(options: ScriptTagOptions with ListOptions with DateOptions with FieldOptions): js.Promise[js.Array[ScriptTag]] = js.native
    
    /**
      * Updates the script tag with the given id.
      * @param tag The updated script tag.
      */
    def update(id: Double, tag: ScriptTag): js.Promise[ScriptTag] = js.native
  }
  
  @js.native
  class default protected () extends ScriptTags {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
