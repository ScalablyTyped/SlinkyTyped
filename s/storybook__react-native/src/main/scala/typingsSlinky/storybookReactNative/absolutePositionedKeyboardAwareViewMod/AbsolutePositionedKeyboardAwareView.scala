package typingsSlinky.storybookReactNative.absolutePositionedKeyboardAwareViewMod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.EmitterSubscription
import typingsSlinky.reactNative.mod.KeyboardEvent
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsolutePositionedKeyboardAwareView
  extends Component[Props, js.Object, js.Any] {
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAbsolutePositionedKeyboardAwareView(): Unit = js.native
  
  def keyboardDidHideHandler(): Unit = js.native
  
  var keyboardDidHideListener: EmitterSubscription = js.native
  
  def keyboardDidShowHandler(e: KeyboardEvent): Unit = js.native
  
  var keyboardDidShowListener: EmitterSubscription = js.native
  
  var keyboardOpen: Boolean = js.native
  
  def onLayoutHandler(hasNativeEvent: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  def removeKeyboardOnOrientationChange(): Unit = js.native
}
