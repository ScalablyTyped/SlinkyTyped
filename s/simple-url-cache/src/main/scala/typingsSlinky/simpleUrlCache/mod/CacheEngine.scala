package typingsSlinky.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simple-url-cache", "CacheEngine")
@js.native
class CacheEngine protected () extends js.Object {
  def this(storageConfig: FileStorageConfig, cacheRules: CacheRules) = this()
  def this(storageConfig: RedisStorageConfig, cacheRules: CacheRules) = this()
  
  def url(url: String): RedisStorage = js.native
  @JSName("url")
  def url_FileStorage(url: String): FileStorage = js.native
}
