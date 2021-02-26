package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.NamedTupleMemberType, 'type'> */
@js.native
trait PickNamedTupleMemberTypet extends StObject {
  
  var `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String) = js.native
}
object PickNamedTupleMemberTypet {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): PickNamedTupleMemberTypet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNamedTupleMemberTypet]
  }
  
  @scala.inline
  implicit class PickNamedTupleMemberTypetMutableBuilder[Self <: PickNamedTupleMemberTypet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
