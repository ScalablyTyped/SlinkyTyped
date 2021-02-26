package typingsSlinky.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 4. Operating System
@js.native
trait OsData extends StObject {
  
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
  implicit class OsDataMutableBuilder[Self <: OsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepage(value: String): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistro(value: String): Self = StObject.set(x, "distro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: String): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogofile(value: String): Self = StObject.set(x, "logofile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicepack(value: String): Self = StObject.set(x, "servicepack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUefi(value: Boolean): Self = StObject.set(x, "uefi", value.asInstanceOf[js.Any])
  }
}
