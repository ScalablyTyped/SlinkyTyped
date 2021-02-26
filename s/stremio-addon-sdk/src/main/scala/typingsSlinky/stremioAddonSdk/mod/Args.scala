package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.anon.Genre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends StObject {
  
  var extra: Genre = js.native
  
  var id: String = js.native
  
  var `type`: ContentType = js.native
}
object Args {
  
  @scala.inline
  def apply(extra: Genre, id: String, `type`: ContentType): Args = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: Genre): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
