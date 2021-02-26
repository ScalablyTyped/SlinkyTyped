package typingsSlinky.tuyaPanelKit.anon

import slinky.core.facade.ReactElement
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  /**
    * Render callback to render content of this screen.
    */
  def children(props: Route[ParamList, RouteName]): ReactElement = js.native
  
  var component: js.UndefOr[scala.Nothing] = js.native
  
  var getComponent: js.UndefOr[scala.Nothing] = js.native
}
object GetComponent {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: Route[ParamList, RouteName] => ReactElement): GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[GetComponent[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class GetComponentMutableBuilder[Self <: GetComponent[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (GetComponent[ParamList, RouteName])) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Route[ParamList, RouteName] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
