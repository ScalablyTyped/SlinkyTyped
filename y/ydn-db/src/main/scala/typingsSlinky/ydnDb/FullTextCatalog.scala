package typingsSlinky.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullTextCatalog extends StObject {
  
  var lang: String = js.native
  
  var name: String = js.native
  
  var sources: js.Array[FullTextSource] = js.native
}
object FullTextCatalog {
  
  @scala.inline
  def apply(lang: String, name: String, sources: js.Array[FullTextSource]): FullTextCatalog = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextCatalog]
  }
  
  @scala.inline
  implicit class FullTextCatalogMutableBuilder[Self <: FullTextCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: js.Array[FullTextSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: FullTextSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
