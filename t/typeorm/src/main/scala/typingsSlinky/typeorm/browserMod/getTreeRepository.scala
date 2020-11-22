package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getTreeRepository")
@js.native
object getTreeRepository extends js.Object {
  
  def apply[Entity](entityClass: EntityTarget[Entity]): typingsSlinky.typeorm.treeRepositoryMod.TreeRepository[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity], connectionName: String): typingsSlinky.typeorm.treeRepositoryMod.TreeRepository[Entity] = js.native
}
