package typingsSlinky.urlParse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.urlParse.anon.Parse
import typingsSlinky.urlParse.anon.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String, parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object, parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, parser: QueryParser): URLParse = js.native
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  class Class protected () extends URLParse {
    def this(address: String) = this()
    def this(address: String, location: String) = this()
    def this(address: String, location: js.Object) = this()
    def this(address: String, parser: Boolean) = this()
    def this(address: String, parser: QueryParser) = this()
    def this(address: String, location: js.UndefOr[scala.Nothing], parser: Boolean) = this()
    def this(address: String, location: js.UndefOr[scala.Nothing], parser: QueryParser) = this()
    def this(address: String, location: String, parser: Boolean) = this()
    def this(address: String, location: String, parser: QueryParser) = this()
    def this(address: String, location: js.Object, parser: Boolean) = this()
    def this(address: String, location: js.Object, parser: QueryParser) = this()
  }
  
  @JSImport("url-parse", "extractProtocol")
  @js.native
  def extractProtocol(url: String): Protocol = js.native
  
  @JSImport("url-parse", "location")
  @js.native
  def location(url: String): js.Object = js.native
  
  @JSImport("url-parse", "qs")
  @js.native
  def qs: Parse = js.native
  @scala.inline
  def qs_=(x: Parse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs")(x.asInstanceOf[js.Any])
  
  type QueryParser = js.Function1[/* query */ String, js.Object]
  
  type StringifyQuery = js.Function1[/* query */ js.Object, String]
  
  @js.native
  trait URLParse extends StObject {
    
    val auth: String = js.native
    
    val hash: String = js.native
    
    val host: String = js.native
    
    val hostname: String = js.native
    
    val href: String = js.native
    
    val origin: String = js.native
    
    val password: String = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    val query: StringDictionary[js.UndefOr[String]] = js.native
    
    def set(part: URLPart): URLParse = js.native
    def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: String): URLParse = js.native
    def set(part: URLPart, value: String, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: String, fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: js.Object): URLParse = js.native
    def set(part: URLPart, value: js.Object, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: js.Object, fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: Double): URLParse = js.native
    def set(part: URLPart, value: Double, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: Double, fn: QueryParser): URLParse = js.native
    
    val slashes: Boolean = js.native
    
    def toString(stringify: StringifyQuery): String = js.native
    
    val username: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.urlParse.urlParseStrings.auth
    - typingsSlinky.urlParse.urlParseStrings.hash
    - typingsSlinky.urlParse.urlParseStrings.host
    - typingsSlinky.urlParse.urlParseStrings.hostname
    - typingsSlinky.urlParse.urlParseStrings.href
    - typingsSlinky.urlParse.urlParseStrings.origin
    - typingsSlinky.urlParse.urlParseStrings.password
    - typingsSlinky.urlParse.urlParseStrings.pathname
    - typingsSlinky.urlParse.urlParseStrings.port
    - typingsSlinky.urlParse.urlParseStrings.protocol
    - typingsSlinky.urlParse.urlParseStrings.query
    - typingsSlinky.urlParse.urlParseStrings.slashes
    - typingsSlinky.urlParse.urlParseStrings.username
  */
  trait URLPart extends StObject
  object URLPart {
    
    @scala.inline
    def auth: typingsSlinky.urlParse.urlParseStrings.auth = "auth".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.auth]
    
    @scala.inline
    def hash: typingsSlinky.urlParse.urlParseStrings.hash = "hash".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.hash]
    
    @scala.inline
    def host: typingsSlinky.urlParse.urlParseStrings.host = "host".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.host]
    
    @scala.inline
    def hostname: typingsSlinky.urlParse.urlParseStrings.hostname = "hostname".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.hostname]
    
    @scala.inline
    def href: typingsSlinky.urlParse.urlParseStrings.href = "href".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.href]
    
    @scala.inline
    def origin: typingsSlinky.urlParse.urlParseStrings.origin = "origin".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.origin]
    
    @scala.inline
    def password: typingsSlinky.urlParse.urlParseStrings.password = "password".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.password]
    
    @scala.inline
    def pathname: typingsSlinky.urlParse.urlParseStrings.pathname = "pathname".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.pathname]
    
    @scala.inline
    def port: typingsSlinky.urlParse.urlParseStrings.port = "port".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.port]
    
    @scala.inline
    def protocol: typingsSlinky.urlParse.urlParseStrings.protocol = "protocol".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.protocol]
    
    @scala.inline
    def query: typingsSlinky.urlParse.urlParseStrings.query = "query".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.query]
    
    @scala.inline
    def slashes: typingsSlinky.urlParse.urlParseStrings.slashes = "slashes".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.slashes]
    
    @scala.inline
    def username: typingsSlinky.urlParse.urlParseStrings.username = "username".asInstanceOf[typingsSlinky.urlParse.urlParseStrings.username]
  }
}
