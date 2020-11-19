package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "StandardUnitDescription")
@js.native
class StandardUnitDescription () extends js.Object {
  
  /**
    * UI display abbreviation for the measurement unit. For example, 'lb'.
    */
  var abbreviation: js.UndefOr[String] = js.native
  
  /**
    * UI display name of the measurement unit. For example, 'Pound'.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Identifies the measurement unit being described.
    */
  var unit: js.UndefOr[MeasurementUnit] = js.native
}
