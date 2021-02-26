package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryNotFoundErrorMod {
  
  @JSImport("typeorm/browser/error/RepositoryNotFoundError", "RepositoryNotFoundError")
  @js.native
  class RepositoryNotFoundError protected () extends Error {
    def this(connectionName: String, entityClass: EntityTarget[_]) = this()
  }
}
