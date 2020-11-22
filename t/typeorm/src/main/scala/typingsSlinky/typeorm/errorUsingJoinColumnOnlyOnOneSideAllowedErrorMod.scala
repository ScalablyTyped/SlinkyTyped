package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/UsingJoinColumnOnlyOnOneSideAllowedError", JSImport.Namespace)
@js.native
object errorUsingJoinColumnOnlyOnOneSideAllowedErrorMod extends js.Object {
  
  @js.native
  class UsingJoinColumnOnlyOnOneSideAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
