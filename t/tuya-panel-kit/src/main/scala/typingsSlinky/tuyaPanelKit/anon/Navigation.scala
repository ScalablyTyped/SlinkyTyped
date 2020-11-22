package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.RouteProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation[ParamList /* <: ParamListBase */] extends js.Object {
  
  var navigation: js.Any = js.native
  
  var route: RouteProp[ParamList, /* keyof ParamList */ String] = js.native
}
object Navigation {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](navigation: js.Any, route: RouteProp[ParamList, /* keyof ParamList */ String]): Navigation[ParamList] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation[ParamList]]
  }
  
  @scala.inline
  implicit class NavigationOps[Self <: Navigation[_], ParamList /* <: ParamListBase */] (val x: Self with Navigation[ParamList]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNavigation(value: js.Any): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: RouteProp[ParamList, /* keyof ParamList */ String]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
