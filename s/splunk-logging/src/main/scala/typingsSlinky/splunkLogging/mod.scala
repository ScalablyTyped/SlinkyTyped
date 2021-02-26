package typingsSlinky.splunkLogging

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.splunkLogging.splunkLoggingStrings.http
import typingsSlinky.splunkLogging.splunkLoggingStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("splunk-logging", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(config: Config) = this()
    
    def error(error: js.Error, context: SendContext): Unit = js.native
    
    def eventFormatter(message: js.Any, severity: String): js.Any = js.native
    @JSName("eventFormatter")
    var eventFormatter_Original: EventFormatter = js.native
    
    def flush(): Unit = js.native
    def flush(callback: Callback): Unit = js.native
    
    var requestOptions: CoreOptions = js.native
    
    def send(context: SendContext): Unit = js.native
    def send(context: SendContext, callback: Callback): Unit = js.native
    
    val serializedEventQueue: js.Array[_] = js.native
  }
  
  type Callback = js.Function3[/* error */ js.UndefOr[js.Error], /* req */ js.Any, /* res */ js.Any, Unit]
  
  @js.native
  trait Config extends StObject {
    
    var batchInterval: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var maxBatchCount: js.UndefOr[Double] = js.native
    
    var maxBatchSize: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[http | https] = js.native
    
    var token: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(token: String): Config = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchInterval(value: Double): Self = StObject.set(x, "batchInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchIntervalUndefined: Self = StObject.set(x, "batchInterval", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaxBatchCount(value: Double): Self = StObject.set(x, "maxBatchCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBatchCountUndefined: Self = StObject.set(x, "maxBatchCount", js.undefined)
      
      @scala.inline
      def setMaxBatchSize(value: Double): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type EventFormatter = js.Function2[/* message */ js.Any, /* severity */ String, js.Any]
  
  @js.native
  trait SendContext extends StObject {
    
    var message: js.Any = js.native
    
    var metadata: js.UndefOr[SendContextMetadata] = js.native
    
    var severity: js.UndefOr[String] = js.native
  }
  object SendContext {
    
    @scala.inline
    def apply(message: js.Any): SendContext = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendContext]
    }
    
    @scala.inline
    implicit class SendContextMutableBuilder[Self <: SendContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: SendContextMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  @js.native
  trait SendContextMetadata extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[String] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var sourcetype: js.UndefOr[String] = js.native
  }
  object SendContextMetadata {
    
    @scala.inline
    def apply(): SendContextMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendContextMetadata]
    }
    
    @scala.inline
    implicit class SendContextMetadataMutableBuilder[Self <: SendContextMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSourcetype(value: String): Self = StObject.set(x, "sourcetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcetypeUndefined: Self = StObject.set(x, "sourcetype", js.undefined)
    }
  }
}
