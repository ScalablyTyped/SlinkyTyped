package typingsSlinky.simplecrawler

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.simplecrawler.cacheBackendFsMod.FSBackend
import typingsSlinky.simplecrawler.queueMod.QueueItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("simplecrawler/cache", JSImport.Default)
  @js.native
  class default protected () extends Cache {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
  }
  
  @JSImport("simplecrawler/cache", "Cache")
  @js.native
  class Cache protected () extends EventEmitter {
    def this(cacheLoadParameter: js.Array[String], cacheBackend: js.Function0[Unit]) = this()
    
    var datastore: FSBackend = js.native
    
    def getCacheData(queueObject: QueueItem): Unit = js.native
    def getCacheData(
      queueObject: QueueItem,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    def saveCache(): Unit = js.native
    
    def setCacheData(queueObject: QueueItem, data: js.Any): Unit = js.native
    def setCacheData(queueObject: QueueItem, data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("simplecrawler/cache", "FilesystemBackend")
  @js.native
  def FilesystemBackend(): FSBackend = js.native
  @JSImport("simplecrawler/cache", "FilesystemBackend")
  @js.native
  def FilesystemBackend(loadParameter: String): FSBackend = js.native
}
