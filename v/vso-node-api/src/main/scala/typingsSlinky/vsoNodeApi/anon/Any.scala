package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Any extends StObject {
  
  var any: scala.Double = js.native
  
  var file: scala.Double = js.native
  
  var folder: scala.Double = js.native
}
object Any {
  
  @scala.inline
  def apply(any: scala.Double, file: scala.Double, folder: scala.Double): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  
  @scala.inline
  implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: scala.Double): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: scala.Double): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: scala.Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
