package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/UsingJoinColumnOnlyOnOneSideAllowedError", JSImport.Namespace)
@js.native
object usingJoinColumnOnlyOnOneSideAllowedErrorMod extends js.Object {
  
  @js.native
  class UsingJoinColumnOnlyOnOneSideAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
