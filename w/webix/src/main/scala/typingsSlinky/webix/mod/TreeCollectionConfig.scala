package typingsSlinky.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeCollectionConfig extends StObject {
  
  var data: js.UndefOr[String | js.Array[_]] = js.native
  
  var datathrottle: js.UndefOr[Double] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultData: js.UndefOr[js.Any] = js.native
  
  var externalData: js.UndefOr[WebixCallback] = js.native
  
  var filterMode: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var map: js.UndefOr[js.Any] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var ready: js.UndefOr[WebixCallback] = js.native
  
  var removeMissed: js.UndefOr[Boolean] = js.native
  
  var rules: js.UndefOr[js.Any] = js.native
  
  var save: js.UndefOr[js.Any] = js.native
  
  var scheme: js.UndefOr[js.Any] = js.native
  
  var url: js.UndefOr[js.Any] = js.native
  
  var view: js.UndefOr[String] = js.native
}
object TreeCollectionConfig {
  
  @scala.inline
  def apply(): TreeCollectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeCollectionConfig]
  }
  
  @scala.inline
  implicit class TreeCollectionConfigMutableBuilder[Self <: TreeCollectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultData(value: js.Any): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
    
    @scala.inline
    def setExternalData(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "externalData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExternalDataUndefined: Self = StObject.set(x, "externalData", js.undefined)
    
    @scala.inline
    def setFilterMode(value: js.Any): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setReady(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setSave(value: js.Any): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
