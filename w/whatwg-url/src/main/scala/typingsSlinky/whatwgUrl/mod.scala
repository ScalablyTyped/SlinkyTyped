package typingsSlinky.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.std.IterableIterator
import typingsSlinky.whatwgUrl.anon.BaseURL
import typingsSlinky.whatwgUrl.anon.EncodingOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-url", "URL")
  @js.native
  class URL protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: String, base: URL) = this()
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    val origin: String = js.native
    
    var password: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var search: String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): String = js.native
    
    var username: String = js.native
  }
  
  @JSImport("whatwg-url", "URLSearchParams")
  @js.native
  class URLSearchParams () extends StObject {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[String]) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
  }
  
  @JSImport("whatwg-url", "basicURLParse")
  @js.native
  def basicURLParse(input: String): URLRecord | Null = js.native
  @JSImport("whatwg-url", "basicURLParse")
  @js.native
  def basicURLParse(input: String, options: EncodingOverride): URLRecord | Null = js.native
  
  @JSImport("whatwg-url", "cannotHaveAUsernamePasswordPort")
  @js.native
  def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): Boolean = js.native
  
  @JSImport("whatwg-url", "parseURL")
  @js.native
  def parseURL(input: String): URLRecord | Null = js.native
  @JSImport("whatwg-url", "parseURL")
  @js.native
  def parseURL(input: String, options: BaseURL): URLRecord | Null = js.native
  
  @JSImport("whatwg-url", "percentDecode")
  @js.native
  def percentDecode(buffer: Buffer): Buffer = js.native
  
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: String): String = js.native
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: Double): String = js.native
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: IPv6Address): String = js.native
  
  @JSImport("whatwg-url", "serializeInteger")
  @js.native
  def serializeInteger(number: Double): String = js.native
  
  @JSImport("whatwg-url", "serializeURL")
  @js.native
  def serializeURL(urlRecord: URLRecord): String = js.native
  @JSImport("whatwg-url", "serializeURL")
  @js.native
  def serializeURL(urlRecord: URLRecord, excludeFragment: Boolean): String = js.native
  
  @JSImport("whatwg-url", "serializeURLOrigin")
  @js.native
  def serializeURLOrigin(urlRecord: URLRecord): String = js.native
  
  @JSImport("whatwg-url", "setThePassword")
  @js.native
  def setThePassword(urlRecord: URLRecord, password: String): Unit = js.native
  
  @JSImport("whatwg-url", "setTheUsername")
  @js.native
  def setTheUsername(urlRecord: URLRecord, username: String): Unit = js.native
  
  type IPv6Address = js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`scheme start`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.scheme
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`no scheme`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`special relative or authority`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`path or authority`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.relative
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`relative slash`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority slashes`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.authority
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.host
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.hostname
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.port
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.file
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`file slash`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`file host`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`path start`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.path
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path`
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.query
    - typingsSlinky.whatwgUrl.whatwgUrlStrings.fragment
  */
  trait StateOverride extends StObject
  object StateOverride {
    
    @scala.inline
    def authority: typingsSlinky.whatwgUrl.whatwgUrlStrings.authority = "authority".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.authority]
    
    @scala.inline
    def `cannot-be-a-base-URL path`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path` = ("cannot-be-a-base-URL path").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path`]
    
    @scala.inline
    def file: typingsSlinky.whatwgUrl.whatwgUrlStrings.file = "file".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.file]
    
    @scala.inline
    def `file host`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`file host` = ("file host").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`file host`]
    
    @scala.inline
    def `file slash`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`file slash` = ("file slash").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`file slash`]
    
    @scala.inline
    def fragment: typingsSlinky.whatwgUrl.whatwgUrlStrings.fragment = "fragment".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.fragment]
    
    @scala.inline
    def host: typingsSlinky.whatwgUrl.whatwgUrlStrings.host = "host".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.host]
    
    @scala.inline
    def hostname: typingsSlinky.whatwgUrl.whatwgUrlStrings.hostname = "hostname".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.hostname]
    
    @scala.inline
    def `no scheme`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`no scheme` = ("no scheme").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`no scheme`]
    
    @scala.inline
    def path: typingsSlinky.whatwgUrl.whatwgUrlStrings.path = "path".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.path]
    
    @scala.inline
    def `path or authority`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`path or authority` = ("path or authority").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`path or authority`]
    
    @scala.inline
    def `path start`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`path start` = ("path start").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`path start`]
    
    @scala.inline
    def port: typingsSlinky.whatwgUrl.whatwgUrlStrings.port = "port".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.port]
    
    @scala.inline
    def query: typingsSlinky.whatwgUrl.whatwgUrlStrings.query = "query".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.query]
    
    @scala.inline
    def relative: typingsSlinky.whatwgUrl.whatwgUrlStrings.relative = "relative".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.relative]
    
    @scala.inline
    def `relative slash`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`relative slash` = ("relative slash").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`relative slash`]
    
    @scala.inline
    def scheme: typingsSlinky.whatwgUrl.whatwgUrlStrings.scheme = "scheme".asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.scheme]
    
    @scala.inline
    def `scheme start`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`scheme start` = ("scheme start").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`scheme start`]
    
    @scala.inline
    def `special authority ignore slashes`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes` = ("special authority ignore slashes").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`]
    
    @scala.inline
    def `special authority slashes`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority slashes` = ("special authority slashes").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`special authority slashes`]
    
    @scala.inline
    def `special relative or authority`: typingsSlinky.whatwgUrl.whatwgUrlStrings.`special relative or authority` = ("special relative or authority").asInstanceOf[typingsSlinky.whatwgUrl.whatwgUrlStrings.`special relative or authority`]
  }
  
  @js.native
  trait URLRecord extends StObject {
    
    var cannotBeABaseURL: js.UndefOr[Boolean] = js.native
    
    var fragment: String | Null = js.native
    
    var host: String | Double | IPv6Address | Null = js.native
    
    var password: String = js.native
    
    var path: js.Array[String] = js.native
    
    var port: Double | Null = js.native
    
    var query: String | Null = js.native
    
    var scheme: String = js.native
    
    var username: String = js.native
  }
  object URLRecord {
    
    @scala.inline
    def apply(password: String, path: js.Array[String], scheme: String, username: String): URLRecord = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLRecord]
    }
    
    @scala.inline
    implicit class URLRecordMutableBuilder[Self <: URLRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCannotBeABaseURL(value: Boolean): Self = StObject.set(x, "cannotBeABaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCannotBeABaseURLUndefined: Self = StObject.set(x, "cannotBeABaseURL", js.undefined)
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      @scala.inline
      def setHost(value: String | Double | IPv6Address): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
