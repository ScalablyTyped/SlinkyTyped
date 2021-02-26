package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Added extends StObject {
  
  var added: scala.Double = js.native
  
  var deleted: scala.Double = js.native
  
  var modified: scala.Double = js.native
}
object Added {
  
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double, modified: scala.Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  @scala.inline
  implicit class AddedMutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: scala.Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: scala.Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: scala.Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
  }
}
