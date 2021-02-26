package typingsSlinky.select2.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2RequireConfig extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var config: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var deps: js.UndefOr[js.Array[String]] = js.native
  
  var map: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
}
object Select2RequireConfig {
  
  @scala.inline
  def apply(): Select2RequireConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select2RequireConfig]
  }
  
  @scala.inline
  implicit class Select2RequireConfigMutableBuilder[Self <: Select2RequireConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setConfig(value: StringDictionary[js.Object]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
