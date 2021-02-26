package typingsSlinky.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePickerOptions extends StObject {
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  
  var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.native
}
object FilePickerOptions {
  
  @scala.inline
  def apply(): FilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePickerOptions]
  }
  
  @scala.inline
  implicit class FilePickerOptionsMutableBuilder[Self <: FilePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[FilePickerAcceptType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: FilePickerAcceptType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
