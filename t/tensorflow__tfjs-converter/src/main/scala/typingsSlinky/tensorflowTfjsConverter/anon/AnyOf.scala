package typingsSlinky.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyOf extends StObject {
  
  var anyOf: js.Array[ItemsType | TypeString] = js.native
}
object AnyOf {
  
  @scala.inline
  def apply(anyOf: js.Array[ItemsType | TypeString]): AnyOf = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOf]
  }
  
  @scala.inline
  implicit class AnyOfMutableBuilder[Self <: AnyOf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyOf(value: js.Array[ItemsType | TypeString]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyOfVarargs(value: (ItemsType | TypeString)*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
  }
}
