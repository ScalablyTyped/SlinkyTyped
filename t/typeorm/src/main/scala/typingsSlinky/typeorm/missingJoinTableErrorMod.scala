package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingJoinTableErrorMod {
  
  @JSImport("typeorm/browser/error/MissingJoinTableError", "MissingJoinTableError")
  @js.native
  class MissingJoinTableError protected () extends Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
  }
}
