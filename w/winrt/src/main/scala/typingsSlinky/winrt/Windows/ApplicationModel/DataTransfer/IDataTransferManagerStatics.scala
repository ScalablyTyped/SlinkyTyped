package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataTransferManagerStatics extends js.Object {
  def getForCurrentView(): DataTransferManager = js.native
  def showShareUI(): Unit = js.native
}

object IDataTransferManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => DataTransferManager, showShareUI: () => Unit): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showShareUI = js.Any.fromFunction0(showShareUI))
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
  @scala.inline
  implicit class IDataTransferManagerStaticsOps[Self <: IDataTransferManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetForCurrentView(value: () => DataTransferManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowShareUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShareUI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

