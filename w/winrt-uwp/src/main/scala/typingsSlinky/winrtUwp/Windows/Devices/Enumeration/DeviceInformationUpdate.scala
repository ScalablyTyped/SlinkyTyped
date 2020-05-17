package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains updated properties for a DeviceInformation object. */
@js.native
trait DeviceInformationUpdate extends js.Object {
  /** The DeviceInformation ID of the updated device. */
  var id: String = js.native
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind = js.native
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: IMapView[String, _] = js.native
}

object DeviceInformationUpdate {
  @scala.inline
  def apply(id: String, kind: DeviceInformationKind, properties: IMapView[String, _]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
  @scala.inline
  implicit class DeviceInformationUpdateOps[Self <: DeviceInformationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: DeviceInformationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

