package typingsSlinky.xmldsigjs.xmldsigjsMod

import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Signature")
@js.native
class Signature () extends XmlObject {
  /**
    * Gets or sets the ID of the current Signature.
    */
  var Id: String = js.native
  /**
    * Gets or sets the KeyInfo of the current Signature.
    */
  var KeyInfo: typingsSlinky.xmldsigjs.xmldsigjsMod.KeyInfo = js.native
  var ObjectList: DataObjects = js.native
  /**
    * Gets or sets the value of the digital signature.
    */
  var SignatureValue: scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  /**
    * Gets or sets the SignedInfo of the current Signature.
    */
  var SignedInfo: typingsSlinky.xmldsigjs.xmldsigjsMod.SignedInfo = js.native
}

