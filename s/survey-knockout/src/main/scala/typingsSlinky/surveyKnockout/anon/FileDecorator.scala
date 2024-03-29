package typingsSlinky.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDecorator extends StObject {
  
  var fileDecorator: String = js.native
  
  var fileInput: String = js.native
  
  var fileSignBottom: String = js.native
  
  var placeholderInput: String = js.native
  
  var preview: String = js.native
  
  var removeButton: String = js.native
  
  var removeButtonBottom: String = js.native
  
  var removeFile: String = js.native
  
  var removeFileSvg: String = js.native
  
  var root: String = js.native
}
object FileDecorator {
  
  @scala.inline
  def apply(
    fileDecorator: String,
    fileInput: String,
    fileSignBottom: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeButtonBottom: String,
    removeFile: String,
    removeFileSvg: String,
    root: String
  ): FileDecorator = {
    val __obj = js.Dynamic.literal(fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileSignBottom = fileSignBottom.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeButtonBottom = removeButtonBottom.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], removeFileSvg = removeFileSvg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDecorator]
  }
  
  @scala.inline
  implicit class FileDecoratorMutableBuilder[Self <: FileDecorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileDecorator(value: String): Self = StObject.set(x, "fileDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInput(value: String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSignBottom(value: String): Self = StObject.set(x, "fileSignBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderInput(value: String): Self = StObject.set(x, "placeholderInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButton(value: String): Self = StObject.set(x, "removeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButtonBottom(value: String): Self = StObject.set(x, "removeButtonBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFileSvg(value: String): Self = StObject.set(x, "removeFileSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
