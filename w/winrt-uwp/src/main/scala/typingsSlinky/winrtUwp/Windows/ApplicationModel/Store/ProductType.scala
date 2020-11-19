package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProductType extends js.Object
/** Specifies the product type for an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductType")
@js.native
object ProductType extends js.Object {
  
  /** A consumable product. */
  @js.native
  sealed trait consumable extends ProductType
  
  /** A durable product. */
  @js.native
  sealed trait durable extends ProductType
  
  /** The product type is unknown. */
  @js.native
  sealed trait unknown extends ProductType
}
