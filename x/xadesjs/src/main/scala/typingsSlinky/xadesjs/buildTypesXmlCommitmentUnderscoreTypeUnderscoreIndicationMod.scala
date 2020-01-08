package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.buildTypesXmlAnyMod.Any
import typingsSlinky.xadesjs.buildTypesXmlObjectUnderscoreIdentifierMod.ObjectIdentifier
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlCollection
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/commitment_type_indication", JSImport.Namespace)
@js.native
object buildTypesXmlCommitmentUnderscoreTypeUnderscoreIndicationMod extends js.Object {
  @js.native
  class CommitmentTypeIndication () extends XmlObject {
    var AllSignedDataObjects: Boolean = js.native
    var CommitmentTypeId: ObjectIdentifier = js.native
    var CommitmentTypeQualifiers: typingsSlinky.xadesjs.buildTypesXmlCommitmentUnderscoreTypeUnderscoreIndicationMod.CommitmentTypeQualifiers = js.native
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

