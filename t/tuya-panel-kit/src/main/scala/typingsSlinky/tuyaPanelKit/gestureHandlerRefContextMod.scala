package typingsSlinky.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerRefContextMod extends Shortcut {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/utils/GestureHandlerRefContext", JSImport.Default)
  @js.native
  val default: Context[Ref[PanGestureHandler]] = js.native
  
  type _To = Context[Ref[PanGestureHandler]]
  
  /* This means you don't have to write `default`, but can instead just say `gestureHandlerRefContextMod.foo` */
  override def _to: Context[Ref[PanGestureHandler]] = default
}
