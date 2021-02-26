package typingsSlinky.typeorm

import typingsSlinky.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheDbQueryResultCacheMod {
  
  @JSImport("typeorm/cache/DbQueryResultCache", "DbQueryResultCache")
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
