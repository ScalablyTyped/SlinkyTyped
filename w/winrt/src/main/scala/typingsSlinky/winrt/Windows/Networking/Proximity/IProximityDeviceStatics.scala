package typingsSlinky.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProximityDeviceStatics extends js.Object {
  def fromId(deviceInterfaceId: String): ProximityDevice = js.native
  def getDefault(): ProximityDevice = js.native
  def getDeviceSelector(): String = js.native
}

object IProximityDeviceStatics {
  @scala.inline
  def apply(
    fromId: String => ProximityDevice,
    getDefault: () => ProximityDevice,
    getDeviceSelector: () => String
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
  @scala.inline
  implicit class IProximityDeviceStaticsOps[Self <: IProximityDeviceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromId(value: String => ProximityDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefault(value: () => ProximityDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
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

