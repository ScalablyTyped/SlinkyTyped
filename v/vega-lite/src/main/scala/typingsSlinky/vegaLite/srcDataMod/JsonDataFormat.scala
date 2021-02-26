package typingsSlinky.vegaLite.srcDataMod

import typingsSlinky.vegaLite.vegaLiteStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonDataFormat
  extends DataFormatBase
     with DataFormat {
  
  /**
    * The JSON property containing the desired data.
    * This parameter can be used when the loaded JSON file may have surrounding structure or meta-data.
    * For example `"property": "values.features"` is equivalent to retrieving `json.values.features`
    * from the loaded JSON object.
    */
  var property: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_JsonDataFormat: js.UndefOr[json] = js.native
}
object JsonDataFormat {
  
  @scala.inline
  def apply(): JsonDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDataFormat]
  }
  
  @scala.inline
  implicit class JsonDataFormatMutableBuilder[Self <: JsonDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
