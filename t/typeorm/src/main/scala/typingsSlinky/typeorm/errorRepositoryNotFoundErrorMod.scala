package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/RepositoryNotFoundError", JSImport.Namespace)
@js.native
object errorRepositoryNotFoundErrorMod extends js.Object {
  
  @js.native
  class RepositoryNotFoundError protected () extends Error {
    def this(connectionName: String, entityClass: EntityTarget[_]) = this()
  }
}
