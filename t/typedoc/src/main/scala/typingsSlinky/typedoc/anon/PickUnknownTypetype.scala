package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnknownType, 'type'> */
@js.native
trait PickUnknownTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String) = js.native
}
object PickUnknownTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): PickUnknownTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnknownTypetype]
  }
  
  @scala.inline
  implicit class PickUnknownTypetypeMutableBuilder[Self <: PickUnknownTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
