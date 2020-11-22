package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/RepositoryNotFoundError", JSImport.Namespace)
@js.native
object repositoryNotFoundErrorMod extends js.Object {
  
  @js.native
  class RepositoryNotFoundError protected () extends Error {
    def this(connectionName: String, entityClass: EntityTarget[_]) = this()
  }
}
