package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingJoinColumnErrorMod {
  
  @JSImport("typeorm/browser/error/MissingJoinColumnError", "MissingJoinColumnError")
  @js.native
  class MissingJoinColumnError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
