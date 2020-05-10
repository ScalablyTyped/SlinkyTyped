package typingsSlinky.winrt.Windows.Storage.Provider

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICachedFileUpdaterStatics extends js.Object {
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit = js.native
}

object ICachedFileUpdaterStatics {
  @scala.inline
  def apply(
    setUpdateInformation: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Unit
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal(setUpdateInformation = js.Any.fromFunction5(setUpdateInformation))
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
  @scala.inline
  implicit class ICachedFileUpdaterStaticsOps[Self <: ICachedFileUpdaterStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetUpdateInformation(value: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdateInformation")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

