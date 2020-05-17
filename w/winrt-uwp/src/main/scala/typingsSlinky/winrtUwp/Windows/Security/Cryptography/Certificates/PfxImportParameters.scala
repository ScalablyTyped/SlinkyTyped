package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents PFX import parameters. */
@js.native
trait PfxImportParameters extends js.Object {
  /** Gets or sets the container name prefix. */
  var containerNamePrefix: String = js.native
  /** Gets or sets the export option. */
  var exportable: ExportOption = js.native
  /** Gets or sets the friendly name. */
  var friendlyName: String = js.native
  /** Gets or sets the install options. */
  var installOptions: InstallOptions = js.native
  /** Gets or sets the key protection level. */
  var keyProtectionLevel: KeyProtectionLevel = js.native
  /** Gets or sets the key storage provider name. */
  var keyStorageProviderName: String = js.native
  /** Gets or sets the reader name. */
  var readerName: String = js.native
}

object PfxImportParameters {
  @scala.inline
  def apply(
    containerNamePrefix: String,
    exportable: ExportOption,
    friendlyName: String,
    installOptions: InstallOptions,
    keyProtectionLevel: KeyProtectionLevel,
    keyStorageProviderName: String,
    readerName: String
  ): PfxImportParameters = {
    val __obj = js.Dynamic.literal(containerNamePrefix = containerNamePrefix.asInstanceOf[js.Any], exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], installOptions = installOptions.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], readerName = readerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PfxImportParameters]
  }
  @scala.inline
  implicit class PfxImportParametersOps[Self <: PfxImportParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportable(value: ExportOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallOptions(value: InstallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyProtectionLevel(value: KeyProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProtectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyStorageProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStorageProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

