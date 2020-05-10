package typingsSlinky.winrt.Windows.Devices.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerDevice extends js.Object {
  var isIntegrated: Boolean = js.native
  var maxContacts: Double = js.native
  var physicalDeviceRect: Rect = js.native
  var pointerDeviceType: PointerDeviceType = js.native
  var screenRect: Rect = js.native
  var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
}

object IPointerDevice {
  @scala.inline
  def apply(
    isIntegrated: Boolean,
    maxContacts: Double,
    physicalDeviceRect: Rect,
    pointerDeviceType: PointerDeviceType,
    screenRect: Rect,
    supportedUsages: IVectorView[PointerDeviceUsage]
  ): IPointerDevice = {
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated.asInstanceOf[js.Any], maxContacts = maxContacts.asInstanceOf[js.Any], physicalDeviceRect = physicalDeviceRect.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], screenRect = screenRect.asInstanceOf[js.Any], supportedUsages = supportedUsages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerDevice]
  }
  @scala.inline
  implicit class IPointerDeviceOps[Self <: IPointerDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsIntegrated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIntegrated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxContacts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalDeviceRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalDeviceRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerDeviceType(value: PointerDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedUsages(value: IVectorView[PointerDeviceUsage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedUsages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

