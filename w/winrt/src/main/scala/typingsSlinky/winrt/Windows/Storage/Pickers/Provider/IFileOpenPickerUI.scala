package typingsSlinky.winrt.Windows.Storage.Pickers.Provider

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String] = js.native
  var onclosing: js.Any = js.native
  var onfileremoved: js.Any = js.native
  var selectionMode: FileSelectionMode = js.native
  var settingsIdentifier: String = js.native
  var title: String = js.native
  def addFile(id: String, file: IStorageFile): AddFileResult = js.native
  def canAddFile(file: IStorageFile): Boolean = js.native
  def containsFile(id: String): Boolean = js.native
  def removeFile(id: String): Unit = js.native
}

object IFileOpenPickerUI {
  @scala.inline
  def apply(
    addFile: (String, IStorageFile) => AddFileResult,
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => Boolean,
    containsFile: String => Boolean,
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: String => Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
  @scala.inline
  implicit class IFileOpenPickerUIOps[Self <: IFileOpenPickerUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFile(value: (String, IStorageFile) => AddFileResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowedFileTypes(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanAddFile(value: IStorageFile => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsFile(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnclosing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnfileremoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfileremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFile(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectionMode(value: FileSelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

