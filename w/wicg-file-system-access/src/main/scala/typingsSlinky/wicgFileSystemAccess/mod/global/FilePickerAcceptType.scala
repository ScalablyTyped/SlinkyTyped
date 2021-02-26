package typingsSlinky.wicgFileSystemAccess.mod.global

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePickerAcceptType extends StObject {
  
  var accept: Record[String, String | js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
}
object FilePickerAcceptType {
  
  @scala.inline
  def apply(accept: Record[String, String | js.Array[String]]): FilePickerAcceptType = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerAcceptType]
  }
  
  @scala.inline
  implicit class FilePickerAcceptTypeMutableBuilder[Self <: FilePickerAcceptType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
