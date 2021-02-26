package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import typingsSlinky.typeorm.relationCountRelationCountLoadResultMod.RelationCountLoadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountRelationCountLoaderMod {
  
  @JSImport("typeorm/query-builder/relation-count/RelationCountLoader", "RelationCountLoader")
  @js.native
  class RelationCountLoader protected () extends StObject {
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
