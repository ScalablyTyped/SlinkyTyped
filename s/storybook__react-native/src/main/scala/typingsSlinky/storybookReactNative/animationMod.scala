package typingsSlinky.storybookReactNative

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.storybookReactNative.anon.Transform
import typingsSlinky.storybookReactNative.anon.TransformArray
import typingsSlinky.storybookReactNative.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", "getAddonPanelPosition")
  @js.native
  def getAddonPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = js.native
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", "getNavigatorPanelPosition")
  @js.native
  def getNavigatorPanelPosition(animatedValue: Value, previewWidth: Double): js.Array[Transform] = js.native
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", "getPreviewPosition")
  @js.native
  def getPreviewPosition(animatedValue: Value, previewWidth: Double, previewHeight: Double, slideBetweenAnimation: Boolean): TransformArray = js.native
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/animation", "getPreviewScale")
  @js.native
  def getPreviewScale(animatedValue: Value, slideBetweenAnimation: Boolean): `0` = js.native
}
