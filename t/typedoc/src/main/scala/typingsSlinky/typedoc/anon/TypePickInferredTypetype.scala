package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typedoc.typedoc/dist/lib/serialization/schema.Type & std.Pick<typedoc.typedoc/dist/lib/serialization/schema.InferredType, 'type'> */
@js.native
trait TypePickInferredTypetype extends StObject {
  
  var `type`: ModelToObject[String] | String = js.native
}
object TypePickInferredTypetype {
  
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): TypePickInferredTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePickInferredTypetype]
  }
  
  @scala.inline
  implicit class TypePickInferredTypetypeMutableBuilder[Self <: TypePickInferredTypetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
