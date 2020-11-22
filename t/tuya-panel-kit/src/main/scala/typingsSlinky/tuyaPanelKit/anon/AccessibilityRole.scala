package typingsSlinky.tuyaPanelKit.anon

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityRole extends js.Object {
  
  var accessibilityRole: link = js.native
  
  var href: String = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def onPress(): Unit = js.native
  def onPress(e: SyntheticMouseEvent[HTMLAnchorElement]): Unit = js.native
  def onPress(e: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
}
