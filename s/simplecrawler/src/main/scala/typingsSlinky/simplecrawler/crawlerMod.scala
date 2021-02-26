package typingsSlinky.simplecrawler

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.simplecrawler.anon.Dictkey
import typingsSlinky.simplecrawler.cacheMod.default
import typingsSlinky.simplecrawler.queueMod.QueueItem
import typingsSlinky.simplecrawler.simplecrawlerStrings.complete
import typingsSlinky.simplecrawler.simplecrawlerStrings.cookieerror
import typingsSlinky.simplecrawler.simplecrawlerStrings.crawlstart
import typingsSlinky.simplecrawler.simplecrawlerStrings.discoverycomplete
import typingsSlinky.simplecrawler.simplecrawlerStrings.downloadconditionerror
import typingsSlinky.simplecrawler.simplecrawlerStrings.downloadprevented
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetch404
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetch410
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchclienterror
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchcomplete
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchconditionerror
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchdataerror
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchdisallowed
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetcherror
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchheaders
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchprevented
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchredirect
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchstart
import typingsSlinky.simplecrawler.simplecrawlerStrings.fetchtimeout
import typingsSlinky.simplecrawler.simplecrawlerStrings.gziperror
import typingsSlinky.simplecrawler.simplecrawlerStrings.invaliddomain
import typingsSlinky.simplecrawler.simplecrawlerStrings.notmodified
import typingsSlinky.simplecrawler.simplecrawlerStrings.queueadd
import typingsSlinky.simplecrawler.simplecrawlerStrings.queueduplicate
import typingsSlinky.simplecrawler.simplecrawlerStrings.queueerror
import typingsSlinky.simplecrawler.simplecrawlerStrings.robotstxterror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crawlerMod {
  
  @JSImport("simplecrawler/crawler", JSImport.Namespace)
  @js.native
  class ^ protected () extends Crawler {
    def this(initialURL: String) = this()
  }
  
  @js.native
  trait Crawler extends EventEmitter {
    
    var acceptCookies: Boolean = js.native
    
    def addDownloadCondition(callback: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]): Double = js.native
    
    def addFetchCondition(callback: js.Function2[/* queueItem */ QueueItem, /* referrerQueueItem */ QueueItem, Unit]): Double = js.native
    
    var allowInitialDomainChange: Boolean = js.native
    
    var allowedProtocols: js.Array[js.RegExp] = js.native
    
    var authPass: js.UndefOr[String] = js.native
    
    var authUser: js.UndefOr[String] = js.native
    
    var cache: js.UndefOr[default] = js.native
    
    def cleanExpandResources(urlMatch: js.Array[String], queueItem: QueueItem): js.Array[String] = js.native
    
    def cleanURL(url: String, queueItem: QueueItem): String = js.native
    
    var cookies: typingsSlinky.simplecrawler.cookiesMod.default = js.native
    
    /**
      * @deprecated
      */
    def crawl(): scala.Nothing = js.native
    
    var customHeaders: js.Object = js.native
    
    def decodeBuffer(buffer: Buffer): String = js.native
    def decodeBuffer(buffer: Buffer, contentTypeHeader: String): String = js.native
    
    var decodeResponses: Boolean = js.native
    
    var decompressResponses: Boolean = js.native
    
    var discoverRegex: js.Array[js.Function0[Unit] | js.RegExp] = js.native
    
    def discoverResources(resourceText: String): js.Array[String] = js.native
    
    def domainValid(host: String): Boolean = js.native
    
    var domainWhitelist: js.Array[String] = js.native
    
    var downloadUnsupported: Boolean = js.native
    
    def fetchQueueItem(queueItem: QueueItem): this.type = js.native
    
    var filterByDomain: Boolean = js.native
    
    def getRequestOptions(queueItem: QueueItem): RequestOptions = js.native
    
    def getRobotsTxt(
      url: String,
      callback: js.Function3[
          /* error */ js.UndefOr[js.Error], 
          /* href */ js.UndefOr[String], 
          /* responseBody */ js.UndefOr[String], 
          Unit
        ]
    ): this.type = js.native
    
    def handleResponse(queueItem: QueueItem, response: IncomingMessage): String = js.native
    def handleResponse(queueItem: QueueItem, response: IncomingMessage, timeCommenced: js.Date): String = js.native
    
    var host: String = js.native
    
    var httpAgent: Agent = js.native
    
    var httpsAgent: typingsSlinky.node.httpsMod.Agent = js.native
    
    var ignoreInvalidSSL: Boolean = js.native
    
    var ignoreWWWDomain: Boolean = js.native
    
    var initialURL: String = js.native
    
    var interval: Double = js.native
    
    var listenerTTL: Double = js.native
    
    var maxConcurrency: Double = js.native
    
    var maxDepth: Double = js.native
    
    var maxResourceSize: Double = js.native
    
    def mimeTypeSupported(mimetype: String): Boolean = js.native
    
    var needsAuth: Boolean = js.native
    
    @JSName("on")
    def on_complete(event: complete, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cookieerror(
      event: cookieerror,
      listener: js.Function3[/* queueItem */ QueueItem, /* error */ js.Error, /* cookie */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_crawlstart(event: crawlstart, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_discoverycomplete(
      event: discoverycomplete,
      listener: js.Function2[/* queueItem */ QueueItem, /* resources */ js.Array[String], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_downloadconditionerror(
      event: downloadconditionerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_downloadprevented(
      event: downloadprevented,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetch404(
      event: fetch404,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetch410(
      event: fetch410,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchclienterror(
      event: fetchclienterror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.UndefOr[js.Object], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchcomplete(
      event: fetchcomplete,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* responseBody */ String | Buffer, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fetchconditionerror(
      event: fetchconditionerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchdataerror(
      event: fetchdataerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchdisallowed(event: fetchdisallowed, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_fetcherror(
      event: fetcherror,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchheaders(
      event: fetchheaders,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchprevented(
      event: fetchprevented,
      listener: js.Function2[/* queueItem */ QueueItem, /* fetchCondition */ js.Function0[Boolean], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchredirect(
      event: fetchredirect,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* redirectQueueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fetchstart(
      event: fetchstart,
      listener: js.Function2[/* queueItem */ QueueItem, /* requestOptions */ RequestOptions, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchtimeout(event: fetchtimeout, listener: js.Function2[/* queueItem */ QueueItem, /* timeout */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_gziperror(
      event: gziperror,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* responseBody */ String | Buffer, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_invaliddomain(event: invaliddomain, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_notmodified(
      event: notmodified,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          /* cacheObject */ default, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_queueadd(
      event: queueadd,
      listener: js.Function2[/* queueItem */ js.UndefOr[QueueItem], /* referrer */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_queueduplicate(event: queueduplicate, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_queueerror(
      event: queueerror,
      listener: js.Function2[/* error */ js.UndefOr[QueueItem], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_robotstxterror(event: robotstxterror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    var parseHTMLComments: Boolean = js.native
    
    var parseScriptTags: Boolean = js.native
    
    def processURL(url: String): QueueItem = js.native
    def processURL(url: String, referer: QueueItem): QueueItem = js.native
    
    def protocolSupported(url: String): Boolean = js.native
    
    var proxyHostname: String = js.native
    
    var proxyPass: js.UndefOr[String] = js.native
    
    var proxyPort: Double = js.native
    
    var proxyUser: js.UndefOr[String] = js.native
    
    var queue: typingsSlinky.simplecrawler.queueMod.default = js.native
    
    def queueLinkedItems(resourceData: String, queueItem: QueueItem): this.type = js.native
    def queueLinkedItems(resourceData: Buffer, queueItem: QueueItem): this.type = js.native
    
    def queueURL(url: String): Boolean = js.native
    def queueURL(url: String, referrer: js.UndefOr[scala.Nothing], force: Boolean): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem, force: Boolean): Boolean = js.native
    
    def removeDownloadCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeDownloadCondition(id: Double): Boolean = js.native
    
    def removeFetchCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeFetchCondition(id: Double): Boolean = js.native
    
    var respectRobotsTxt: Boolean = js.native
    
    var scanSubdomains: Boolean = js.native
    
    var sortQueryParameters: Boolean = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
    def stop(abortRequestsInFlight: Boolean): this.type = js.native
    
    var stripQuerystring: Boolean = js.native
    
    var stripWWWDomain: Boolean = js.native
    
    var supportedMimeTypes: js.Array[String | js.RegExp] = js.native
    
    var timeout: Double = js.native
    
    var urlEncoding: String = js.native
    
    def urlIsAllowed(url: String): Boolean = js.native
    
    var useProxy: Boolean = js.native
    
    var userAgent: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.simplecrawler.simplecrawlerStrings.GET
    - typingsSlinky.simplecrawler.simplecrawlerStrings.POST
    - typingsSlinky.simplecrawler.simplecrawlerStrings.HEAD
    - typingsSlinky.simplecrawler.simplecrawlerStrings.PUT
    - typingsSlinky.simplecrawler.simplecrawlerStrings.DELETE
    - typingsSlinky.simplecrawler.simplecrawlerStrings.CONNECT
    - typingsSlinky.simplecrawler.simplecrawlerStrings.OPTIONS
    - typingsSlinky.simplecrawler.simplecrawlerStrings.TRACE
    - typingsSlinky.simplecrawler.simplecrawlerStrings.PATCH
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    @scala.inline
    def CONNECT: typingsSlinky.simplecrawler.simplecrawlerStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.CONNECT]
    
    @scala.inline
    def DELETE: typingsSlinky.simplecrawler.simplecrawlerStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.simplecrawler.simplecrawlerStrings.GET = "GET".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.simplecrawler.simplecrawlerStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typingsSlinky.simplecrawler.simplecrawlerStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.simplecrawler.simplecrawlerStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.simplecrawler.simplecrawlerStrings.POST = "POST".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.simplecrawler.simplecrawlerStrings.PUT = "PUT".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.PUT]
    
    @scala.inline
    def TRACE: typingsSlinky.simplecrawler.simplecrawlerStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.simplecrawler.simplecrawlerStrings.TRACE]
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var agent: Agent | typingsSlinky.node.httpsMod.Agent = js.native
    
    var headers: Dictkey = js.native
    
    var host: String = js.native
    
    var method: HTTPMethods = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(
      agent: Agent | typingsSlinky.node.httpsMod.Agent,
      headers: Dictkey,
      host: String,
      method: HTTPMethods
    ): RequestOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typingsSlinky.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
