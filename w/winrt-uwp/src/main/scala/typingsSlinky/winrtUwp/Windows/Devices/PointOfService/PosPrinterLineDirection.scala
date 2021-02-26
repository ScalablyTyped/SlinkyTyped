package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterLineDirection extends StObject
/** Describes the possible directions that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineDirection")
@js.native
object PosPrinterLineDirection extends StObject {
  
  /** Prints a horizontal ruled line. */
  @js.native
  sealed trait horizontal extends PosPrinterLineDirection
  
  /** Prints a vertical ruled line. */
  @js.native
  sealed trait vertical extends PosPrinterLineDirection
}
