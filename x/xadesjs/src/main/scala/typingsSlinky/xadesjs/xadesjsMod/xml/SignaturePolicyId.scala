package typingsSlinky.xadesjs.xadesjsMod.xml

import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.SignaturePolicyId")
@js.native
class SignaturePolicyId () extends XmlObject {
  var SigPolicyHash: DigestAlgAndValueType = js.native
  var SigPolicyId: ObjectIdentifier = js.native
  var SigPolicyQualifiers: typingsSlinky.xadesjs.xadesjsMod.xml.SigPolicyQualifiers = js.native
  var Transforms: typingsSlinky.xmldsigjs.xmldsigjsMod.Transforms = js.native
}

