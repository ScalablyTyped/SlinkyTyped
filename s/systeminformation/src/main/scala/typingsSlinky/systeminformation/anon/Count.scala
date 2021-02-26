package typingsSlinky.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends StObject {
  
  var count: Double = js.native
  
  var revision: Double = js.native
}
object Count {
  
  @scala.inline
  def apply(count: Double, revision: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
