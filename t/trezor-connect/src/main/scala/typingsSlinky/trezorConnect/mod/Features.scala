package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectBooleans.`false`
import typingsSlinky.trezorConnect.trezorConnectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  var bootloader_hash: String = js.native
  var bootloader_mode: Boolean | Null = js.native
  var device_id: String = js.native
  var firmware_present: Boolean | Null = js.native
  var flags: Double = js.native
  var fw_major: Double = js.native
  var fw_minor: Double = js.native
  var fw_patch: Double = js.native
  var fw_vendor: String = js.native
  var fw_vendor_keys: String = js.native
  var imported: Boolean = js.native
  var initialized: `true` = js.native
  var label: String | Null = js.native
  var language: String | Null = js.native
  var major_version: Double = js.native
  var minor_version: Double = js.native
  var model: String = js.native
  var needs_backup: `false` = js.native
  var no_backup: Boolean = js.native
  var passphrase_cached: Boolean = js.native
  var passphrase_protection: Boolean = js.native
  var patch_version: Double = js.native
  var pin_cached: Boolean = js.native
  var pin_protection: Boolean = js.native
  var revision: String = js.native
  var unfinished_backup: Boolean = js.native
  var vendor: String = js.native
}

object Features {
  @scala.inline
  def apply(
    bootloader_hash: String,
    device_id: String,
    flags: Double,
    fw_major: Double,
    fw_minor: Double,
    fw_patch: Double,
    fw_vendor: String,
    fw_vendor_keys: String,
    imported: Boolean,
    initialized: `true`,
    major_version: Double,
    minor_version: Double,
    model: String,
    needs_backup: `false`,
    no_backup: Boolean,
    passphrase_cached: Boolean,
    passphrase_protection: Boolean,
    patch_version: Double,
    pin_cached: Boolean,
    pin_protection: Boolean,
    revision: String,
    unfinished_backup: Boolean,
    vendor: String
  ): Features = {
    val __obj = js.Dynamic.literal(bootloader_hash = bootloader_hash.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fw_major = fw_major.asInstanceOf[js.Any], fw_minor = fw_minor.asInstanceOf[js.Any], fw_patch = fw_patch.asInstanceOf[js.Any], fw_vendor = fw_vendor.asInstanceOf[js.Any], fw_vendor_keys = fw_vendor_keys.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], major_version = major_version.asInstanceOf[js.Any], minor_version = minor_version.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], needs_backup = needs_backup.asInstanceOf[js.Any], no_backup = no_backup.asInstanceOf[js.Any], passphrase_cached = passphrase_cached.asInstanceOf[js.Any], passphrase_protection = passphrase_protection.asInstanceOf[js.Any], patch_version = patch_version.asInstanceOf[js.Any], pin_cached = pin_cached.asInstanceOf[js.Any], pin_protection = pin_protection.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], unfinished_backup = unfinished_backup.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootloader_hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloader_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFw_major(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fw_major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFw_minor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fw_minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFw_patch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fw_patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFw_vendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fw_vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFw_vendor_keys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fw_vendor_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialized(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeeds_backup(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needs_backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNo_backup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassphrase_cached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase_cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassphrase_protection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase_protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPin_cached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPin_protection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfinished_backup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfinished_backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootloader_mode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloader_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootloader_modeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloader_mode")(null)
        ret
    }
    @scala.inline
    def withFirmware_present(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmware_present")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmware_presentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmware_present")(null)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(null)
        ret
    }
  }
  
}

