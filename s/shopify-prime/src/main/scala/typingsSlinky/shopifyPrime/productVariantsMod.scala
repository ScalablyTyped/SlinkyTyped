package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.productVariantMod.ProductVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/product_variants", JSImport.Namespace)
@js.native
object productVariantsMod extends js.Object {
  
  @js.native
  class ProductVariants protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Counts the variants on the given product.
      * @param productId Id of the product that the variants belong to.
      */
    def count(productId: Double): js.Promise[Double] = js.native
    
    /**
      * Deletes the variant with the given variantId.
      * @param productId Id of the product that the varaint belongs to.
      * @param variantId Id of the variant to delete.
      */
    def delete(productId: Double, variantId: Double): js.Promise[Unit] = js.native
    
    /**
      * Gets a variant with the given id.
      * @param id Id of the variant being retrieved.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[ProductVariant] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[ProductVariant] = js.native
    
    /**
      * Lists up to 250 variants for the given product.
      * @param productId Id of the product that the variants belong to.
      * @param options Options for filtering the results.
      */
    def list(productId: Double): js.Promise[ProductVariant] = js.native
    def list(productId: Double, options: FieldOptions): js.Promise[ProductVariant] = js.native
    
    /**
      * Updates an variant with the given id.
      * @param id Id of the variant.
      * @param productVariant The updated variant.
      */
    def update(id: Double, variant: ProductVariant): js.Promise[ProductVariant] = js.native
  }
  
  @js.native
  class default protected () extends ProductVariants {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
