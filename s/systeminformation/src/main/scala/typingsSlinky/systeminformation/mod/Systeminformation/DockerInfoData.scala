package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 8. Docker
@js.native
trait DockerInfoData extends js.Object {
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
  implicit class DockerInfoDataOps[Self <: DockerInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridgeNfIp6tables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeNfIp6tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridgeNfIptables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeNfIptables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCgroupDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgroupDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterAdvertise(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAdvertise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterStore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainersPaused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containersPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainersRunning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containersRunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainersStopped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containersStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuCfsPeriod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCfsPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuCfsQuota(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCfsQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuShares(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuShares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockerRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExperimentalBuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpsProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv4Forwarding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Forwarding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelMemory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveRestoreEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveRestoreEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggingDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMfd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEventsListener(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nEventsListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNcpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgoroutines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngoroutines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOomKillDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oomKillDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLicense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

