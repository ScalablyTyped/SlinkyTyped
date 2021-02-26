package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorUsingJoinTableIsNotAllowedErrorMod {
  
  @JSImport("typeorm/error/UsingJoinTableIsNotAllowedError", "UsingJoinTableIsNotAllowedError")
  @js.native
  class UsingJoinTableIsNotAllowedError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
