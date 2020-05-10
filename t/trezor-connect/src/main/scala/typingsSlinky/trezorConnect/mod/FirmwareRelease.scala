package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirmwareRelease extends js.Object {
  var bootloader_version: js.Array[Double] = js.native
  var changelog: String = js.native
  var channel: String = js.native
  var fingerprint: String = js.native
  var min_bootloader_version: js.Array[Double] = js.native
  var min_bridge_version: js.Array[Double] = js.native
  var min_firmware_version: js.Array[Double] = js.native
  var required: Boolean = js.native
  var url: String = js.native
  var version: js.Array[Double] = js.native
}

object FirmwareRelease {
  @scala.inline
  def apply(
    bootloader_version: js.Array[Double],
    changelog: String,
    channel: String,
    fingerprint: String,
    min_bootloader_version: js.Array[Double],
    min_bridge_version: js.Array[Double],
    min_firmware_version: js.Array[Double],
    required: Boolean,
    url: String,
    version: js.Array[Double]
  ): FirmwareRelease = {
    val __obj = js.Dynamic.literal(bootloader_version = bootloader_version.asInstanceOf[js.Any], changelog = changelog.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], min_bootloader_version = min_bootloader_version.asInstanceOf[js.Any], min_bridge_version = min_bridge_version.asInstanceOf[js.Any], min_firmware_version = min_firmware_version.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirmwareRelease]
  }
  @scala.inline
  implicit class FirmwareReleaseOps[Self <: FirmwareRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootloader_version(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloader_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangelog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_bootloader_version(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_bootloader_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_bridge_version(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_bridge_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_firmware_version(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_firmware_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

