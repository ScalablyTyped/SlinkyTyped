package typingsSlinky.xmldsigjs

import typingsSlinky.xmlCore.mod.XmlObject
import typingsSlinky.xmldsigjs.dataObjectMod.DataObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/signature", JSImport.Namespace)
@js.native
object signatureMod extends js.Object {
  
  @js.native
  class Signature () extends XmlObject {
    
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
