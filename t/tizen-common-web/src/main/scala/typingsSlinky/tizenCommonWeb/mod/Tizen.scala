package typingsSlinky.tizenCommonWeb.mod

import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlConstructor
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlDataConstructor
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationManager
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadManager
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadRequestConstructor
import typingsSlinky.tizenCommonWeb.filesystemMod.FilesystemManager
import typingsSlinky.tizenCommonWeb.packageMod.PackageManager
import typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoManager
import typingsSlinky.tizenCommonWeb.timeMod.TZDateConstructor
import typingsSlinky.tizenCommonWeb.timeMod.TimeDurationConstructor
import typingsSlinky.tizenCommonWeb.timeMod.TimeUtil
import typingsSlinky.tizenCommonWeb.tizenMod.AttributeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.AttributeRangeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.BundleConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.SimpleCoordinatesConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.SortModeConstructor
import typingsSlinky.tizenCommonWeb.tvaudiocontrolMod.TVAudioControlManager
import typingsSlinky.tizenCommonWeb.tvdisplaycontrolMod.TVDisplayControlManager
import typingsSlinky.tizenCommonWeb.tvinfoMod.TVInfoManager
import typingsSlinky.tizenCommonWeb.tvinputdeviceMod.TVInputDeviceManager
import typingsSlinky.tizenCommonWeb.tvwindowMod.TVWindowManager
import typingsSlinky.tizenCommonWeb.websettingMod.WebSettingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tizen extends js.Object {
  
  var ApplicationControl: ApplicationControlConstructor = js.native
  
  var ApplicationControlData: ApplicationControlDataConstructor = js.native
  
  var AttributeFilter: AttributeFilterConstructor = js.native
  
  var AttributeRangeFilter: AttributeRangeFilterConstructor = js.native
  
  var Bundle: BundleConstructor = js.native
  
  var CompositeFilter: CompositeFilterConstructor = js.native
  
  var DownloadRequest: DownloadRequestConstructor = js.native
  
  var SimpleCoordinates: SimpleCoordinatesConstructor = js.native
  
  var SortMode: SortModeConstructor = js.native
  
  var TZDate: TZDateConstructor = js.native
  
  var TimeDuration: TimeDurationConstructor = js.native
  
  @JSName("package")
  var _package: PackageManager = js.native
  
  var application: ApplicationManager = js.native
  
  var download: DownloadManager = js.native
  
  var filesystem: FilesystemManager = js.native
  
  var systeminfo: SystemInfoManager = js.native
  
  var time: TimeUtil = js.native
  
  var tvaudiocontrol: TVAudioControlManager = js.native
  
  var tvdisplaycontrol: TVDisplayControlManager = js.native
  
  var tvinfo: TVInfoManager = js.native
  
  var tvinputdevice: TVInputDeviceManager = js.native
  
  var tvwindow: TVWindowManager = js.native
  
  var websetting: WebSettingManager = js.native
}
object Tizen {
  
  @scala.inline
  def apply(
    ApplicationControl: ApplicationControlConstructor,
    ApplicationControlData: ApplicationControlDataConstructor,
    AttributeFilter: AttributeFilterConstructor,
    AttributeRangeFilter: AttributeRangeFilterConstructor,
    Bundle: BundleConstructor,
    CompositeFilter: CompositeFilterConstructor,
    DownloadRequest: DownloadRequestConstructor,
    SimpleCoordinates: SimpleCoordinatesConstructor,
    SortMode: SortModeConstructor,
    TZDate: TZDateConstructor,
    TimeDuration: TimeDurationConstructor,
    _package: PackageManager,
    application: ApplicationManager,
    download: DownloadManager,
    filesystem: FilesystemManager,
    systeminfo: SystemInfoManager,
    time: TimeUtil,
    tvaudiocontrol: TVAudioControlManager,
    tvdisplaycontrol: TVDisplayControlManager,
    tvinfo: TVInfoManager,
    tvinputdevice: TVInputDeviceManager,
    tvwindow: TVWindowManager,
    websetting: WebSettingManager
  ): Tizen = {
    val __obj = js.Dynamic.literal(ApplicationControl = ApplicationControl.asInstanceOf[js.Any], ApplicationControlData = ApplicationControlData.asInstanceOf[js.Any], AttributeFilter = AttributeFilter.asInstanceOf[js.Any], AttributeRangeFilter = AttributeRangeFilter.asInstanceOf[js.Any], Bundle = Bundle.asInstanceOf[js.Any], CompositeFilter = CompositeFilter.asInstanceOf[js.Any], DownloadRequest = DownloadRequest.asInstanceOf[js.Any], SimpleCoordinates = SimpleCoordinates.asInstanceOf[js.Any], SortMode = SortMode.asInstanceOf[js.Any], TZDate = TZDate.asInstanceOf[js.Any], TimeDuration = TimeDuration.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tvaudiocontrol = tvaudiocontrol.asInstanceOf[js.Any], tvdisplaycontrol = tvdisplaycontrol.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], tvinputdevice = tvinputdevice.asInstanceOf[js.Any], tvwindow = tvwindow.asInstanceOf[js.Any], websetting = websetting.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tizen]
  }
  
  @scala.inline
  implicit class TizenOps[Self <: Tizen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationControl(value: ApplicationControlConstructor): Self = this.set("ApplicationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationControlData(value: ApplicationControlDataConstructor): Self = this.set("ApplicationControlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeFilter(value: AttributeFilterConstructor): Self = this.set("AttributeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeRangeFilter(value: AttributeRangeFilterConstructor): Self = this.set("AttributeRangeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundle(value: BundleConstructor): Self = this.set("Bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeFilter(value: CompositeFilterConstructor): Self = this.set("CompositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadRequest(value: DownloadRequestConstructor): Self = this.set("DownloadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleCoordinates(value: SimpleCoordinatesConstructor): Self = this.set("SimpleCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortMode(value: SortModeConstructor): Self = this.set("SortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTZDate(value: TZDateConstructor): Self = this.set("TZDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDuration(value: TimeDurationConstructor): Self = this.set("TimeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: PackageManager): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: ApplicationManager): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: DownloadManager): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesystem(value: FilesystemManager): Self = this.set("filesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysteminfo(value: SystemInfoManager): Self = this.set("systeminfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: TimeUtil): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvaudiocontrol(value: TVAudioControlManager): Self = this.set("tvaudiocontrol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvdisplaycontrol(value: TVDisplayControlManager): Self = this.set("tvdisplaycontrol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvinfo(value: TVInfoManager): Self = this.set("tvinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvinputdevice(value: TVInputDeviceManager): Self = this.set("tvinputdevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvwindow(value: TVWindowManager): Self = this.set("tvwindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsetting(value: WebSettingManager): Self = this.set("websetting", value.asInstanceOf[js.Any])
  }
}
