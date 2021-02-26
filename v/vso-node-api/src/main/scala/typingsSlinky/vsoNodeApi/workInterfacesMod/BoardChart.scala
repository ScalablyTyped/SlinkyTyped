package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardChart extends BoardChartReference {
  
  /**
    * The links for the resource
    */
  var _links: js.Any = js.native
  
  /**
    * The settings for the resource
    */
  var settings: StringDictionary[js.Any] = js.native
}
object BoardChart {
  
  @scala.inline
  def apply(_links: js.Any, name: String, settings: StringDictionary[js.Any], url: String): BoardChart = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardChart]
  }
  
  @scala.inline
  implicit class BoardChartMutableBuilder[Self <: BoardChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
