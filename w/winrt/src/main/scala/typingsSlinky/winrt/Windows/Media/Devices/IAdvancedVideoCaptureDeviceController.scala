package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdvancedVideoCaptureDeviceController extends js.Object {
  def getDeviceProperty(propertyId: String): js.Any = js.native
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
}

object IAdvancedVideoCaptureDeviceController {
  @scala.inline
  def apply(getDeviceProperty: String => js.Any, setDeviceProperty: (String, js.Any) => Unit): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
  @scala.inline
  implicit class IAdvancedVideoCaptureDeviceControllerOps[Self <: IAdvancedVideoCaptureDeviceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeviceProperty(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDeviceProperty(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeviceProperty")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

