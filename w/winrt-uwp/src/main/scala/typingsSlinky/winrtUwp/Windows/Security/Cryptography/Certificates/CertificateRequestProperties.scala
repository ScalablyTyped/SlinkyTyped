package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of a certificate request. */
@js.native
trait CertificateRequestProperties extends js.Object {
  /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
  var attestationCredentialCertificate: Certificate = js.native
  /** Gets or sets the container name. */
  var containerName: String = js.native
  /** Gets or sets the prefix of the container name. */
  var containerNamePrefix: String = js.native
  /** Gets or sets the name of the elliptic curve. */
  var curveName: String = js.native
  /** Gets or sets the parameters of the elliptic curve. */
  var curveParameters: Double = js.native
  /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
  var exportable: ExportOption = js.native
  /** Gets or sets the display name of the enrolled certificate. */
  var friendlyName: String = js.native
  /** Gets or sets the hash algorithm used when creating the certificate request signature. */
  var hashAlgorithmName: String = js.native
  /** Gets or sets the public key algorithm. */
  var keyAlgorithmName: String = js.native
  /** Gets or sets the level of strong key protection. */
  var keyProtectionLevel: KeyProtectionLevel = js.native
  /** Gets or sets the size, in bits, of the private key to be generated. */
  var keySize: Double = js.native
  /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
  var keyStorageProviderName: String = js.native
  /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
  var keyUsages: EnrollKeyUsages = js.native
  /** Gets or sets the certificate used to sign the certificate request. */
  var signingCertificate: Certificate = js.native
  /** Gets or sets the name of the smart card reader used to create the certificate request. */
  var smartcardReaderName: String = js.native
  /** Gets or sets the subject name. */
  var subject: String = js.native
  /** Gets or sets whether to use the existing key. */
  var useExistingKey: Boolean = js.native
}

object CertificateRequestProperties {
  @scala.inline
  def apply(
    attestationCredentialCertificate: Certificate,
    containerName: String,
    containerNamePrefix: String,
    curveName: String,
    curveParameters: Double,
    exportable: ExportOption,
    friendlyName: String,
    hashAlgorithmName: String,
    keyAlgorithmName: String,
    keyProtectionLevel: KeyProtectionLevel,
    keySize: Double,
    keyStorageProviderName: String,
    keyUsages: EnrollKeyUsages,
    signingCertificate: Certificate,
    smartcardReaderName: String,
    subject: String,
    useExistingKey: Boolean
  ): CertificateRequestProperties = {
    val __obj = js.Dynamic.literal(attestationCredentialCertificate = attestationCredentialCertificate.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], containerNamePrefix = containerNamePrefix.asInstanceOf[js.Any], curveName = curveName.asInstanceOf[js.Any], curveParameters = curveParameters.asInstanceOf[js.Any], exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], keyAlgorithmName = keyAlgorithmName.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], keyUsages = keyUsages.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], smartcardReaderName = smartcardReaderName.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], useExistingKey = useExistingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequestProperties]
  }
  @scala.inline
  implicit class CertificateRequestPropertiesOps[Self <: CertificateRequestProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestationCredentialCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationCredentialCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveParameters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveParameters")(value.asInstanceOf[js.Any])
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
    def withSigningCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmartcardReaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartcardReaderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseExistingKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExistingKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

