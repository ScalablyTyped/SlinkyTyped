package typingsSlinky.winrt.Windows.Devices.Enumeration

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceInformation extends js.Object {
  var enclosureLocation: EnclosureLocation = js.native
  var id: String = js.native
  var isDefault: Boolean = js.native
  var isEnabled: Boolean = js.native
  var name: String = js.native
  var properties: IMapView[String, _] = js.native
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  def update(updateInfo: DeviceInformationUpdate): Unit = js.native
}

object IDeviceInformation {
  @scala.inline
  def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: () => IAsyncOperation[DeviceThumbnail],
    getThumbnailAsync: () => IAsyncOperation[DeviceThumbnail],
    id: String,
    isDefault: Boolean,
    isEnabled: Boolean,
    name: String,
    properties: IMapView[String, _],
    update: DeviceInformationUpdate => Unit
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = js.Any.fromFunction0(getGlyphThumbnailAsync), getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[IDeviceInformation]
  }
  @scala.inline
  implicit class IDeviceInformationOps[Self <: IDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnclosureLocation(value: EnclosureLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosureLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGlyphThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlyphThumbnailAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnailAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: DeviceInformationUpdate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

