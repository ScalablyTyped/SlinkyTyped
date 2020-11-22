package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getRepository")
@js.native
object getRepository extends js.Object {
  
  def apply[Entity](entityClass: EntityTarget[Entity]): typingsSlinky.typeorm.repositoryMod.Repository[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity], connectionName: String): typingsSlinky.typeorm.repositoryMod.Repository[Entity] = js.native
}
