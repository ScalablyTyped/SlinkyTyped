package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseFile extends js.Object {
  var chooseFile: String = js.native
  var disabled: String = js.native
  var fileDecorator: String = js.native
  var fileInput: String = js.native
  var fileSign: String = js.native
  var fileSignBottom: String = js.native
  var noFileChosen: String = js.native
  var other: String = js.native
  var placeholderInput: String = js.native
  var preview: String = js.native
  var removeButton: String = js.native
  var removeButtonBottom: String = js.native
  var removeFile: String = js.native
  var removeFileSvg: String = js.native
  var root: String = js.native
  var wrapper: String = js.native
}

object ChooseFile {
  @scala.inline
  def apply(
    chooseFile: String,
    disabled: String,
    fileDecorator: String,
    fileInput: String,
    fileSign: String,
    fileSignBottom: String,
    noFileChosen: String,
    other: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeButtonBottom: String,
    removeFile: String,
    removeFileSvg: String,
    root: String,
    wrapper: String
  ): ChooseFile = {
    val __obj = js.Dynamic.literal(chooseFile = chooseFile.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileSign = fileSign.asInstanceOf[js.Any], fileSignBottom = fileSignBottom.asInstanceOf[js.Any], noFileChosen = noFileChosen.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeButtonBottom = removeButtonBottom.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], removeFileSvg = removeFileSvg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFile]
  }
  @scala.inline
  implicit class ChooseFileOps[Self <: ChooseFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChooseFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDecorator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSignBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSignBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoFileChosen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFileChosen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveButtonBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFileSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFileSvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

