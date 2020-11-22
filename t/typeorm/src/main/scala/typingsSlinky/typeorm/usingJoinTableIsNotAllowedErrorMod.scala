package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/UsingJoinTableIsNotAllowedError", JSImport.Namespace)
@js.native
object usingJoinTableIsNotAllowedErrorMod extends js.Object {
  
  @js.native
  class UsingJoinTableIsNotAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
