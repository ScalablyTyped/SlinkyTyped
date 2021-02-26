package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Devices.Sensors.ISensorDataThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that responds when a threshold limit for a sensor is crossed. */
@JSGlobal("Windows.ApplicationModel.Background.SensorDataThresholdTrigger")
@js.native
class SensorDataThresholdTrigger protected ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.SensorDataThresholdTrigger {
  /**
    * Initializes a new instance of the SensorDataThresholdTrigger class.
    * @param threshold The threshold for a sensor that indicates when it should be triggered.
    */
  def this(threshold: ISensorDataThreshold) = this()
}
