package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/MissingPrimaryColumnError", JSImport.Namespace)
@js.native
object errorMissingPrimaryColumnErrorMod extends js.Object {
  
  @js.native
  class MissingPrimaryColumnError protected () extends Error {
    def this(entityMetadata: EntityMetadata) = this()
  }
}
