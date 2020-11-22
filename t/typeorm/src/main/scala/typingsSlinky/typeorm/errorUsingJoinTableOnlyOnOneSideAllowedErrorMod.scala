package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/UsingJoinTableOnlyOnOneSideAllowedError", JSImport.Namespace)
@js.native
object errorUsingJoinTableOnlyOnOneSideAllowedErrorMod extends js.Object {
  
  @js.native
  class UsingJoinTableOnlyOnOneSideAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
