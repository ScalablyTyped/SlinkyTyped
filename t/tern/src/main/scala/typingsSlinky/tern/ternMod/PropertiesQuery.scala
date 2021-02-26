package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesQuery
  extends BaseQuery
     with Query {
  
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[String] = js.native
  
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.native
  
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: properties = js.native
}
object PropertiesQuery {
  
  @scala.inline
  def apply(`type`: properties): PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQuery]
  }
  
  @scala.inline
  implicit class PropertiesQueryMutableBuilder[Self <: PropertiesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: properties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
