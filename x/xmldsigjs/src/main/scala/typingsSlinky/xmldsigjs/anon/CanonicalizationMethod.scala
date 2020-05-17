package typingsSlinky.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanonicalizationMethod extends js.Object {
  var CanonicalizationMethod: String = js.native
  var DSAKeyValue: String = js.native
  var DigestMethod: String = js.native
  var DigestValue: String = js.native
  var DomainParameters: String = js.native
  var ECDSAKeyValue: String = js.native
  var EncryptedKey: String = js.native
  var Exponent: String = js.native
  var HMACOutputLength: String = js.native
  var KeyInfo: String = js.native
  var KeyName: String = js.native
  var KeyValue: String = js.native
  var Manifest: String = js.native
  var MaskGenerationFunction: String = js.native
  var MgmtData: String = js.native
  var Modulus: String = js.native
  var NamedCurve: String = js.native
  var Object: String = js.native
  var PGPData: String = js.native
  var PublicKey: String = js.native
  var RSAKeyValue: String = js.native
  var RSAPSSParams: String = js.native
  var Reference: String = js.native
  var RetrievalMethod: String = js.native
  var SPKIData: String = js.native
  var SPKIexp: String = js.native
  var SaltLength: String = js.native
  var Signature: String = js.native
  var SignatureMethod: String = js.native
  var SignatureValue: String = js.native
  var SignedInfo: String = js.native
  var Transform: String = js.native
  var Transforms: String = js.native
  var X: String = js.native
  var X509CRL: String = js.native
  var X509Certificate: String = js.native
  var X509Data: String = js.native
  var X509IssuerName: String = js.native
  var X509IssuerSerial: String = js.native
  var X509SKI: String = js.native
  var X509SerialNumber: String = js.native
  var X509SubjectName: String = js.native
  var XPath: String = js.native
  var Y: String = js.native
}

object CanonicalizationMethod {
  @scala.inline
  def apply(
    CanonicalizationMethod: String,
    DSAKeyValue: String,
    DigestMethod: String,
    DigestValue: String,
    DomainParameters: String,
    ECDSAKeyValue: String,
    EncryptedKey: String,
    Exponent: String,
    HMACOutputLength: String,
    KeyInfo: String,
    KeyName: String,
    KeyValue: String,
    Manifest: String,
    MaskGenerationFunction: String,
    MgmtData: String,
    Modulus: String,
    NamedCurve: String,
    Object: String,
    PGPData: String,
    PublicKey: String,
    RSAKeyValue: String,
    RSAPSSParams: String,
    Reference: String,
    RetrievalMethod: String,
    SPKIData: String,
    SPKIexp: String,
    SaltLength: String,
    Signature: String,
    SignatureMethod: String,
    SignatureValue: String,
    SignedInfo: String,
    Transform: String,
    Transforms: String,
    X: String,
    X509CRL: String,
    X509Certificate: String,
    X509Data: String,
    X509IssuerName: String,
    X509IssuerSerial: String,
    X509SKI: String,
    X509SerialNumber: String,
    X509SubjectName: String,
    XPath: String,
    Y: String
  ): CanonicalizationMethod = {
    val __obj = js.Dynamic.literal(CanonicalizationMethod = CanonicalizationMethod.asInstanceOf[js.Any], DSAKeyValue = DSAKeyValue.asInstanceOf[js.Any], DigestMethod = DigestMethod.asInstanceOf[js.Any], DigestValue = DigestValue.asInstanceOf[js.Any], DomainParameters = DomainParameters.asInstanceOf[js.Any], ECDSAKeyValue = ECDSAKeyValue.asInstanceOf[js.Any], EncryptedKey = EncryptedKey.asInstanceOf[js.Any], Exponent = Exponent.asInstanceOf[js.Any], HMACOutputLength = HMACOutputLength.asInstanceOf[js.Any], KeyInfo = KeyInfo.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], KeyValue = KeyValue.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], MaskGenerationFunction = MaskGenerationFunction.asInstanceOf[js.Any], MgmtData = MgmtData.asInstanceOf[js.Any], Modulus = Modulus.asInstanceOf[js.Any], NamedCurve = NamedCurve.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], PGPData = PGPData.asInstanceOf[js.Any], PublicKey = PublicKey.asInstanceOf[js.Any], RSAKeyValue = RSAKeyValue.asInstanceOf[js.Any], RSAPSSParams = RSAPSSParams.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], RetrievalMethod = RetrievalMethod.asInstanceOf[js.Any], SPKIData = SPKIData.asInstanceOf[js.Any], SPKIexp = SPKIexp.asInstanceOf[js.Any], SaltLength = SaltLength.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureMethod = SignatureMethod.asInstanceOf[js.Any], SignatureValue = SignatureValue.asInstanceOf[js.Any], SignedInfo = SignedInfo.asInstanceOf[js.Any], Transform = Transform.asInstanceOf[js.Any], Transforms = Transforms.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], X509CRL = X509CRL.asInstanceOf[js.Any], X509Certificate = X509Certificate.asInstanceOf[js.Any], X509Data = X509Data.asInstanceOf[js.Any], X509IssuerName = X509IssuerName.asInstanceOf[js.Any], X509IssuerSerial = X509IssuerSerial.asInstanceOf[js.Any], X509SKI = X509SKI.asInstanceOf[js.Any], X509SerialNumber = X509SerialNumber.asInstanceOf[js.Any], X509SubjectName = X509SubjectName.asInstanceOf[js.Any], XPath = XPath.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanonicalizationMethod]
  }
  @scala.inline
  implicit class CanonicalizationMethodOps[Self <: CanonicalizationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalizationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanonicalizationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDSAKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DSAKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DigestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DigestValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withECDSAKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECDSAKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHMACOutputLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HMACOutputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskGenerationFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaskGenerationFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMgmtData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MgmtData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modulus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPGPData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PGPData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRSAKeyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSAKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRSAPSSParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSAPSSParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrievalMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrievalMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPKIData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPKIData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPKIexp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPKIexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaltLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaltLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransforms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509CRL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509CRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509Certificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509Data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509IssuerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509IssuerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509IssuerSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509IssuerSerial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509SKI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509SKI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509SerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509SubjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X509SubjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

