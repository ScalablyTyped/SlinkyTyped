package typingsSlinky.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECCPublicKeyData extends StObject {
  
  var x: BitArray_ = js.native
  
  var y: BitArray_ = js.native
}
object SjclECCPublicKeyData {
  
  @scala.inline
  def apply(x: BitArray_, y: BitArray_): SjclECCPublicKeyData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
  
  @scala.inline
  implicit class SjclECCPublicKeyDataMutableBuilder[Self <: SjclECCPublicKeyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: BitArray_): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: BitArray_): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
