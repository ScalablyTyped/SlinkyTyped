package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastAdAttributes extends StObject {
  
  var fallback_index: String | Null = js.native
  
  var `type`: String = js.native
}
object VastAdAttributes {
  
  @scala.inline
  def apply(`type`: String): VastAdAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdAttributes]
  }
  
  @scala.inline
  implicit class VastAdAttributesMutableBuilder[Self <: VastAdAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback_index(value: String): Self = StObject.set(x, "fallback_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_indexNull: Self = StObject.set(x, "fallback_index", null)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
