package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/RepositoryNotTreeError", JSImport.Namespace)
@js.native
object repositoryNotTreeErrorMod extends js.Object {
  
  @js.native
  class RepositoryNotTreeError protected () extends Error {
    def this(entityClass: EntityTarget[_]) = this()
  }
}
