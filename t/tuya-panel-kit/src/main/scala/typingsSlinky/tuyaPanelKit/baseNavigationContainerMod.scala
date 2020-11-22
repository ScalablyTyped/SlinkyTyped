package typingsSlinky.tuyaPanelKit

import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerProps
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/BaseNavigationContainer", JSImport.Namespace)
@js.native
object baseNavigationContainerMod extends js.Object {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  val default: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
}
