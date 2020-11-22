package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/MissingDeleteDateColumnError", JSImport.Namespace)
@js.native
object missingDeleteDateColumnErrorMod extends js.Object {
  
  @js.native
  class MissingDeleteDateColumnError protected () extends Error {
    def this(entityMetadata: EntityMetadata) = this()
  }
}
