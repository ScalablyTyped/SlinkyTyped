package typingsSlinky.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyString[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */] extends StObject {
  
  var key: String = js.native
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
  ] = js.native
}
object KeyString {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](key: String): KeyString[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString[RouteName]]
  }
  
  @scala.inline
  implicit class KeyStringMutableBuilder[Self <: KeyString[_], RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */] (val x: Self with KeyString[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
