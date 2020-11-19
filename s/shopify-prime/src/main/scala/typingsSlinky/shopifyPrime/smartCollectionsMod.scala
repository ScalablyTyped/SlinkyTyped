package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.anon.titlestringundefinedprodu
import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.optionsProductCollectionMod.CollectionListOptions
import typingsSlinky.shopifyPrime.productCollectionMod.SmartCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/smart_collections", JSImport.Namespace)
@js.native
object smartCollectionsMod extends js.Object {
  
  @js.native
  class SmartCollections protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Get a count of all smart collections that contain a given product
      * @param options Options for filtering the results.
      * @see https://help.shopify.com/api/reference/smartcollection#count
      */
    def count(): js.Promise[Double] = js.native
    def count(options: titlestringundefinedprodu): js.Promise[Double] = js.native
    
    /**
      * Create a new smart collection.
      * @param collection The collection being created.
      * @param options Options for creating the collection.
      */
    def create(collection: SmartCollection): js.Promise[SmartCollection] = js.native
    
    /**
      * Deletes an collection with the given id.
      * @param id The collection's id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Get a single collection
      * @param id The collection's id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[SmartCollection] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[SmartCollection] = js.native
    
    /**
      * Get a list of all smart collections that contain a given product
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[SmartCollection]] = js.native
    def list(options: CollectionListOptions): js.Promise[js.Array[SmartCollection]] = js.native
    
    /**
      * Updates an collection with the given id.
      * @param id The collection's id.
      * @param collection The updated collection.
      */
    def update(id: Double, collection: SmartCollection): js.Promise[SmartCollection] = js.native
  }
  
  @js.native
  class default protected () extends SmartCollections {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
