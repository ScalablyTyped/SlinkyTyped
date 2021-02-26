package typingsSlinky.simplecrawler

import typingsSlinky.simplecrawler.anon.ActualDataSize
import typingsSlinky.simplecrawler.simplecrawlerNumbers.`0`
import typingsSlinky.simplecrawler.simplecrawlerNumbers.`1`
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("simplecrawler/queue", JSImport.Default)
  @js.native
  class default () extends FetchQueue
  
  @js.native
  trait FetchQueue
    extends Array[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
        ] {
    
    def add(queueItem: QueueItem): Unit = js.native
    def add(
      queueItem: QueueItem,
      force: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    def add(queueItem: QueueItem, force: Boolean): Unit = js.native
    def add(
      queueItem: QueueItem,
      force: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def avg(statisticName: String): Unit = js.native
    def avg(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* average */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def countItems(comparator: js.Object): Unit = js.native
    def countItems(
      comparator: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* count */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def defrost(filename: String): Unit = js.native
    def defrost(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def exists(url: String, callback: js.Function2[/* error */ js.Error | Null, /* exists */ `0` | `1`, Unit]): Unit = js.native
    
    def filterItems(comparator: js.Object): Unit = js.native
    def filterItems(
      comparator: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* items */ js.UndefOr[js.Array[QueueItem]], Unit]
    ): Unit = js.native
    
    def freeze(filename: String): Unit = js.native
    def freeze(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def get(index: Double): Unit = js.native
    def get(
      index: Double,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def getLength(): Unit = js.native
    def getLength(callback: js.Function2[/* error */ js.UndefOr[js.Error], /* length */ js.UndefOr[Double], Unit]): Unit = js.native
    
    def max(statisticName: String): Unit = js.native
    def max(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* maximum */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def min(statisticName: String): Unit = js.native
    def min(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* minimum */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def oldestUnfetchedItem(): Unit = js.native
    def oldestUnfetchedItem(
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def update(id: Double, updates: js.Object): Unit = js.native
    def update(
      id: Double,
      updates: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait QueueItem extends StObject {
    
    var depth: Double = js.native
    
    var fetched: Boolean = js.native
    
    var host: String = js.native
    
    var id: Double = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
    
    var referrer: String = js.native
    
    var stateData: ActualDataSize = js.native
    
    var status: QueueItemStatus = js.native
    
    var uriPath: String = js.native
    
    var url: String = js.native
  }
  object QueueItem {
    
    @scala.inline
    def apply(
      depth: Double,
      fetched: Boolean,
      host: String,
      id: Double,
      path: String,
      port: Double,
      protocol: String,
      referrer: String,
      stateData: ActualDataSize,
      status: QueueItemStatus,
      uriPath: String,
      url: String
    ): QueueItem = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], fetched = fetched.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stateData = stateData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uriPath = uriPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetched(value: Boolean): Self = StObject.set(x, "fetched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateData(value: ActualDataSize): Self = StObject.set(x, "stateData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: QueueItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriPath(value: String): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.simplecrawler.simplecrawlerStrings.queued
    - typingsSlinky.simplecrawler.simplecrawlerStrings.spooled
    - typingsSlinky.simplecrawler.simplecrawlerStrings.headers
    - typingsSlinky.simplecrawler.simplecrawlerStrings.downloaded
    - typingsSlinky.simplecrawler.simplecrawlerStrings.redirected
    - typingsSlinky.simplecrawler.simplecrawlerStrings.notfound
    - typingsSlinky.simplecrawler.simplecrawlerStrings.failed
  */
  trait QueueItemStatus extends StObject
  object QueueItemStatus {
    
    @scala.inline
    def downloaded: typingsSlinky.simplecrawler.simplecrawlerStrings.downloaded = "downloaded".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.downloaded]
    
    @scala.inline
    def failed: typingsSlinky.simplecrawler.simplecrawlerStrings.failed = "failed".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.failed]
    
    @scala.inline
    def headers: typingsSlinky.simplecrawler.simplecrawlerStrings.headers = "headers".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.headers]
    
    @scala.inline
    def notfound: typingsSlinky.simplecrawler.simplecrawlerStrings.notfound = "notfound".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.notfound]
    
    @scala.inline
    def queued: typingsSlinky.simplecrawler.simplecrawlerStrings.queued = "queued".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.queued]
    
    @scala.inline
    def redirected: typingsSlinky.simplecrawler.simplecrawlerStrings.redirected = "redirected".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.redirected]
    
    @scala.inline
    def spooled: typingsSlinky.simplecrawler.simplecrawlerStrings.spooled = "spooled".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.spooled]
  }
}
