package typingsSlinky.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIMod

import typingsSlinky.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAbsoluteDashPositionedDashKeyboardDashAwareDashViewMod.PreviewDimens
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUI
  extends Component[OnDeviceUIProps, OnDeviceUIState, js.Any] {
  var animatedValue: Value = js.native
  var channel: typingsSlinky.atStorybookChannels.atStorybookChannelsMod.default = js.native
  def handleOpenPreview(): Unit = js.native
  def handleToggleTab(newTabOpen: Double): Unit = js.native
  def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
}

