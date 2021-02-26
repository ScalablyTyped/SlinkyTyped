package typingsSlinky.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision extends StObject {
  
  var end: Double = js.native
  
  var revision: Double = js.native
  
  var start: Double = js.native
}
object Revision {
  
  @scala.inline
  def apply(end: Double, revision: Double, start: Double): Revision = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
