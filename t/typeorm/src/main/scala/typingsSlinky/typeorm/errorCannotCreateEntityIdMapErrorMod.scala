package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/CannotCreateEntityIdMapError", JSImport.Namespace)
@js.native
object errorCannotCreateEntityIdMapErrorMod extends js.Object {
  
  @js.native
  class CannotCreateEntityIdMapError protected () extends Error {
    def this(metadata: EntityMetadata, id: js.Any) = this()
  }
}
