package typingsSlinky.urijs.uri

import typingsSlinky.std.RegExp
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
import scala.scalajs.js.annotation._

@js.native
trait URI extends js.Object {
  def absoluteTo(path: String): typingsSlinky.urijs.uri.URI = js.native
  def absoluteTo(path: typingsSlinky.urijs.uri.URI): typingsSlinky.urijs.uri.URI = js.native
  def addFragment(fragment: String): typingsSlinky.urijs.uri.URI = js.native
  def addQuery(qry: String): typingsSlinky.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addQuery(qry: String, value: js.Any): typingsSlinky.urijs.uri.URI = js.native
  def addQuery(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addSearch(key: String, value: js.Any): typingsSlinky.urijs.uri.URI = js.native
  def addSearch(qry: String): typingsSlinky.urijs.uri.URI = js.native
  def addSearch(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def authority(): String = js.native
  def authority(authority: String): typingsSlinky.urijs.uri.URI = js.native
  def directory(): String = js.native
  def directory(dir: String): typingsSlinky.urijs.uri.URI = js.native
  def directory(dir: Boolean): String = js.native
  def domain(): String = js.native
  def domain(domain: String): typingsSlinky.urijs.uri.URI = js.native
  def domain(domain: Boolean): String = js.native
  def duplicateQueryParameters(`val`: Boolean): typingsSlinky.urijs.uri.URI = js.native
  def equals(): Boolean = js.native
  def equals(url: String): Boolean = js.native
  def equals(url: typingsSlinky.urijs.uri.URI): Boolean = js.native
  def filename(): String = js.native
  def filename(file: String): typingsSlinky.urijs.uri.URI = js.native
  def filename(file: Boolean): String = js.native
  def fragment(): String = js.native
  def fragment(fragment: String): typingsSlinky.urijs.uri.URI = js.native
  def fragmentPrefix(prefix: String): typingsSlinky.urijs.uri.URI = js.native
  def hasQuery(name: /*string | */ js.Any): Boolean = js.native
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
  def hasQuery(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any): Boolean = js.native
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
  def hasSearch(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
  def hash(): String = js.native
  def hash(hash: String): typingsSlinky.urijs.uri.URI = js.native
  def host(): String = js.native
  def host(host: String): typingsSlinky.urijs.uri.URI = js.native
  def hostname(): String = js.native
  def hostname(hostname: String): typingsSlinky.urijs.uri.URI = js.native
  def href(): String = js.native
  def href(url: String): Unit = js.native
  def is(
    qry: relative | absolute | urn | url | domain | name | sld | idn | punycode | ip | ip4 | ipv4 | inet4 | ip6 | ipv6 | inet6
  ): Boolean = js.native
  def iso8859(): typingsSlinky.urijs.uri.URI = js.native
  def normalize(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeFragment(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeHash(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeHostname(): typingsSlinky.urijs.uri.URI = js.native
  def normalizePath(): typingsSlinky.urijs.uri.URI = js.native
  def normalizePathname(): typingsSlinky.urijs.uri.URI = js.native
  def normalizePort(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeProtocol(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeQuery(): typingsSlinky.urijs.uri.URI = js.native
  def normalizeSearch(): typingsSlinky.urijs.uri.URI = js.native
  def origin(): String = js.native
  def origin(uri: String): typingsSlinky.urijs.uri.URI = js.native
  def origin(uri: typingsSlinky.urijs.uri.URI): typingsSlinky.urijs.uri.URI = js.native
  def password(): String = js.native
  def password(pw: String): typingsSlinky.urijs.uri.URI = js.native
  def path(): String = js.native
  def path(path: String): typingsSlinky.urijs.uri.URI = js.native
  def path(path: Boolean): String = js.native
  def pathname(): String = js.native
  def pathname(path: String): typingsSlinky.urijs.uri.URI = js.native
  def pathname(path: Boolean): String = js.native
  def port(): String = js.native
  def port(port: String): typingsSlinky.urijs.uri.URI = js.native
  def protocol(): String = js.native
  def protocol(protocol: String): typingsSlinky.urijs.uri.URI = js.native
  def query(): String = js.native
  def query(qry: String): typingsSlinky.urijs.uri.URI = js.native
  def query(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def query(qry: Boolean): js.Object = js.native
  def readable(): String = js.native
  def relativeTo(path: String): typingsSlinky.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeQuery(name: String, value: String): typingsSlinky.urijs.uri.URI = js.native
  def removeQuery(qry: String): typingsSlinky.urijs.uri.URI = js.native
  def removeQuery(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeSearch(name: String, value: String): typingsSlinky.urijs.uri.URI = js.native
  def removeSearch(qry: String): typingsSlinky.urijs.uri.URI = js.native
  def removeSearch(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def resource(): String = js.native
  def resource(resource: String): typingsSlinky.urijs.uri.URI = js.native
  def scheme(): String = js.native
  def scheme(protocol: String): typingsSlinky.urijs.uri.URI = js.native
  def search(): String = js.native
  def search(qry: String): typingsSlinky.urijs.uri.URI = js.native
  def search(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def search(qry: Boolean): js.Any = js.native
  def segment(): js.Array[String] = js.native
  def segment(position: Double): js.UndefOr[String] = js.native
  def segment(position: Double, level: String): typingsSlinky.urijs.uri.URI = js.native
  def segment(segments: String): typingsSlinky.urijs.uri.URI = js.native
  def segment(segments: js.Array[String]): typingsSlinky.urijs.uri.URI = js.native
  def segmentCoded(): js.Array[String] = js.native
  def segmentCoded(position: Double): String = js.native
  def segmentCoded(position: Double, level: String): typingsSlinky.urijs.uri.URI = js.native
  def segmentCoded(segments: String): typingsSlinky.urijs.uri.URI = js.native
  def segmentCoded(segments: js.Array[String]): typingsSlinky.urijs.uri.URI = js.native
  def setQuery(key: String, value: String): typingsSlinky.urijs.uri.URI = js.native
  def setQuery(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def setSearch(key: String, value: String): typingsSlinky.urijs.uri.URI = js.native
  def setSearch(qry: js.Object): typingsSlinky.urijs.uri.URI = js.native
  def subdomain(): String = js.native
  def subdomain(subdomain: String): typingsSlinky.urijs.uri.URI = js.native
  def suffix(): String = js.native
  def suffix(suffix: String): typingsSlinky.urijs.uri.URI = js.native
  def suffix(suffix: Boolean): String = js.native
  def tld(): String = js.native
  def tld(tld: String): typingsSlinky.urijs.uri.URI = js.native
  def tld(tld: Boolean): String = js.native
  def unicode(): typingsSlinky.urijs.uri.URI = js.native
  def userinfo(): String = js.native
  def userinfo(userinfo: String): typingsSlinky.urijs.uri.URI = js.native
  def username(): String = js.native
  def username(uname: String): typingsSlinky.urijs.uri.URI = js.native
}

