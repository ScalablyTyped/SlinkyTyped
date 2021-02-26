package typingsSlinky.vegaLite.srcDataMod

import typingsSlinky.vegaLite.vegaLiteStrings.csv
import typingsSlinky.vegaLite.vegaLiteStrings.dsv
import typingsSlinky.vegaLite.vegaLiteStrings.json
import typingsSlinky.vegaLite.vegaLiteStrings.topojson
import typingsSlinky.vegaLite.vegaLiteStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFormatBase extends StObject {
  
  /**
    * If set to `null`, disable type inference based on the spec and only use type inference based on the data.
    * Alternatively, a parsing directive object can be provided for explicit data types. Each property of the object corresponds to a field name, and the value to the desired data type (one of `"number"`, `"boolean"`, `"date"`, or null (do not parse the field)).
    * For example, `"parse": {"modified_on": "date"}` parses the `modified_on` field in each input record a Date value.
    *
    * For `"date"`, we parse data based using Javascript's [`Date.parse()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/parse).
    * For Specific date formats can be provided (e.g., `{foo: "date:'%m%d%Y'"}`), using the [d3-time-format syntax](https://github.com/d3/d3-time-format#locale_format). UTC date format parsing is supported similarly (e.g., `{foo: "utc:'%m%d%Y'"}`). See more about [UTC time](https://vega.github.io/vega-lite/docs/timeunit.html#utc)
    */
  var parse: js.UndefOr[Parse | Null] = js.native
  
  /**
    * Type of input data: `"json"`, `"csv"`, `"tsv"`, `"dsv"`.
    *
    * __Default value:__  The default format type is determined by the extension of the file URL.
    * If no extension is detected, `"json"` will be used by default.
    */
  var `type`: js.UndefOr[csv | tsv | dsv | json | topojson] = js.native
}
object DataFormatBase {
  
  @scala.inline
  def apply(): DataFormatBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatBase]
  }
  
  @scala.inline
  implicit class DataFormatBaseMutableBuilder[Self <: DataFormatBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseNull: Self = StObject.set(x, "parse", null)
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setType(value: csv | tsv | dsv | json | topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
