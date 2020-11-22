package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/MissingDeleteDateColumnError", JSImport.Namespace)
@js.native
object errorMissingDeleteDateColumnErrorMod extends js.Object {
  
  @js.native
  class MissingDeleteDateColumnError protected () extends Error {
    def this(entityMetadata: EntityMetadata) = this()
  }
}
