package typingsSlinky.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 8. Docker
@js.native
trait DockerInfoData extends StObject {
  
  var architecture: String = js.native
  
  var bridgeNfIp6tables: Boolean = js.native
  
  var bridgeNfIptables: Boolean = js.native
  
  var cgroupDriver: String = js.native
  
  var clusterAdvertise: String = js.native
  
  var clusterStore: String = js.native
  
  var containers: Double = js.native
  
  var containersPaused: Double = js.native
  
  var containersRunning: Double = js.native
  
  var containersStopped: Double = js.native
  
  var cpuCfsPeriod: Boolean = js.native
  
  var cpuCfsQuota: Boolean = js.native
  
  var cpuSet: Boolean = js.native
  
  var cpuShares: Boolean = js.native
  
  var debug: Boolean = js.native
  
  var defaultRuntime: String = js.native
  
  var dockerRootDir: String = js.native
  
  var driver: String = js.native
  
  var experimentalBuild: Boolean = js.native
  
  var httpProxy: String = js.native
  
  var httpsProxy: String = js.native
  
  var id: String = js.native
  
  var images: Double = js.native
  
  var initBinary: String = js.native
  
  var ipv4Forwarding: Boolean = js.native
  
  var isolation: String = js.native
  
  var kernelMemory: Boolean = js.native
  
  var kernelVersion: String = js.native
  
  var labels: js.Array[String] = js.native
  
  var liveRestoreEnabled: Boolean = js.native
  
  var loggingDriver: String = js.native
  
  var memTotal: Double = js.native
  
  var memoryLimit: Boolean = js.native
  
  var mfd: Double = js.native
  
  var nEventsListener: Double = js.native
  
  var name: String = js.native
  
  var ncpu: Double = js.native
  
  var ngoroutines: Double = js.native
  
  var noProxy: String = js.native
  
  var oomKillDisable: Boolean = js.native
  
  var operatingSystem: String = js.native
  
  var osType: String = js.native
  
  var productLicense: String = js.native
  
  var serverVersion: String = js.native
  
  var swapLimit: Boolean = js.native
  
  var systemTime: String = js.native
}
object DockerInfoData {
  
  @scala.inline
  def apply(
    architecture: String,
    bridgeNfIp6tables: Boolean,
    bridgeNfIptables: Boolean,
    cgroupDriver: String,
    clusterAdvertise: String,
    clusterStore: String,
    containers: Double,
    containersPaused: Double,
    containersRunning: Double,
    containersStopped: Double,
    cpuCfsPeriod: Boolean,
    cpuCfsQuota: Boolean,
    cpuSet: Boolean,
    cpuShares: Boolean,
    debug: Boolean,
    defaultRuntime: String,
    dockerRootDir: String,
    driver: String,
    experimentalBuild: Boolean,
    httpProxy: String,
    httpsProxy: String,
    id: String,
    images: Double,
    initBinary: String,
    ipv4Forwarding: Boolean,
    isolation: String,
    kernelMemory: Boolean,
    kernelVersion: String,
    labels: js.Array[String],
    liveRestoreEnabled: Boolean,
    loggingDriver: String,
    memTotal: Double,
    memoryLimit: Boolean,
    mfd: Double,
    nEventsListener: Double,
    name: String,
    ncpu: Double,
    ngoroutines: Double,
    noProxy: String,
    oomKillDisable: Boolean,
    operatingSystem: String,
    osType: String,
    productLicense: String,
    serverVersion: String,
    swapLimit: Boolean,
    systemTime: String
  ): DockerInfoData = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], bridgeNfIp6tables = bridgeNfIp6tables.asInstanceOf[js.Any], bridgeNfIptables = bridgeNfIptables.asInstanceOf[js.Any], cgroupDriver = cgroupDriver.asInstanceOf[js.Any], clusterAdvertise = clusterAdvertise.asInstanceOf[js.Any], clusterStore = clusterStore.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], containersPaused = containersPaused.asInstanceOf[js.Any], containersRunning = containersRunning.asInstanceOf[js.Any], containersStopped = containersStopped.asInstanceOf[js.Any], cpuCfsPeriod = cpuCfsPeriod.asInstanceOf[js.Any], cpuCfsQuota = cpuCfsQuota.asInstanceOf[js.Any], cpuSet = cpuSet.asInstanceOf[js.Any], cpuShares = cpuShares.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultRuntime = defaultRuntime.asInstanceOf[js.Any], dockerRootDir = dockerRootDir.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], experimentalBuild = experimentalBuild.asInstanceOf[js.Any], httpProxy = httpProxy.asInstanceOf[js.Any], httpsProxy = httpsProxy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], initBinary = initBinary.asInstanceOf[js.Any], ipv4Forwarding = ipv4Forwarding.asInstanceOf[js.Any], isolation = isolation.asInstanceOf[js.Any], kernelMemory = kernelMemory.asInstanceOf[js.Any], kernelVersion = kernelVersion.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], liveRestoreEnabled = liveRestoreEnabled.asInstanceOf[js.Any], loggingDriver = loggingDriver.asInstanceOf[js.Any], memTotal = memTotal.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], mfd = mfd.asInstanceOf[js.Any], nEventsListener = nEventsListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ncpu = ncpu.asInstanceOf[js.Any], ngoroutines = ngoroutines.asInstanceOf[js.Any], noProxy = noProxy.asInstanceOf[js.Any], oomKillDisable = oomKillDisable.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], productLicense = productLicense.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], swapLimit = swapLimit.asInstanceOf[js.Any], systemTime = systemTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerInfoData]
  }
  
  @scala.inline
  implicit class DockerInfoDataMutableBuilder[Self <: DockerInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeNfIp6tables(value: Boolean): Self = StObject.set(x, "bridgeNfIp6tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeNfIptables(value: Boolean): Self = StObject.set(x, "bridgeNfIptables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgroupDriver(value: String): Self = StObject.set(x, "cgroupDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterAdvertise(value: String): Self = StObject.set(x, "clusterAdvertise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStore(value: String): Self = StObject.set(x, "clusterStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainers(value: Double): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersPaused(value: Double): Self = StObject.set(x, "containersPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersRunning(value: Double): Self = StObject.set(x, "containersRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersStopped(value: Double): Self = StObject.set(x, "containersStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCfsPeriod(value: Boolean): Self = StObject.set(x, "cpuCfsPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCfsQuota(value: Boolean): Self = StObject.set(x, "cpuCfsQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuSet(value: Boolean): Self = StObject.set(x, "cpuSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuShares(value: Boolean): Self = StObject.set(x, "cpuShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRuntime(value: String): Self = StObject.set(x, "defaultRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerRootDir(value: String): Self = StObject.set(x, "dockerRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalBuild(value: Boolean): Self = StObject.set(x, "experimentalBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsProxy(value: String): Self = StObject.set(x, "httpsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Double): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitBinary(value: String): Self = StObject.set(x, "initBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4Forwarding(value: Boolean): Self = StObject.set(x, "ipv4Forwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolation(value: String): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMemory(value: Boolean): Self = StObject.set(x, "kernelMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLiveRestoreEnabled(value: Boolean): Self = StObject.set(x, "liveRestoreEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingDriver(value: String): Self = StObject.set(x, "loggingDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemTotal(value: Double): Self = StObject.set(x, "memTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimit(value: Boolean): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfd(value: Double): Self = StObject.set(x, "mfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEventsListener(value: Double): Self = StObject.set(x, "nEventsListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNcpu(value: Double): Self = StObject.set(x, "ncpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgoroutines(value: Double): Self = StObject.set(x, "ngoroutines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProxy(value: String): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOomKillDisable(value: Boolean): Self = StObject.set(x, "oomKillDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLicense(value: String): Self = StObject.set(x, "productLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVersion(value: String): Self = StObject.set(x, "serverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapLimit(value: Boolean): Self = StObject.set(x, "swapLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemTime(value: String): Self = StObject.set(x, "systemTime", value.asInstanceOf[js.Any])
  }
}
