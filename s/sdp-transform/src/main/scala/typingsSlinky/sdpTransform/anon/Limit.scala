package typingsSlinky.sdpTransform.anon

import typingsSlinky.sdpTransform.sdpTransformStrings.AS
import typingsSlinky.sdpTransform.sdpTransformStrings.CT
import typingsSlinky.sdpTransform.sdpTransformStrings.RR
import typingsSlinky.sdpTransform.sdpTransformStrings.RS
import typingsSlinky.sdpTransform.sdpTransformStrings.TIAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Limit extends StObject {
  
  var limit: Double | String = js.native
  
  var `type`: TIAS | AS | CT | RR | RS = js.native
}
object Limit {
  
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TIAS | AS | CT | RR | RS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
