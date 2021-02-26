package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardMode
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderMode
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationHelpers
import typingsSlinky.tuyaPanelKit.stackViewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackView {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    state: StackNavigationState[ParamListBase]
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "StackView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.stackMod.StackView] {
    
    @scala.inline
    def detachInactiveScreens(value: Boolean): this.type = set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerMode(value: StackHeaderMode): this.type = set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardHandlingEnabled(value: Boolean): this.type = set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: StackCardMode): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
