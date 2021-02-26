package typingsSlinky.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends StObject {
  
  var hash: js.Any = js.native
  
  var path: js.Any = js.native
  
  var search: js.Any = js.native
  
  var url: String = js.native
}
object Hash {
  
  @scala.inline
  def apply(hash: js.Any, path: js.Any, search: js.Any, url: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
