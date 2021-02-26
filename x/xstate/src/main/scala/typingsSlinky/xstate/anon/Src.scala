package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Src extends StObject {
  
  var id: String = js.native
  
  var src: String | InvokeSourceDefinition = js.native
}
object Src {
  
  @scala.inline
  def apply(id: String, src: String | InvokeSourceDefinition): Src = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  @scala.inline
  implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String | InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
