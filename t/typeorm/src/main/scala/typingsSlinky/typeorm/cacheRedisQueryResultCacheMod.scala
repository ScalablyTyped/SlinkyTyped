package typingsSlinky.typeorm

import typingsSlinky.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.typeormStrings.ioredis
import typingsSlinky.typeorm.typeormStrings.ioredisSlashcluster
import typingsSlinky.typeorm.typeormStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/cache/RedisQueryResultCache", JSImport.Namespace)
@js.native
object cacheRedisQueryResultCacheMod extends js.Object {
  
  @js.native
  class RedisQueryResultCache protected () extends QueryResultCache {
    def this(connection: Connection, clientType: ioredis) = this()
    def this(connection: Connection, clientType: ioredisSlashcluster) = this()
    def this(connection: Connection, clientType: redis) = this()
    
    /**
      * Connected redis client.
      */
    var client: js.Any = js.native
    
    /**
      * Type of the Redis Client (redis or ioredis).
      */
    var clientType: redis | ioredis | ioredisSlashcluster = js.native
    
    var connection: Connection = js.native
    
    /**
      * Removes a single key from redis database.
      */
    /* protected */ def deleteKey(key: String): js.Promise[Unit] = js.native
    
    /**
      * Loads redis dependency.
      */
    /* protected */ def loadRedis(): js.Any = js.native
    
    /**
      * Redis module instance loaded dynamically.
      */
    var redis: js.Any = js.native
  }
}
