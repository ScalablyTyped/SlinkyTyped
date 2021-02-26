package typingsSlinky.thrift.mod

import typingsSlinky.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TField extends StObject {
  
  var fid: Double = js.native
  
  var fname: String = js.native
  
  var ftype: Type = js.native
}
object TField {
  
  @scala.inline
  def apply(fid: Double, fname: String, ftype: Type): TField = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftype = ftype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TField]
  }
  
  @scala.inline
  implicit class TFieldMutableBuilder[Self <: TField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFid(value: Double): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtype(value: Type): Self = StObject.set(x, "ftype", value.asInstanceOf[js.Any])
  }
}
