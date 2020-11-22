package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "getTreeRepository")
@js.native
object getTreeRepository extends js.Object {
  
  def apply[Entity](entityClass: EntityTarget[Entity]): typingsSlinky.typeorm.repositoryTreeRepositoryMod.TreeRepository[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity], connectionName: String): typingsSlinky.typeorm.repositoryTreeRepositoryMod.TreeRepository[Entity] = js.native
}
