package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "MeasurementUnitCustom")
@js.native
class MeasurementUnitCustom () extends js.Object {
  
  /**
    * The abbreviation of the custom unit, such as "bsh" (bushel).
    * This appears in the cart for the Point of Sale app, and in reports.
    */
  var abbreviation: String = js.native
  
  /**
    * The name of the custom unit, for example "bushel".
    */
  var name: String = js.native
}
