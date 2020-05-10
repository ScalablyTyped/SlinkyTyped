package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.anyMod.Any
import typingsSlinky.xadesjs.dateTimeMod.XadesDateTime
import typingsSlinky.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/complete_revocation_refs", JSImport.Namespace)
@js.native
object completeRevocationRefsMod extends js.Object {
  @js.native
  class CRLIdentifier () extends XmlObject {
    var IssueTime: XadesDateTime = js.native
    var Issuer: String = js.native
    var Number: Double = js.native
    var URI: String = js.native
  }
  
  @js.native
  class CRLRef () extends XmlObject {
    var CRLIdentifier: typingsSlinky.xadesjs.completeRevocationRefsMod.CRLIdentifier = js.native
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @js.native
  class CRLRefs () extends XmlCollection[CRLRef]
  
  @js.native
  class CompleteRevocationRefs () extends XmlObject {
    var CRLRefs: typingsSlinky.xadesjs.completeRevocationRefsMod.CRLRefs = js.native
    var Id: String = js.native
    var OCSPRefs: typingsSlinky.xadesjs.completeRevocationRefsMod.OCSPRefs = js.native
    var OtherRefs: typingsSlinky.xadesjs.completeRevocationRefsMod.OtherRefs = js.native
  }
  
  @js.native
  class OCSPIdentifier () extends XmlObject {
    var ProducedAt: XadesDateTime = js.native
    var ResponderID: typingsSlinky.xadesjs.completeRevocationRefsMod.ResponderID = js.native
    var URI: String = js.native
  }
  
  @js.native
  class OCSPRef () extends XmlObject {
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    var OCSPIdentifier: typingsSlinky.xadesjs.completeRevocationRefsMod.OCSPIdentifier = js.native
  }
  
  @js.native
  class OCSPRefs () extends XmlCollection[OCSPRef]
  
  @js.native
  class OtherRef () extends Any
  
  @js.native
  class OtherRefs () extends XmlCollection[OtherRef]
  
  @js.native
  class ResponderID () extends XmlObject {
    var ByKey: js.typedarray.Uint8Array = js.native
    var ByName: String = js.native
  }
  
}

