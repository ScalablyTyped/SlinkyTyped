package typingsSlinky.winrt.Windows.Storage.Pickers.Provider

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileSavePickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String] = js.native
  var fileName: String = js.native
  var onfilenamechanged: js.Any = js.native
  var ontargetfilerequested: js.Any = js.native
  var settingsIdentifier: String = js.native
  var title: String = js.native
  def trySetFileName(value: String): SetFileNameResult = js.native
}

object IFileSavePickerUI {
  @scala.inline
  def apply(
    allowedFileTypes: IVectorView[String],
    fileName: String,
    onfilenamechanged: js.Any,
    ontargetfilerequested: js.Any,
    settingsIdentifier: String,
    title: String,
    trySetFileName: String => SetFileNameResult
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], onfilenamechanged = onfilenamechanged.asInstanceOf[js.Any], ontargetfilerequested = ontargetfilerequested.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trySetFileName = js.Any.fromFunction1(trySetFileName))
    __obj.asInstanceOf[IFileSavePickerUI]
  }
  @scala.inline
  implicit class IFileSavePickerUIOps[Self <: IFileSavePickerUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedFileTypes(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnfilenamechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfilenamechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntargetfilerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontargetfilerequested")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTrySetFileName(value: String => SetFileNameResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetFileName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

