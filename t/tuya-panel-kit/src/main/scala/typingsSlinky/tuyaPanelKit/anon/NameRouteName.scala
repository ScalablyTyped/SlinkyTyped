package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameRouteName[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var name: RouteName = js.native
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any = js.native
}
object NameRouteName {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */](
    name: RouteName,
    params: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ): NameRouteName[RouteName, ParamList] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameRouteName[RouteName, ParamList]]
  }
  
  @scala.inline
  implicit class NameRouteNameMutableBuilder[Self <: NameRouteName[_, _], RouteName /* <: /* keyof ParamList */ String */, ParamList /* <: ParamListBase */] (val x: Self with (NameRouteName[RouteName, ParamList])) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
