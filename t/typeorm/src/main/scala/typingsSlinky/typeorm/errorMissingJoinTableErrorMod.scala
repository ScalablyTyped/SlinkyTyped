package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMissingJoinTableErrorMod {
  
  @JSImport("typeorm/error/MissingJoinTableError", "MissingJoinTableError")
  @js.native
  class MissingJoinTableError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
