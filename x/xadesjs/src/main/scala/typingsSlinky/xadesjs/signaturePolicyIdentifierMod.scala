package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.objectIdentifierMod.ObjectIdentifier
import typingsSlinky.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signature_policy_identifier", JSImport.Namespace)
@js.native
object signaturePolicyIdentifierMod extends js.Object {
  @js.native
  class Integer () extends XmlObject {
    var Value: Double = js.native
  }
  
  @js.native
  class IntegerList () extends XmlCollection[Integer]
  
  @js.native
  class NoticeReference () extends XmlObject {
    var NoticeNumbers: IntegerList = js.native
    var Organization: String = js.native
  }
  
  @js.native
  class SPURI () extends XmlObject {
    var Value: String = js.native
  }
  
  @js.native
  class SPUserNotice () extends XmlObject {
    var ExplicitText: String = js.native
    var NoticeRef: NoticeReference = js.native
  }
  
  @js.native
  class SigPolicyHash () extends DigestAlgAndValueType
  
  @js.native
  class SigPolicyId () extends ObjectIdentifier
  
  @js.native
  class SigPolicyQualifier () extends XmlCollection[XadesObject]
  
  @js.native
  class SigPolicyQualifiers () extends XmlCollection[SigPolicyQualifier]
  
  @js.native
  class SignaturePolicyId () extends XmlObject {
    var SigPolicyHash: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SigPolicyHash = js.native
    var SigPolicyId: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SigPolicyId = js.native
    var SigPolicyQualifiers: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SigPolicyQualifiers = js.native
    var Transforms: typingsSlinky.xmldsigjs.mod.Transforms = js.native
  }
  
  @js.native
  class SignaturePolicyIdentifier () extends XmlObject {
    var SignaturePolicyId: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyId = js.native
    var SignaturePolicyImplied: Boolean = js.native
  }
  
}

