package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import typingsSlinky.typeorm.relationIdAttributeMod.RelationIdAttribute
import typingsSlinky.typeorm.relationIdLoadResultMod.RelationIdLoadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdLoaderMod {
  
  @JSImport("typeorm/browser/query-builder/relation-id/RelationIdLoader", "RelationIdLoader")
  @js.native
  class RelationIdLoader protected () extends StObject {
    def this(
      connection: Connection,
      queryRunner: js.UndefOr[scala.Nothing],
      relationIdAttributes: js.Array[RelationIdAttribute]
    ) = this()
    def this(
      connection: Connection,
      queryRunner: QueryRunner,
      relationIdAttributes: js.Array[RelationIdAttribute]
    ) = this()
    
    var connection: Connection = js.native
    
    def load(rawEntities: js.Array[_]): js.Promise[js.Array[RelationIdLoadResult]] = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    var relationIdAttributes: js.Array[RelationIdAttribute] = js.native
  }
}
