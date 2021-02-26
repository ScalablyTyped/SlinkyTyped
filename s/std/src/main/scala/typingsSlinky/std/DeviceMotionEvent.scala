package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
@js.native
trait DeviceMotionEvent extends Event {
  
  val acceleration: DeviceMotionEventAcceleration | Null = js.native
  
  val accelerationIncludingGravity: DeviceMotionEventAcceleration | Null = js.native
  
  val interval: Double = js.native
  
  val rotationRate: DeviceMotionEventRotationRate | Null = js.native
}
