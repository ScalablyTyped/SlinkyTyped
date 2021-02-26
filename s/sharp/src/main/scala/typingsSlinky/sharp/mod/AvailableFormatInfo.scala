package typingsSlinky.sharp.mod

import typingsSlinky.sharp.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableFormatInfo extends StObject {
  
  var id: String = js.native
  
  var input: Buffer = js.native
  
  var output: Buffer = js.native
}
object AvailableFormatInfo {
  
  @scala.inline
  def apply(id: String, input: Buffer, output: Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
  
  @scala.inline
  implicit class AvailableFormatInfoMutableBuilder[Self <: AvailableFormatInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Buffer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
