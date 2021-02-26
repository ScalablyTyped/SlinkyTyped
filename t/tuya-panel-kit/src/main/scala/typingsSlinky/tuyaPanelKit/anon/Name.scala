package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.NavigatorScreenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var name: String = js.native
  
  var params: js.UndefOr[NavigatorScreenParams[State, NavigationState[ParamListBase]]] = js.native
}
object Name {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](name: String): Name[State] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[State]]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Name[State]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: NavigatorScreenParams[State, NavigationState[ParamListBase]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
