package typingsSlinky.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerDeviceType extends StObject
@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends StObject {
  
  @js.native
  sealed trait mouse extends PointerDeviceType
  
  @js.native
  sealed trait pen extends PointerDeviceType
  
  @js.native
  sealed trait touch extends PointerDeviceType
}
