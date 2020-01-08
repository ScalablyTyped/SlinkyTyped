package typingsSlinky.xmldsigjs

import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/signed_info", JSImport.Namespace)
@js.native
object buildTypesXmlSignedUnderscoreInfoMod extends js.Object {
  @js.native
  class SignedInfo () extends XmlObject {
    /**
      * Gets or sets the canonicalization algorithm that is used before signing
      * for the current SignedInfo object.
      */
    var CanonicalizationMethod: typingsSlinky.xmldsigjs.buildTypesXmlCanonicalizationUnderscoreMethodMod.CanonicalizationMethod = js.native
    /**
      * Gets or sets the ID of the current SignedInfo object.
      *
      * @type {string}
      * @memberOf SignedInfo
      */
    var Id: String = js.native
    var References: typingsSlinky.xmldsigjs.buildTypesXmlReferenceMod.References = js.native
    /**
      * Gets or sets the name of the algorithm used for signature generation
      * and validation for the current SignedInfo object.
      */
    var SignatureMethod: typingsSlinky.xmldsigjs.buildTypesXmlSignatureUnderscoreMethodMod.SignatureMethod = js.native
  }
  
}

