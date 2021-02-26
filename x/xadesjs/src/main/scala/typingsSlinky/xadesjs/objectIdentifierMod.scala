package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.xmlBaseMod.XadesCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectIdentifierMod {
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "DocumentationReference")
  @js.native
  class DocumentationReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "DocumentationReferences")
  @js.native
  class DocumentationReferences () extends XadesCollection[DocumentationReference] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "Identifier")
  @js.native
  class Identifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Qualifier: IdentifierQualifier = js.native
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/object_identifier", "ObjectIdentifier")
  @js.native
  class ObjectIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Description: String = js.native
    
    var DocumentationReferences: typingsSlinky.xadesjs.objectIdentifierMod.DocumentationReferences = js.native
    
    var Identifier: typingsSlinky.xadesjs.objectIdentifierMod.Identifier = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xadesjs.xadesjsStrings.OIDAsURI
    - typingsSlinky.xadesjs.xadesjsStrings.OIDAsURN
  */
  trait IdentifierQualifier extends StObject
  object IdentifierQualifier {
    
    @scala.inline
    def OIDAsURI: typingsSlinky.xadesjs.xadesjsStrings.OIDAsURI = "OIDAsURI".asInstanceOf[typingsSlinky.xadesjs.xadesjsStrings.OIDAsURI]
    
    @scala.inline
    def OIDAsURN: typingsSlinky.xadesjs.xadesjsStrings.OIDAsURN = "OIDAsURN".asInstanceOf[typingsSlinky.xadesjs.xadesjsStrings.OIDAsURN]
  }
}
