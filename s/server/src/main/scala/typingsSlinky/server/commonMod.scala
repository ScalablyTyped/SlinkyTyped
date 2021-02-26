package typingsSlinky.server

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.formidable.mod.Files
import typingsSlinky.server.anon.keyinLogLevelLogFn
import typingsSlinky.server.optionsMod.Options
import typingsSlinky.server.replyMod.Reply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  type BasicType = String | js.Array[js.Any] | js.Object | Double
  
  @js.native
  trait Context extends StObject {
    
    var cookie: StringDictionary[String] = js.native
    
    var data: js.Any = js.native
    
    var error: js.Error = js.native
    
    var files: Files = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var ip: String = js.native
    
    var ips: js.UndefOr[js.Array[String]] = js.native
    
    var log: keyinLogLevelLogFn = js.native
    
    var method: String = js.native
    
    var options: Options = js.native
    
    var params: StringDictionary[String] = js.native
    
    var path: String = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var req: Request_[ParamsDictionary, _, _, Query] = js.native
    
    var res: Response_[_] = js.native
    
    var secure: Boolean = js.native
    
    var session: js.Object = js.native
    
    var url: String = js.native
    
    var xhr: Boolean = js.native
  }
  object Context {
    
    @scala.inline
    def apply(
      cookie: StringDictionary[String],
      data: js.Any,
      error: js.Error,
      files: Files,
      headers: StringDictionary[String],
      ip: String,
      log: keyinLogLevelLogFn,
      method: String,
      options: Options,
      params: StringDictionary[String],
      path: String,
      query: StringDictionary[String | js.Array[String]],
      req: Request_[ParamsDictionary, _, _, Query],
      res: Response_[_],
      secure: Boolean,
      session: js.Object,
      url: String,
      xhr: Boolean
    ): Context = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: StringDictionary[String]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      @scala.inline
      def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: keyinLogLevelLogFn): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: Response_[_]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  type LogFn = js.Function2[/* template */ String, /* repeated */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.server.serverStrings.emergency
    - typingsSlinky.server.serverStrings.alert
    - typingsSlinky.server.serverStrings.critical
    - typingsSlinky.server.serverStrings.error
    - typingsSlinky.server.serverStrings.warning
    - typingsSlinky.server.serverStrings.notice
    - typingsSlinky.server.serverStrings.info
    - typingsSlinky.server.serverStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def alert: typingsSlinky.server.serverStrings.alert = "alert".asInstanceOf[typingsSlinky.server.serverStrings.alert]
    
    @scala.inline
    def critical: typingsSlinky.server.serverStrings.critical = "critical".asInstanceOf[typingsSlinky.server.serverStrings.critical]
    
    @scala.inline
    def debug: typingsSlinky.server.serverStrings.debug = "debug".asInstanceOf[typingsSlinky.server.serverStrings.debug]
    
    @scala.inline
    def emergency: typingsSlinky.server.serverStrings.emergency = "emergency".asInstanceOf[typingsSlinky.server.serverStrings.emergency]
    
    @scala.inline
    def error: typingsSlinky.server.serverStrings.error = "error".asInstanceOf[typingsSlinky.server.serverStrings.error]
    
    @scala.inline
    def info: typingsSlinky.server.serverStrings.info = "info".asInstanceOf[typingsSlinky.server.serverStrings.info]
    
    @scala.inline
    def notice: typingsSlinky.server.serverStrings.notice = "notice".asInstanceOf[typingsSlinky.server.serverStrings.notice]
    
    @scala.inline
    def warning: typingsSlinky.server.serverStrings.warning = "warning".asInstanceOf[typingsSlinky.server.serverStrings.warning]
  }
  
  type Middleware = js.Function1[/* ctx */ Context, Reply | BasicType | Unit]
  
  type Middlewares = js.Array[Middleware | js.Array[Middleware]]
}
