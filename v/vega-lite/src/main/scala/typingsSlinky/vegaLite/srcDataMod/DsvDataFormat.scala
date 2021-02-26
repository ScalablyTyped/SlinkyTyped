package typingsSlinky.vegaLite.srcDataMod

import typingsSlinky.vegaLite.vegaLiteStrings.dsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DsvDataFormat
  extends DataFormatBase
     with DataFormat {
  
  /**
    * The delimiter between records. The delimiter must be a single character (i.e., a single 16-bit code unit); so, ASCII delimiters are fine, but emoji delimiters are not.
    *
    * @minLength 1
    * @maxLength 1
    */
  var delimiter: String = js.native
  
  @JSName("type")
  var type_DsvDataFormat: js.UndefOr[dsv] = js.native
}
object DsvDataFormat {
  
  @scala.inline
  def apply(delimiter: String): DsvDataFormat = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DsvDataFormat]
  }
  
  @scala.inline
  implicit class DsvDataFormatMutableBuilder[Self <: DsvDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: dsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
