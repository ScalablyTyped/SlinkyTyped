package typingsSlinky.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithSearch
  extends BaseOptions
     with Options {
  
  var search: String = js.native
}
object OptionsWithSearch {
  
  @scala.inline
  def apply(search: String): OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithSearch]
  }
  
  @scala.inline
  implicit class OptionsWithSearchMutableBuilder[Self <: OptionsWithSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
