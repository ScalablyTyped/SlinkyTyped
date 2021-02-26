package typingsSlinky.trouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trouter", JSImport.Namespace)
  @js.native
  class ^[T] () extends Trouter[T]
  
  @js.native
  trait FindResult[T] extends StObject {
    
    var handlers: js.Array[T] = js.native
    
    var params: StringDictionary[String] = js.native
  }
  object FindResult {
    
    @scala.inline
    def apply[T](handlers: js.Array[T], params: StringDictionary[String]): FindResult[T] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult[T]]
    }
    
    @scala.inline
    implicit class FindResultMutableBuilder[Self <: FindResult[_], T] (val x: Self with FindResult[T]) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: js.Array[T]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersVarargs(value: T*): Self = StObject.set(x, "handlers", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.trouter.trouterStrings.ACL
    - typingsSlinky.trouter.trouterStrings.BIND
    - typingsSlinky.trouter.trouterStrings.CHECKOUT
    - typingsSlinky.trouter.trouterStrings.CONNECT
    - typingsSlinky.trouter.trouterStrings.COPY
    - typingsSlinky.trouter.trouterStrings.DELETE
    - typingsSlinky.trouter.trouterStrings.GET
    - typingsSlinky.trouter.trouterStrings.HEAD
    - typingsSlinky.trouter.trouterStrings.LINK
    - typingsSlinky.trouter.trouterStrings.LOCK
    - typingsSlinky.trouter.trouterStrings.`M-SEARCH`
    - typingsSlinky.trouter.trouterStrings.MERGE
    - typingsSlinky.trouter.trouterStrings.MKACTIVITY
    - typingsSlinky.trouter.trouterStrings.MKCALENDAR
    - typingsSlinky.trouter.trouterStrings.MKCOL
    - typingsSlinky.trouter.trouterStrings.MOVE
    - typingsSlinky.trouter.trouterStrings.NOTIFY
    - typingsSlinky.trouter.trouterStrings.OPTIONS
    - typingsSlinky.trouter.trouterStrings.PATCH
    - typingsSlinky.trouter.trouterStrings.POST
    - typingsSlinky.trouter.trouterStrings.PROPFIND
    - typingsSlinky.trouter.trouterStrings.PROPPATCH
    - typingsSlinky.trouter.trouterStrings.PURGE
    - typingsSlinky.trouter.trouterStrings.PUT
    - typingsSlinky.trouter.trouterStrings.REBIND
    - typingsSlinky.trouter.trouterStrings.REPORT
    - typingsSlinky.trouter.trouterStrings.SEARCH
    - typingsSlinky.trouter.trouterStrings.SOURCE
    - typingsSlinky.trouter.trouterStrings.SUBSCRIBE
    - typingsSlinky.trouter.trouterStrings.TRACE
    - typingsSlinky.trouter.trouterStrings.UNBIND
    - typingsSlinky.trouter.trouterStrings.UNLINK
    - typingsSlinky.trouter.trouterStrings.UNLOCK
    - typingsSlinky.trouter.trouterStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    @scala.inline
    def ACL: typingsSlinky.trouter.trouterStrings.ACL = "ACL".asInstanceOf[typingsSlinky.trouter.trouterStrings.ACL]
    
    @scala.inline
    def BIND: typingsSlinky.trouter.trouterStrings.BIND = "BIND".asInstanceOf[typingsSlinky.trouter.trouterStrings.BIND]
    
    @scala.inline
    def CHECKOUT: typingsSlinky.trouter.trouterStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typingsSlinky.trouter.trouterStrings.CHECKOUT]
    
    @scala.inline
    def CONNECT: typingsSlinky.trouter.trouterStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.trouter.trouterStrings.CONNECT]
    
    @scala.inline
    def COPY: typingsSlinky.trouter.trouterStrings.COPY = "COPY".asInstanceOf[typingsSlinky.trouter.trouterStrings.COPY]
    
    @scala.inline
    def DELETE: typingsSlinky.trouter.trouterStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.trouter.trouterStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.trouter.trouterStrings.GET = "GET".asInstanceOf[typingsSlinky.trouter.trouterStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.trouter.trouterStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.trouter.trouterStrings.HEAD]
    
    @scala.inline
    def LINK: typingsSlinky.trouter.trouterStrings.LINK = "LINK".asInstanceOf[typingsSlinky.trouter.trouterStrings.LINK]
    
    @scala.inline
    def LOCK: typingsSlinky.trouter.trouterStrings.LOCK = "LOCK".asInstanceOf[typingsSlinky.trouter.trouterStrings.LOCK]
    
    @scala.inline
    def `M-SEARCH`: typingsSlinky.trouter.trouterStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typingsSlinky.trouter.trouterStrings.`M-SEARCH`]
    
    @scala.inline
    def MERGE: typingsSlinky.trouter.trouterStrings.MERGE = "MERGE".asInstanceOf[typingsSlinky.trouter.trouterStrings.MERGE]
    
    @scala.inline
    def MKACTIVITY: typingsSlinky.trouter.trouterStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typingsSlinky.trouter.trouterStrings.MKACTIVITY]
    
    @scala.inline
    def MKCALENDAR: typingsSlinky.trouter.trouterStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typingsSlinky.trouter.trouterStrings.MKCALENDAR]
    
    @scala.inline
    def MKCOL: typingsSlinky.trouter.trouterStrings.MKCOL = "MKCOL".asInstanceOf[typingsSlinky.trouter.trouterStrings.MKCOL]
    
    @scala.inline
    def MOVE: typingsSlinky.trouter.trouterStrings.MOVE = "MOVE".asInstanceOf[typingsSlinky.trouter.trouterStrings.MOVE]
    
    @scala.inline
    def NOTIFY: typingsSlinky.trouter.trouterStrings.NOTIFY = "NOTIFY".asInstanceOf[typingsSlinky.trouter.trouterStrings.NOTIFY]
    
    @scala.inline
    def OPTIONS: typingsSlinky.trouter.trouterStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.trouter.trouterStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.trouter.trouterStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.trouter.trouterStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.trouter.trouterStrings.POST = "POST".asInstanceOf[typingsSlinky.trouter.trouterStrings.POST]
    
    @scala.inline
    def PROPFIND: typingsSlinky.trouter.trouterStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsSlinky.trouter.trouterStrings.PROPFIND]
    
    @scala.inline
    def PROPPATCH: typingsSlinky.trouter.trouterStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsSlinky.trouter.trouterStrings.PROPPATCH]
    
    @scala.inline
    def PURGE: typingsSlinky.trouter.trouterStrings.PURGE = "PURGE".asInstanceOf[typingsSlinky.trouter.trouterStrings.PURGE]
    
    @scala.inline
    def PUT: typingsSlinky.trouter.trouterStrings.PUT = "PUT".asInstanceOf[typingsSlinky.trouter.trouterStrings.PUT]
    
    @scala.inline
    def REBIND: typingsSlinky.trouter.trouterStrings.REBIND = "REBIND".asInstanceOf[typingsSlinky.trouter.trouterStrings.REBIND]
    
    @scala.inline
    def REPORT: typingsSlinky.trouter.trouterStrings.REPORT = "REPORT".asInstanceOf[typingsSlinky.trouter.trouterStrings.REPORT]
    
    @scala.inline
    def SEARCH: typingsSlinky.trouter.trouterStrings.SEARCH = "SEARCH".asInstanceOf[typingsSlinky.trouter.trouterStrings.SEARCH]
    
    @scala.inline
    def SOURCE: typingsSlinky.trouter.trouterStrings.SOURCE = "SOURCE".asInstanceOf[typingsSlinky.trouter.trouterStrings.SOURCE]
    
    @scala.inline
    def SUBSCRIBE: typingsSlinky.trouter.trouterStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsSlinky.trouter.trouterStrings.SUBSCRIBE]
    
    @scala.inline
    def TRACE: typingsSlinky.trouter.trouterStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.trouter.trouterStrings.TRACE]
    
    @scala.inline
    def UNBIND: typingsSlinky.trouter.trouterStrings.UNBIND = "UNBIND".asInstanceOf[typingsSlinky.trouter.trouterStrings.UNBIND]
    
    @scala.inline
    def UNLINK: typingsSlinky.trouter.trouterStrings.UNLINK = "UNLINK".asInstanceOf[typingsSlinky.trouter.trouterStrings.UNLINK]
    
    @scala.inline
    def UNLOCK: typingsSlinky.trouter.trouterStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsSlinky.trouter.trouterStrings.UNLOCK]
    
    @scala.inline
    def UNSUBSCRIBE: typingsSlinky.trouter.trouterStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typingsSlinky.trouter.trouterStrings.UNSUBSCRIBE]
  }
  
  @js.native
  trait Trouter[T] extends StObject {
    
    def add(method: HTTPMethod, pattern: String, handlers: T*): this.type = js.native
    def add(method: HTTPMethod, pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def all(pattern: String, handlers: T*): this.type = js.native
    def all(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def connect(pattern: String, handlers: T*): this.type = js.native
    def connect(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def delete(pattern: String, handlers: T*): this.type = js.native
    def delete(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def find(method: HTTPMethod, url: String): FindResult[T] = js.native
    
    def get(pattern: String, handlers: T*): this.type = js.native
    def get(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def head(pattern: String, handlers: T*): this.type = js.native
    def head(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def options(pattern: String, handlers: T*): this.type = js.native
    def options(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def patch(pattern: String, handlers: T*): this.type = js.native
    def patch(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def post(pattern: String, handlers: T*): this.type = js.native
    def post(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def put(pattern: String, handlers: T*): this.type = js.native
    def put(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def trace(pattern: String, handlers: T*): this.type = js.native
    def trace(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def use(pattern: String, handlers: T*): this.type = js.native
    def use(pattern: js.RegExp, handlers: T*): this.type = js.native
  }
}
