package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.Route
import typingsSlinky.tuyaPanelKit.stackTypesMod.Layout
import typingsSlinky.tuyaPanelKit.stackTypesMod.Scene
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderProps
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationProp
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.float
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @scala.inline
  def apply(
    insets: EdgeInsets,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[ParamListBase, String],
    scene: Scene[Route[String, js.UndefOr[js.Object]]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): Builder = {
    val __props = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[StackHeaderProps]))
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def previous(value: Scene[Route[String, js.UndefOr[js.Object]]]): this.type = set("previous", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StackHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
