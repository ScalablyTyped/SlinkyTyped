package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTextChanges extends StObject {
  
  var fileName: java.lang.String = js.native
  
  var isNewFile: js.UndefOr[Boolean] = js.native
  
  var textChanges: js.Array[TextChange] = js.native
}
object FileTextChanges {
  
  @scala.inline
  def apply(fileName: java.lang.String, textChanges: js.Array[TextChange]): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textChanges = textChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTextChanges]
  }
  
  @scala.inline
  implicit class FileTextChangesMutableBuilder[Self <: FileTextChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewFile(value: Boolean): Self = StObject.set(x, "isNewFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewFileUndefined: Self = StObject.set(x, "isNewFile", js.undefined)
    
    @scala.inline
    def setTextChanges(value: js.Array[TextChange]): Self = StObject.set(x, "textChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChangesVarargs(value: TextChange*): Self = StObject.set(x, "textChanges", js.Array(value :_*))
  }
}
