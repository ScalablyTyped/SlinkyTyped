package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/InitializedRelationError", JSImport.Namespace)
@js.native
object errorInitializedRelationErrorMod extends js.Object {
  
  @js.native
  class InitializedRelationError protected () extends Error {
    def this(relation: RelationMetadata) = this()
  }
}
