package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorTemperaturePreset extends js.Object
/** Defines the values for the possible color temperature presets. */
@JSGlobal("Windows.Media.Devices.ColorTemperaturePreset")
@js.native
object ColorTemperaturePreset extends js.Object {
  
  /** Indicates that the color temperature is set automatically. */
  @js.native
  sealed trait auto extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by candlelight. */
  @js.native
  sealed trait candlelight extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a cloudy scene. */
  @js.native
  sealed trait cloudy extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a daylight scene. */
  @js.native
  sealed trait daylight extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by a flash. */
  @js.native
  sealed trait flash extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by florescent light. */
  @js.native
  sealed trait fluorescent extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is set manually. */
  @js.native
  sealed trait manual extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by tungsten light. */
  @js.native
  sealed trait tungsten extends ColorTemperaturePreset
}
