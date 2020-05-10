package typingsSlinky.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICertificateRequestProperties extends js.Object {
  var exportable: ExportOption = js.native
  var friendlyName: String = js.native
  var hashAlgorithmName: String = js.native
  var keyAlgorithmName: String = js.native
  var keyProtectionLevel: KeyProtectionLevel = js.native
  var keySize: Double = js.native
  var keyStorageProviderName: String = js.native
  var keyUsages: EnrollKeyUsages = js.native
  var subject: String = js.native
}

object ICertificateRequestProperties {
  @scala.inline
  def apply(
    exportable: ExportOption,
    friendlyName: String,
    hashAlgorithmName: String,
    keyAlgorithmName: String,
    keyProtectionLevel: KeyProtectionLevel,
    keySize: Double,
    keyStorageProviderName: String,
    keyUsages: EnrollKeyUsages,
    subject: String
  ): ICertificateRequestProperties = {
    val __obj = js.Dynamic.literal(exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], keyAlgorithmName = keyAlgorithmName.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], keyUsages = keyUsages.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
  @scala.inline
  implicit class ICertificateRequestPropertiesOps[Self <: ICertificateRequestProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withHashAlgorithmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAlgorithmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyProtectionLevel(value: KeyProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProtectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyStorageProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStorageProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyUsages(value: EnrollKeyUsages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

