package typingsSlinky.winrtDashUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val auto: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.auto with Double = js.native
  /* 7 */ val candlelight: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.candlelight with Double = js.native
  /* 2 */ val cloudy: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.cloudy with Double = js.native
  /* 3 */ val daylight: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.daylight with Double = js.native
  /* 4 */ val flash: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.flash with Double = js.native
  /* 5 */ val fluorescent: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.fluorescent with Double = js.native
  /* 1 */ val manual: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.manual with Double = js.native
  /* 6 */ val tungsten: typingsSlinky.winrtDashUwp.Windows.Media.Devices.ColorTemperaturePreset.tungsten with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorTemperaturePreset with Double] = js.native
}

