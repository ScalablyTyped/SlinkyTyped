package typingsSlinky.simpleUrlCache.mod

import typingsSlinky.simpleUrlCache.mod.privateN.CacheCategory
import typingsSlinky.simpleUrlCache.mod.privateN.CacheStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simple-url-cache", "RedisStorage")
@js.native
class RedisStorage protected ()
  extends CacheCategory
     with CacheStorage {
  def this(_url: String, _storageConfig: RedisStorageConfig, _regexRules: CacheRules) = this()
}
