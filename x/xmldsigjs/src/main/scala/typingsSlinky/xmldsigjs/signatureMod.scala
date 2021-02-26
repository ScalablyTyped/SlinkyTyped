package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.dataObjectMod.DataObjects
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("xmldsigjs/build/types/xml/signature", "Signature")
  @js.native
  class Signature () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    /**
      * Gets or sets the ID of the current Signature.
      */
    var Id: String = js.native
    
    /**
      * Gets or sets the KeyInfo of the current Signature.
      */
    var KeyInfo: typingsSlinky.xmldsigjs.keyInfoMod.KeyInfo = js.native
    
    var ObjectList: DataObjects = js.native
    
    /**
      * Gets or sets the value of the digital signature.
      */
    var SignatureValue: js.typedarray.Uint8Array | Null = js.native
    
    /**
      * Gets or sets the SignedInfo of the current Signature.
      */
    var SignedInfo: typingsSlinky.xmldsigjs.signedInfoMod.SignedInfo = js.native
  }
}
