package typingsSlinky.socketIoRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketIORedisStatic extends js.Object {
  
  /**
    * Default Redis Adapter constructor
    */
  def apply(): RedisAdapter = js.native
  /**
    * Creates a new Redis Adapter
    * @param opts A parameters object
    */
  def apply(opts: SocketIORedisOptions): RedisAdapter = js.native
  /**
    * Creates a new Redis Adapter
    * @param uri Is a string like localhost:6379 where your redis server is located.
    * @param opts An optional parameters object
    */
  def apply(uri: String): RedisAdapter = js.native
  def apply(uri: String, opts: SocketIORedisOptions): RedisAdapter = js.native
}
