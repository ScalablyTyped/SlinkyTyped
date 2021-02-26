package typingsSlinky.typeorm

import typingsSlinky.typeorm.connectionMod.Connection
import typingsSlinky.typeorm.queryResultCacheMod.QueryResultCache
import typingsSlinky.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbQueryResultCacheMod {
  
  @JSImport("typeorm/browser/cache/DbQueryResultCache", "DbQueryResultCache")
  @js.native
  class DbQueryResultCache protected () extends QueryResultCache {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
    
    /**
      * Gets a query runner to work with.
      */
    /* protected */ def getQueryRunner(): QueryRunner = js.native
    /* protected */ def getQueryRunner(queryRunner: QueryRunner): QueryRunner = js.native
    
    var queryResultCacheTable: js.Any = js.native
  }
}
