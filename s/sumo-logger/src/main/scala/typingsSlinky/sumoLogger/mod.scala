package typingsSlinky.sumoLogger

import typingsSlinky.sumoLogger.anon.PartialPerMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * You must have an HTTP source created in your Sumo Logic account to use this SDK.
    * To create one, log into Sumo Logic, go to the Collectors page and either create
    * a new Hosted Collector or add a new HTTP source to an existing Hosted Collector.
    */
  @JSImport("sumo-logger", JSImport.Namespace)
  @js.native
  class ^ protected () extends SumoLogger {
    def this(options: SumoLoggerOptions) = this()
  }
  
  @js.native
  trait PerMessageOptions extends StObject {
    
    /** Override a session key set in the `config` call. */
    var sessionKey: String = js.native
    
    /**
      * Defaults to `new Date()` called when processing the log call.
      * Use this when the event being logged occurred
      * at a different time than when the log was sent.
      */
    var timestamp: js.Date = js.native
    
    /** Override client URL set in the config call. (Node version only) */
    var url: String = js.native
  }
  object PerMessageOptions {
    
    @scala.inline
    def apply(sessionKey: String, timestamp: js.Date, url: String): PerMessageOptions = {
      val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerMessageOptions]
    }
    
    @scala.inline
    implicit class PerMessageOptionsMutableBuilder[Self <: PerMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * You must have an HTTP source created in your Sumo Logic account to use this SDK.
    * To create one, log into Sumo Logic, go to the Collectors page and either create
    * a new Hosted Collector or add a new HTTP source to an existing Hosted Collector.
    */
  @js.native
  trait SumoLogger extends StObject {
    
    /**
      * **(Vanilla JS lib only)**
      * Set the configuration for sending logs. Options are listed in the next section.
      * In the Node.js module, configuration options are sent when instantiating the object.
      */
    var config: js.UndefOr[js.Function1[/* options */ SumoLoggerOptions, Unit]] = js.native
    
    /**
      * Empty the current queue of logs
      */
    def emptyLogQueue(): Unit = js.native
    
    /**
      * Force any pending logs to be sent immediately. This is mainly for use in a
      * logOut/`window.onBeforeUnload` flow to ensure that any remaining queued
      * messages are sent to Sumo Logic.
      */
    def flushLogs(): Unit = js.native
    
    /**
      * Set a log message to be sent.
      * All logs are sent as JSON objects.
      * If you call `log()` with just a string, the string is included as a field called msg.
      * If you call the function with a JSON object, each field in the object is included as a separate field.
      * Fields called `sessionId`, `url`, and `timestamp` are sent in both cases.
      */
    def log(message: String): Boolean | js.Promise[_] = js.native
    def log(message: String, options: PerMessageOptions): Boolean | js.Promise[_] = js.native
    /**
      * Set a log message to be sent.
      * All logs are sent as JSON objects.
      * If you call `log()` with just a string, the string is included as a field called msg.
      * If you call the function with a JSON object, each field in the object is included as a separate field.
      * Fields called `sessionId`, `url`, and `timestamp` are sent in both cases.
      */
    def log[T /* <: js.Object */](event: PartialPerMessageOptions with T): Boolean | js.Promise[_] = js.native
    
    /**
      * Start sending batched logs at the preconfigured interval
      */
    def startLogSending(): Unit = js.native
    
    /**
      * Stop sending batched logs
      */
    def stopLogSending(): Unit = js.native
  }
  
  @js.native
  trait SumoLoggerOptions extends StObject {
    
    /**
      * An integer specifying total log length.
      * This can be used by itself or in addition to interval but is ignored when useIntervalOnly is true.
      * For higher volume applications, Sumo Logic recommends using between 100000 and 1000000 to optimize the tradeoff between network calls and load.
      * If both batchSize and interval are configured sending will be triggered when the pending logs' aggregate message length
      * is reached or when the specified interval is hit, and in either case the interval will be reset on send.
      */
    var batchSize: js.UndefOr[Double] = js.native
    
    /**
      * You can provide a URL, in the Node version of this SDK only,
      * which will be sent as the `url` field of the log line.
      * In the vanilla JS version, the URL is detected from the browser's
      * `window.location` value.
      */
    var clientUrl: js.UndefOr[String] = js.native
    
    /**
      * To send your logs, the script must know which HTTP Source to use.
      * Pass this value (which you can get from the Collectors page) in
      * the `endpoint` parameter.
      */
    var endpoint: String = js.native
    
    /**
      * This value enables and disables sending data as graphite metrics
      */
    var graphite: js.UndefOr[Boolean] = js.native
    
    /**
      * This value identifies the host from which the log is being sent.
      */
    var hostName: js.UndefOr[String] = js.native
    
    /**
      * A number of milliseconds. Messages will be batched and sent at the interval specified.
      * Default value is zero, meaning messages are sent each time `log()` is called.
      */
    var interval: js.UndefOr[Double] = js.native
    
    /**
      * You can provide a function that is executed if an error
      * occurs when the logs are sent.
      */
    var onError: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * You can provide a function that is executed only when logs are successfully sent.
      * The only information you can be sure of in the callback is that the call succeeded.
      * There is no other response information.
      */
    var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * This value enables and disables sending data as a raw string
      */
    var raw: js.UndefOr[Boolean] = js.native
    
    /**
      * Setting `sendErrors` to `true` will send all the unhandled errors to Sumo Logic
      * with the error message, URL, line number, and column number.
      * This attribute plays well with any other `window.onerror` functions that
      * have been defined.
      */
    var sendErrors: js.UndefOr[Boolean] = js.native
    
    /** To identify specific user sessions, set a value for this field. */
    var sessionKey: js.UndefOr[String] = js.native
    
    /**
      * This value sets the Source Category for the logged message.
      */
    var sourceCategory: js.UndefOr[String] = js.native
    
    /**
      * This value sets the Source Name for the logged message.
      */
    var sourceName: js.UndefOr[String] = js.native
    
    /**
      * If enabled batchSize is ignored and only interval is used to trigger when the pending logs will be sent.
      */
    var useIntervalOnly: js.UndefOr[Boolean] = js.native
  }
  object SumoLoggerOptions {
    
    @scala.inline
    def apply(endpoint: String): SumoLoggerOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[SumoLoggerOptions]
    }
    
    @scala.inline
    implicit class SumoLoggerOptionsMutableBuilder[Self <: SumoLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphite(value: Boolean): Self = StObject.set(x, "graphite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphiteUndefined: Self = StObject.set(x, "graphite", js.undefined)
      
      @scala.inline
      def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSendErrors(value: Boolean): Self = StObject.set(x, "sendErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendErrorsUndefined: Self = StObject.set(x, "sendErrors", js.undefined)
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSourceCategory(value: String): Self = StObject.set(x, "sourceCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCategoryUndefined: Self = StObject.set(x, "sourceCategory", js.undefined)
      
      @scala.inline
      def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
      
      @scala.inline
      def setUseIntervalOnly(value: Boolean): Self = StObject.set(x, "useIntervalOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIntervalOnlyUndefined: Self = StObject.set(x, "useIntervalOnly", js.undefined)
    }
  }
}
