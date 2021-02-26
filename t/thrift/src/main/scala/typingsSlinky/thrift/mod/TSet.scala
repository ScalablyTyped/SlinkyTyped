package typingsSlinky.thrift.mod

import typingsSlinky.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSet extends StObject {
  
  var etype: Type = js.native
  
  var size: Double = js.native
}
object TSet {
  
  @scala.inline
  def apply(etype: Type, size: Double): TSet = {
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSet]
  }
  
  @scala.inline
  implicit class TSetMutableBuilder[Self <: TSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtype(value: Type): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
