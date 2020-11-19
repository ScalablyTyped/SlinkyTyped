package typingsSlinky.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of a video profile. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties")
@js.native
abstract class KnownPerceptionVideoProfileProperties ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Perception.KnownPerceptionVideoProfileProperties
/* static members */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties")
@js.native
object KnownPerceptionVideoProfileProperties extends js.Object {
  
  /** Gets a string key used to retrieve an enumeration property indicating the bitmap alpha mode. */
  var bitmapAlphaMode: String = js.native
  
  /** Gets a string key used to retrieve an enumeration property indicating the bitmap pixel format. */
  var bitmapPixelFormat: String = js.native
  
  /** Gets a string key used to retrieve a TimeSpan property indicating the time duration of each frame. */
  var frameDuration: String = js.native
  
  /** Gets a string key used to retrieve a 32-bit unsigned integer property indicating the frame height, in pixels. */
  var height: String = js.native
  
  /** Gets a string key used to retrieve a 32-bit unsigned integer property indicating the frame width, in pixels. */
  var width: String = js.native
}
