package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureCollection
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("xmldsigjs/build/types/xml/reference", "Reference")
  @js.native
  class Reference () extends XmlSignatureObject {
    def this(uri: String) = this()
    
    /**
      * Gets or sets the digest method Uniform Resource Identifier (URI) of the current
      */
    var DigestMethod: typingsSlinky.xmldsigjs.digestMethodMod.DigestMethod = js.native
    
    /**
      * Gets or sets the digest value of the current Reference.
      */
    var DigestValue: js.typedarray.Uint8Array = js.native
    
    /**
      * Gets or sets the ID of the current Reference.
      */
    var Id: String = js.native
    
    var Transforms: typingsSlinky.xmldsigjs.transformCollectionMod.Transforms = js.native
    
    /**
      * Gets or sets the type of the object being signed.
      */
    var Type: String = js.native
    
    /**
      * Gets or sets the Uri of the current Reference.
      */
    var Uri: js.UndefOr[String] = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/reference", "References")
  @js.native
  class References () extends XmlSignatureCollection[Reference] {
    def this(properties: js.Object) = this()
  }
}
