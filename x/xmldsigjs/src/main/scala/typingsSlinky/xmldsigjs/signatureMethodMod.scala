package typingsSlinky.xmldsigjs

import typingsSlinky.xmlCore.mod.XmlObject
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureCollection
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMethodMod {
  
  @JSImport("xmldsigjs/build/types/xml/signature_method", "SignatureMethod")
  @js.native
  class SignatureMethod () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var Algorithm: String = js.native
    
    var Any: SignatureMethodOther = js.native
    
    /**
      * Parameters for the XML Signature HMAC Algorithm.
      * The parameters include an optional output length which specifies the MAC truncation length in bits.
      *
      * @type {number}
      * @memberOf SignatureMethod
      */
    var HMACOutputLength: Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/signature_method", "SignatureMethodOther")
  @js.native
  class SignatureMethodOther () extends XmlSignatureCollection[XmlObject] {
    def this(properties: js.Object) = this()
  }
}
