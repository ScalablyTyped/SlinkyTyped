package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivitySensorReadingConfidence extends StObject
/** Specifies the confidence of a sensor reading. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReadingConfidence")
@js.native
object ActivitySensorReadingConfidence extends StObject {
  
  /** There is high confidence in the reading of the sensor. */
  @js.native
  sealed trait high extends ActivitySensorReadingConfidence
  
  /** There is low confidence in the reading of the sensor. */
  @js.native
  sealed trait low extends ActivitySensorReadingConfidence
}
