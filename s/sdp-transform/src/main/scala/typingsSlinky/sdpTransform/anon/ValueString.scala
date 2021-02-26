package typingsSlinky.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueString extends StObject {
  
  var value: String = js.native
}
object ValueString {
  
  @scala.inline
  def apply(value: String): ValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit class ValueStringMutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
