package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import typingsSlinky.typeorm.relationCountRelationCountLoadResultMod.RelationCountLoadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/relation-count/RelationCountLoader", JSImport.Namespace)
@js.native
object relationCountRelationCountLoaderMod extends js.Object {
  
  @js.native
  class RelationCountLoader protected () extends js.Object {
    def this(
      connection: Connection,
      queryRunner: js.UndefOr[scala.Nothing],
      relationCountAttributes: js.Array[RelationCountAttribute]
    ) = this()
    def this(
      connection: Connection,
      queryRunner: QueryRunner,
      relationCountAttributes: js.Array[RelationCountAttribute]
    ) = this()
    
    var connection: Connection = js.native
    
    def load(rawEntities: js.Array[_]): js.Promise[js.Array[RelationCountLoadResult]] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var relationCountAttributes: js.Array[RelationCountAttribute] = js.native
  }
}
