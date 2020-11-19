package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseFile extends js.Object {
  
  var chooseFile: String = js.native
  
  var fileDecorator: String = js.native
  
  var fileInput: String = js.native
  
  var fileSignBottom: String = js.native
  
  var noFileChosen: String = js.native
  
  var placeholderInput: String = js.native
  
  var preview: String = js.native
  
  var removeButton: String = js.native
  
  var removeButtonBottom: String = js.native
  
  var removeFile: String = js.native
  
  var removeFileSvg: String = js.native
  
  var root: String = js.native
}
object ChooseFile {
  
  @scala.inline
  def apply(
    chooseFile: String,
    fileDecorator: String,
    fileInput: String,
    fileSignBottom: String,
    noFileChosen: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeButtonBottom: String,
    removeFile: String,
    removeFileSvg: String,
    root: String
  ): ChooseFile = {
    val __obj = js.Dynamic.literal(chooseFile = chooseFile.asInstanceOf[js.Any], fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileSignBottom = fileSignBottom.asInstanceOf[js.Any], noFileChosen = noFileChosen.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeButtonBottom = removeButtonBottom.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], removeFileSvg = removeFileSvg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFile]
  }
  
  @scala.inline
  implicit class ChooseFileOps[Self <: ChooseFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChooseFile(value: String): Self = this.set("chooseFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDecorator(value: String): Self = this.set("fileDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInput(value: String): Self = this.set("fileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSignBottom(value: String): Self = this.set("fileSignBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFileChosen(value: String): Self = this.set("noFileChosen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderInput(value: String): Self = this.set("placeholderInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButton(value: String): Self = this.set("removeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButtonBottom(value: String): Self = this.set("removeButtonBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFile(value: String): Self = this.set("removeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFileSvg(value: String): Self = this.set("removeFileSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
