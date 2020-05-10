package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTransferContentPart extends js.Object {
  def setFile(value: IStorageFile): Unit = js.native
  def setHeader(headerName: String, headerValue: String): Unit = js.native
  def setText(value: String): Unit = js.native
}

object IBackgroundTransferContentPart {
  @scala.inline
  def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
  @scala.inline
  implicit class IBackgroundTransferContentPartOps[Self <: IBackgroundTransferContentPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetFile(value: IStorageFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

