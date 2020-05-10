package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 10. "Get All at once" - functions
@js.native
trait StaticData extends js.Object {
  var baseboard: BaseboardData = js.native
  var bios: BiosData = js.native
  var chassis: ChassisData = js.native
  var cpu: CpuWithFlagsData = js.native
  var diskLayout: js.Array[DiskLayoutData] = js.native
  var graphics: GraphicsData = js.native
  var memLayout: js.Array[MemLayoutData] = js.native
  var net: js.Array[NetworkInterfacesData] = js.native
  var os: OsData = js.native
  var system: SystemData = js.native
  var uuid: UuidData = js.native
  var version: String = js.native
  var versions: VersionData = js.native
}

object StaticData {
  @scala.inline
  def apply(
    baseboard: BaseboardData,
    bios: BiosData,
    chassis: ChassisData,
    cpu: CpuWithFlagsData,
    diskLayout: js.Array[DiskLayoutData],
    graphics: GraphicsData,
    memLayout: js.Array[MemLayoutData],
    net: js.Array[NetworkInterfacesData],
    os: OsData,
    system: SystemData,
    uuid: UuidData,
    version: String,
    versions: VersionData
  ): StaticData = {
    val __obj = js.Dynamic.literal(baseboard = baseboard.asInstanceOf[js.Any], bios = bios.asInstanceOf[js.Any], chassis = chassis.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], diskLayout = diskLayout.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], memLayout = memLayout.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticData]
  }
  @scala.inline
  implicit class StaticDataOps[Self <: StaticData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseboard(value: BaseboardData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBios(value: BiosData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChassis(value: ChassisData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu(value: CpuWithFlagsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskLayout(value: js.Array[DiskLayoutData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphics(value: GraphicsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemLayout(value: js.Array[MemLayoutData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNet(value: js.Array[NetworkInterfacesData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: OsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: SystemData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: UuidData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: VersionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

