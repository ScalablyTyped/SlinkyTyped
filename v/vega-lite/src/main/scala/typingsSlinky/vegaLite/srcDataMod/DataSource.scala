package typingsSlinky.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaLite.srcDataMod.UrlData
  - typingsSlinky.vegaLite.srcDataMod.InlineData
  - typingsSlinky.vegaLite.srcDataMod.NamedData
*/
trait DataSource extends Data
object DataSource {
  
  @scala.inline
  def InlineData(values: InlineDataset): typingsSlinky.vegaLite.srcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.InlineData]
  }
  
  @scala.inline
  def NamedData(name: String): typingsSlinky.vegaLite.srcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.NamedData]
  }
  
  @scala.inline
  def UrlData(url: String): typingsSlinky.vegaLite.srcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.UrlData]
  }
}
