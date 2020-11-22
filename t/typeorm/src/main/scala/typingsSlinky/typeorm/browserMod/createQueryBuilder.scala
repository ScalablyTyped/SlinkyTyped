package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "createQueryBuilder")
@js.native
object createQueryBuilder extends js.Object {
  
  def apply[Entity](): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](
    entityClass: js.UndefOr[EntityTarget[Entity]],
    alias: js.UndefOr[scala.Nothing],
    connectionName: String
  ): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: js.UndefOr[EntityTarget[Entity]], alias: String): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: js.UndefOr[EntityTarget[Entity]], alias: String, connectionName: String): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
  def apply[Entity](entityClass: EntityTarget[Entity]): typingsSlinky.typeorm.selectQueryBuilderMod.SelectQueryBuilder[Entity] = js.native
}
