package typingsSlinky.winrt.Windows.Devices.Portable

import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageDeviceStatics extends js.Object {
  def fromId(interfaceId: String): StorageFolder = js.native
  def getDeviceSelector(): String = js.native
}

object IStorageDeviceStatics {
  @scala.inline
  def apply(fromId: String => StorageFolder, getDeviceSelector: () => String): IStorageDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[IStorageDeviceStatics]
  }
  @scala.inline
  implicit class IStorageDeviceStaticsOps[Self <: IStorageDeviceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromId(value: String => StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeviceSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceSelector")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

