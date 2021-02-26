package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidFilterClause extends StObject {
  
  var invalidFilterClause: scala.Double = js.native
  
  var oK: scala.Double = js.native
  
  var unknown: scala.Double = js.native
}
object InvalidFilterClause {
  
  @scala.inline
  def apply(invalidFilterClause: scala.Double, oK: scala.Double, unknown: scala.Double): InvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFilterClause]
  }
  
  @scala.inline
  implicit class InvalidFilterClauseMutableBuilder[Self <: InvalidFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidFilterClause(value: scala.Double): Self = StObject.set(x, "invalidFilterClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
