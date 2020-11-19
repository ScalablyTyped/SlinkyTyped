package typingsSlinky.storybookReactNative.onDeviceUIMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDeviceUI
  extends Component[OnDeviceUIProps, OnDeviceUIState, js.Any] {
  
  var animatedValue: Value = js.native
  
  var channel: typingsSlinky.storybookChannels.mod.default = js.native
  
  def handleOpenPreview(): Unit = js.native
  
  def handleToggleTab(newTabOpen: Double): Unit = js.native
  
  def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
}
