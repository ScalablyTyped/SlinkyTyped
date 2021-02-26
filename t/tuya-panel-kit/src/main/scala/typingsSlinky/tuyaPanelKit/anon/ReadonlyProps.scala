package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardMode
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderMode
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/views/Stack/StackView.Props> */
@js.native
trait ReadonlyProps extends StObject {
  
  val descriptors: StackDescriptorMap = js.native
  
  val detachInactiveScreens: js.UndefOr[Boolean] = js.native
  
  val headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  val keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  val mode: js.UndefOr[StackCardMode] = js.native
  
  val navigation: StackNavigationHelpers = js.native
  
  val state: StackNavigationState[ParamListBase] = js.native
}
object ReadonlyProps {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    state: StackNavigationState[ParamListBase]
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  @scala.inline
  implicit class ReadonlyPropsMutableBuilder[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: StackNavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
