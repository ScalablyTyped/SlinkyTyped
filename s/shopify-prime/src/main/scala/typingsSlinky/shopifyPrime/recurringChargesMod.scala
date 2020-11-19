package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.infrastructureMod.BaseService
import typingsSlinky.shopifyPrime.optionsBaseMod.DateOptions
import typingsSlinky.shopifyPrime.optionsBaseMod.FieldOptions
import typingsSlinky.shopifyPrime.optionsBaseMod.ListOptions
import typingsSlinky.shopifyPrime.recurringChargeMod.RecurringCharge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-prime/dist/services/recurring_charges", JSImport.Namespace)
@js.native
object recurringChargesMod extends js.Object {
  
  @js.native
  class RecurringCharges protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    
    /**
      * Activates a charge. Can only be activated if the charge's status is "accepted".
      * @param id The id of the charge to activate.
      */
    def activate(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Creates a new charge.
      */
    def create(charge: RecurringCharge): js.Promise[RecurringCharge] = js.native
    
    /**
      * Deletes a charge.
      * @param id The id of the charge to delete.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Gets a charge with the given id.
      * @param id The id of the charge to get.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[RecurringCharge] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[RecurringCharge] = js.native
    
    /**
      * Retrieves a list of all past and present charges.
      * @param options Options for filtering the result.
      */
    def list(): js.Promise[js.Array[RecurringCharge]] = js.native
    def list(options: ListOptions with DateOptions with FieldOptions): js.Promise[js.Array[RecurringCharge]] = js.native
  }
  
  @js.native
  class default protected () extends RecurringCharges {
    def this(shopDomain: String, accessToken: String) = this()
  }
}
