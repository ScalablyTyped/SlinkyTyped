package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 9. Virtual Box
@js.native
trait VboxInfoData extends js.Object {
  var ACPI: Boolean = js.native
  var APIC: Boolean = js.native
  var HPET: Boolean = js.native
  var IOAPIC: Boolean = js.native
  var PAE: Boolean = js.native
  var RTC: String = js.native
  var X2APIC: Boolean = js.native
  var biosAPICmode: String = js.native
  var bootDevice1: String = js.native
  var bootDevice2: String = js.native
  var bootDevice3: String = js.native
  var bootDevice4: String = js.native
  var bootMenuMode: String = js.native
  var chipset: String = js.native
  var configFile: String = js.native
  var cpuExepCap: String = js.native
  var cpuProfile: String = js.native
  var cpus: Double = js.native
  var firmware: String = js.native
  var guestOS: String = js.native
  var hardwareUUID: String = js.native
  var id: String = js.native
  var logFolder: String = js.native
  var longMode: Boolean = js.native
  var memory: Double = js.native
  var name: String = js.native
  var pageFusion: Boolean = js.native
  var running: Boolean = js.native
  var runningSince: Double = js.native
  var snapshotFolder: String = js.native
  var started: String = js.native
  var stopped: String = js.native
  var stoppedSince: Double = js.native
  var timeOffset: String = js.native
  var tripleFaultReset: Boolean = js.native
  var vram: Double = js.native
}

object VboxInfoData {
  @scala.inline
  def apply(
    ACPI: Boolean,
    APIC: Boolean,
    HPET: Boolean,
    IOAPIC: Boolean,
    PAE: Boolean,
    RTC: String,
    X2APIC: Boolean,
    biosAPICmode: String,
    bootDevice1: String,
    bootDevice2: String,
    bootDevice3: String,
    bootDevice4: String,
    bootMenuMode: String,
    chipset: String,
    configFile: String,
    cpuExepCap: String,
    cpuProfile: String,
    cpus: Double,
    firmware: String,
    guestOS: String,
    hardwareUUID: String,
    id: String,
    logFolder: String,
    longMode: Boolean,
    memory: Double,
    name: String,
    pageFusion: Boolean,
    running: Boolean,
    runningSince: Double,
    snapshotFolder: String,
    started: String,
    stopped: String,
    stoppedSince: Double,
    timeOffset: String,
    tripleFaultReset: Boolean,
    vram: Double
  ): VboxInfoData = {
    val __obj = js.Dynamic.literal(ACPI = ACPI.asInstanceOf[js.Any], APIC = APIC.asInstanceOf[js.Any], HPET = HPET.asInstanceOf[js.Any], IOAPIC = IOAPIC.asInstanceOf[js.Any], PAE = PAE.asInstanceOf[js.Any], RTC = RTC.asInstanceOf[js.Any], X2APIC = X2APIC.asInstanceOf[js.Any], biosAPICmode = biosAPICmode.asInstanceOf[js.Any], bootDevice1 = bootDevice1.asInstanceOf[js.Any], bootDevice2 = bootDevice2.asInstanceOf[js.Any], bootDevice3 = bootDevice3.asInstanceOf[js.Any], bootDevice4 = bootDevice4.asInstanceOf[js.Any], bootMenuMode = bootMenuMode.asInstanceOf[js.Any], chipset = chipset.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cpuExepCap = cpuExepCap.asInstanceOf[js.Any], cpuProfile = cpuProfile.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], guestOS = guestOS.asInstanceOf[js.Any], hardwareUUID = hardwareUUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logFolder = logFolder.asInstanceOf[js.Any], longMode = longMode.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageFusion = pageFusion.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], runningSince = runningSince.asInstanceOf[js.Any], snapshotFolder = snapshotFolder.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], stoppedSince = stoppedSince.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], tripleFaultReset = tripleFaultReset.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any])
    __obj.asInstanceOf[VboxInfoData]
  }
  @scala.inline
  implicit class VboxInfoDataOps[Self <: VboxInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACPI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPIC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHPET(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HPET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOAPIC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IOAPIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRTC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2APIC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X2APIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiosAPICmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biosAPICmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootDevice1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDevice1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootDevice2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDevice2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootDevice3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDevice3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootDevice4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDevice4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootMenuMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootMenuMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChipset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chipset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuExepCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuExepCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuestOS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardwareUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareUUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFusion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunningSince(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppedSince(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleFaultReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleFaultReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVram(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vram")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

