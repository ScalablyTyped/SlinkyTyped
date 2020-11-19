package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.anyMod.Any
import typingsSlinky.xadesjs.objectIdentifierMod.ObjectIdentifier
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/commitment_type_indication", JSImport.Namespace)
@js.native
object commitmentTypeIndicationMod extends js.Object {
  
  @js.native
  class CommitmentTypeIndication () extends XmlObject {
    
    var AllSignedDataObjects: Boolean = js.native
    
    var CommitmentTypeId: ObjectIdentifier = js.native
    
    var CommitmentTypeQualifiers: typingsSlinky.xadesjs.commitmentTypeIndicationMod.CommitmentTypeQualifiers = js.native
    
    var ObjectReference: ObjectReferenceCollection = js.native
  }
  
  @js.native
  class CommitmentTypeQualifier () extends Any
  
  @js.native
  class CommitmentTypeQualifiers () extends XmlCollection[CommitmentTypeQualifier]
  
  @js.native
  class ObjectReference () extends XmlObject {
    
    var Value: String = js.native
  }
  
  @js.native
  class ObjectReferenceCollection () extends XmlCollection[ObjectReference]
}
