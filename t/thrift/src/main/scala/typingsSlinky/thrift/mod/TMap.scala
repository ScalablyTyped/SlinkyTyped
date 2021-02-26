package typingsSlinky.thrift.mod

import typingsSlinky.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TMap extends StObject {
  
  var ktype: Type = js.native
  
  var size: Double = js.native
  
  var vtype: Type = js.native
}
object TMap {
  
  @scala.inline
  def apply(ktype: Type, size: Double, vtype: Type): TMap = {
    val __obj = js.Dynamic.literal(ktype = ktype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vtype = vtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMap]
  }
  
  @scala.inline
  implicit class TMapMutableBuilder[Self <: TMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKtype(value: Type): Self = StObject.set(x, "ktype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVtype(value: Type): Self = StObject.set(x, "vtype", value.asInstanceOf[js.Any])
  }
}
