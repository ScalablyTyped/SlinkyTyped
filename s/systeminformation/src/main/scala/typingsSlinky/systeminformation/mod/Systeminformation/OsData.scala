package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 4. Operating System
@js.native
trait OsData extends js.Object {
  var arch: String = js.native
  var build: String = js.native
  var codename: String = js.native
  var codepage: String = js.native
  var distro: String = js.native
  var hostname: String = js.native
  var kernel: String = js.native
  var logofile: String = js.native
  var platform: String = js.native
  var release: String = js.native
  var serial: String = js.native
  var servicepack: String = js.native
  var uefi: Boolean = js.native
}

object OsData {
  @scala.inline
  def apply(
    arch: String,
    build: String,
    codename: String,
    codepage: String,
    distro: String,
    hostname: String,
    kernel: String,
    logofile: String,
    platform: String,
    release: String,
    serial: String,
    servicepack: String,
    uefi: Boolean
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], codename = codename.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], distro = distro.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], logofile = logofile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], servicepack = servicepack.asInstanceOf[js.Any], uefi = uefi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsData]
  }
  @scala.inline
  implicit class OsDataOps[Self <: OsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogofile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logofile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServicepack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicepack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUefi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uefi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

