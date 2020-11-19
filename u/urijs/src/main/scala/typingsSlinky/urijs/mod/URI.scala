package typingsSlinky.urijs.mod

import typingsSlinky.urijs.urijsStrings.absolute
import typingsSlinky.urijs.urijsStrings.domain
import typingsSlinky.urijs.urijsStrings.idn
import typingsSlinky.urijs.urijsStrings.inet4
import typingsSlinky.urijs.urijsStrings.inet6
import typingsSlinky.urijs.urijsStrings.ip
import typingsSlinky.urijs.urijsStrings.ip4
import typingsSlinky.urijs.urijsStrings.ip6
import typingsSlinky.urijs.urijsStrings.ipv4
import typingsSlinky.urijs.urijsStrings.ipv6
import typingsSlinky.urijs.urijsStrings.name
import typingsSlinky.urijs.urijsStrings.punycode
import typingsSlinky.urijs.urijsStrings.relative
import typingsSlinky.urijs.urijsStrings.sld
import typingsSlinky.urijs.urijsStrings.url
import typingsSlinky.urijs.urijsStrings.urn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URI extends js.Object {
  
  def absoluteTo(path: String): URI = js.native
  def absoluteTo(path: URI): URI = js.native
  
  def addFragment(fragment: String): URI = js.native
  
  def addQuery(qry: String): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addQuery(qry: String, value: js.Any): URI = js.native
  def addQuery(qry: js.Object): URI = js.native
  
  // tslint:disable-next-line:unified-signatures
  def addSearch(key: String, value: js.Any): URI = js.native
  def addSearch(qry: String): URI = js.native
  def addSearch(qry: js.Object): URI = js.native
  
  def authority(): String = js.native
  def authority(authority: String): URI = js.native
  
  def directory(): String = js.native
  def directory(dir: String): URI = js.native
  def directory(dir: Boolean): String = js.native
  
  def domain(): String = js.native
  def domain(domain: String): URI = js.native
  def domain(domain: Boolean): String = js.native
  
  def duplicateQueryParameters(`val`: Boolean): URI = js.native
  
  def equals(): Boolean = js.native
  def equals(url: String): Boolean = js.native
  def equals(url: URI): Boolean = js.native
  
  def escapeQuerySpace(`val`: Boolean): URI = js.native
  
  def filename(): String = js.native
  def filename(file: String): URI = js.native
  def filename(file: Boolean): String = js.native
  
  def fragment(): String = js.native
  def fragment(fragment: String): URI = js.native
  
  def fragmentPrefix(prefix: String): URI = js.native
  
  def hasQuery(name: /*string | */ js.Any): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.UndefOr[scala.Nothing], withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: String): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _], withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Double): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.RegExp): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.RegExp, withinArray: Boolean): Boolean = js.native
  
  def hasSearch(name: /*string | */ js.Any): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.UndefOr[scala.Nothing], withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: String): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _], withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: Double): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.RegExp): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: js.RegExp, withinArray: Boolean): Boolean = js.native
  
  def hash(): String = js.native
  def hash(hash: String): URI = js.native
  
  def host(): String = js.native
  def host(host: String): URI = js.native
  
  def hostname(): String = js.native
  def hostname(hostname: String): URI = js.native
  
  def href(): String = js.native
  def href(url: String): Unit = js.native
  
  @JSName("is")
  def is_absolute(qry: absolute): Boolean = js.native
  @JSName("is")
  def is_domain(qry: domain): Boolean = js.native
  @JSName("is")
  def is_idn(qry: idn): Boolean = js.native
  @JSName("is")
  def is_inet4(qry: inet4): Boolean = js.native
  @JSName("is")
  def is_inet6(qry: inet6): Boolean = js.native
  @JSName("is")
  def is_ip(qry: ip): Boolean = js.native
  @JSName("is")
  def is_ip4(qry: ip4): Boolean = js.native
  @JSName("is")
  def is_ip6(qry: ip6): Boolean = js.native
  @JSName("is")
  def is_ipv4(qry: ipv4): Boolean = js.native
  @JSName("is")
  def is_ipv6(qry: ipv6): Boolean = js.native
  @JSName("is")
  def is_name(qry: name): Boolean = js.native
  @JSName("is")
  def is_punycode(qry: punycode): Boolean = js.native
  @JSName("is")
  def is_relative(qry: relative): Boolean = js.native
  @JSName("is")
  def is_sld(qry: sld): Boolean = js.native
  @JSName("is")
  def is_url(qry: url): Boolean = js.native
  @JSName("is")
  def is_urn(qry: urn): Boolean = js.native
  
  def iso8859(): URI = js.native
  
  def normalize(): URI = js.native
  
  def normalizeFragment(): URI = js.native
  
  def normalizeHash(): URI = js.native
  
  def normalizeHostname(): URI = js.native
  
  def normalizePath(): URI = js.native
  
  def normalizePathname(): URI = js.native
  
  def normalizePort(): URI = js.native
  
  def normalizeProtocol(): URI = js.native
  
  def normalizeQuery(): URI = js.native
  
  def normalizeSearch(): URI = js.native
  
  def origin(): String = js.native
  def origin(uri: String): URI = js.native
  def origin(uri: URI): URI = js.native
  
  def password(): String = js.native
  def password(pw: String): URI = js.native
  
  def path(): String = js.native
  def path(path: String): URI = js.native
  def path(path: Boolean): String = js.native
  
  def pathname(): String = js.native
  def pathname(path: String): URI = js.native
  def pathname(path: Boolean): String = js.native
  
  def port(): String = js.native
  def port(port: String): URI = js.native
  
  def preventInvalidHostname(`val`: Boolean): URI = js.native
  
  def protocol(): String = js.native
  def protocol(protocol: String): URI = js.native
  
  def query(): String = js.native
  def query(qry: String): URI = js.native
  def query(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap]): URI = js.native
  def query(qry: Boolean): js.Object = js.native
  def query(qry: QueryDataMap): URI = js.native
  
  def readable(): String = js.native
  
  def relativeTo(path: String): URI = js.native
  
  // tslint:disable-next-line:unified-signatures
  def removeQuery(name: String, value: String): URI = js.native
  def removeQuery(qry: String): URI = js.native
  def removeQuery(qry: js.Object): URI = js.native
  
  // tslint:disable-next-line:unified-signatures
  def removeSearch(name: String, value: String): URI = js.native
  def removeSearch(qry: String): URI = js.native
  def removeSearch(qry: js.Object): URI = js.native
  
  def resource(): String = js.native
  def resource(resource: String): URI = js.native
  
  def scheme(): String = js.native
  def scheme(protocol: String): URI = js.native
  
  def search(): String = js.native
  def search(qry: String): URI = js.native
  def search(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap]): URI = js.native
  def search(qry: Boolean): js.Any = js.native
  def search(qry: QueryDataMap): URI = js.native
  
  def segment(): js.Array[String] = js.native
  def segment(position: Double): js.UndefOr[String] = js.native
  def segment(position: Double, level: String): URI = js.native
  def segment(segments: String): URI = js.native
  def segment(segments: js.Array[String]): URI = js.native
  
  def segmentCoded(): js.Array[String] = js.native
  def segmentCoded(position: Double): String = js.native
  def segmentCoded(position: Double, level: String): URI = js.native
  def segmentCoded(segments: String): URI = js.native
  def segmentCoded(segments: js.Array[String]): URI = js.native
  
  def setQuery(key: String, value: String): URI = js.native
  def setQuery(qry: js.Object): URI = js.native
  
  def setSearch(key: String, value: String): URI = js.native
  def setSearch(qry: js.Object): URI = js.native
  
  def subdomain(): String = js.native
  def subdomain(subdomain: String): URI = js.native
  
  def suffix(): String = js.native
  def suffix(suffix: String): URI = js.native
  def suffix(suffix: Boolean): String = js.native
  
  def tld(): String = js.native
  def tld(tld: String): URI = js.native
  def tld(tld: Boolean): String = js.native
  
  def unicode(): URI = js.native
  
  def userinfo(): String = js.native
  def userinfo(userinfo: String): URI = js.native
  
  def username(): String = js.native
  def username(uname: String): URI = js.native
}
