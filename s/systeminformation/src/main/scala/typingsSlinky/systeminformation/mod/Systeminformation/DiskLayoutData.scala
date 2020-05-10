package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskLayoutData extends js.Object {
  var bytesPerSector: Double = js.native
  var device: String = js.native
  var firmwareRevision: String = js.native
  var interfaceType: String = js.native
  var name: String = js.native
  var sectorsPerTrack: Double = js.native
  var serialNum: String = js.native
  var size: Double = js.native
  var smartStatus: String = js.native
  var totalCylinders: Double = js.native
  var totalHeads: Double = js.native
  var totalSectors: Double = js.native
  var totalTracks: Double = js.native
  var tracksPerCylinder: Double = js.native
  var `type`: String = js.native
  var vendor: String = js.native
}

object DiskLayoutData {
  @scala.inline
  def apply(
    bytesPerSector: Double,
    device: String,
    firmwareRevision: String,
    interfaceType: String,
    name: String,
    sectorsPerTrack: Double,
    serialNum: String,
    size: Double,
    smartStatus: String,
    totalCylinders: Double,
    totalHeads: Double,
    totalSectors: Double,
    totalTracks: Double,
    tracksPerCylinder: Double,
    `type`: String,
    vendor: String
  ): DiskLayoutData = {
    val __obj = js.Dynamic.literal(bytesPerSector = bytesPerSector.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firmwareRevision = firmwareRevision.asInstanceOf[js.Any], interfaceType = interfaceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sectorsPerTrack = sectorsPerTrack.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smartStatus = smartStatus.asInstanceOf[js.Any], totalCylinders = totalCylinders.asInstanceOf[js.Any], totalHeads = totalHeads.asInstanceOf[js.Any], totalSectors = totalSectors.asInstanceOf[js.Any], totalTracks = totalTracks.asInstanceOf[js.Any], tracksPerCylinder = tracksPerCylinder.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskLayoutData]
  }
  @scala.inline
  implicit class DiskLayoutDataOps[Self <: DiskLayoutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesPerSector(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesPerSector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmwareRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectorsPerTrack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectorsPerTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmartStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCylinders(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCylinders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalHeads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalHeads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSectors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTracks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracksPerCylinder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracksPerCylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

