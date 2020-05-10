package typingsSlinky.toughCookie.mod

import typingsSlinky.toughCookie.mod.CookieJar.GetCookiesOptions
import typingsSlinky.toughCookie.mod.CookieJar.Options
import typingsSlinky.toughCookie.mod.CookieJar.Serialized
import typingsSlinky.toughCookie.mod.CookieJar.SetCookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "CookieJar")
@js.native
class CookieJar_ () extends js.Object {
  def this(store: Store) = this()
  def this(store: Store, options: Options) = this()
  def clone(cb: js.Function2[/* err */ js.Error | Null, /* newJar */ this.type, Unit]): Unit = js.native
  def clone(store: Store): js.Promise[CookieJar] = js.native
  def clone(store: Store, cb: js.Function2[/* err */ js.Error | Null, /* newJar */ this.type, Unit]): Unit = js.native
  def cloneSync(): CookieJar = js.native
  def cloneSync(store: Store): CookieJar = js.native
  def getCookieString(currentUrl: String): js.Promise[String] = js.native
  def getCookieString(currentUrl: String, cb: js.Function2[/* err */ js.Error | Null, /* cookies */ String, Unit]): Unit = js.native
  def getCookieString(currentUrl: String, options: GetCookiesOptions): js.Promise[String] = js.native
  def getCookieString(
    currentUrl: String,
    options: GetCookiesOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* cookies */ String, Unit]
  ): Unit = js.native
  def getCookieStringSync(currentUrl: String): String = js.native
  def getCookieStringSync(currentUrl: String, options: GetCookiesOptions): String = js.native
  def getCookies(currentUrl: String): js.Promise[js.Array[Cookie]] = js.native
  def getCookies(
    currentUrl: String,
    cb: js.Function2[/* err */ js.Error | Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit = js.native
  def getCookies(currentUrl: String, options: GetCookiesOptions): js.Promise[js.Array[Cookie]] = js.native
  def getCookies(
    currentUrl: String,
    options: GetCookiesOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit = js.native
  def getCookiesSync(currentUrl: String): js.Array[Cookie] = js.native
  def getCookiesSync(currentUrl: String, options: GetCookiesOptions): js.Array[Cookie] = js.native
  def getSetCookieStrings(currentUrl: String): js.Promise[js.Array[String]] = js.native
  def getSetCookieStrings(
    currentUrl: String,
    cb: js.Function2[/* err */ js.Error | Null, /* cookies */ js.Array[String], Unit]
  ): Unit = js.native
  def getSetCookieStrings(currentUrl: String, options: GetCookiesOptions): js.Promise[js.Array[String]] = js.native
  def getSetCookieStrings(
    currentUrl: String,
    options: GetCookiesOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* cookies */ js.Array[String], Unit]
  ): Unit = js.native
  def getSetCookieStringsSync(currentUrl: String): js.Array[String] = js.native
  def getSetCookieStringsSync(currentUrl: String, options: GetCookiesOptions): js.Array[String] = js.native
  def removeAllCookies(): js.Promise[Unit] = js.native
  def removeAllCookies(cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def removeAllCookiesSync(): Unit = js.native
  def serialize(): js.Promise[Serialized] = js.native
  def serialize(cb: js.Function2[/* err */ js.Error | Null, /* serializedObject */ Serialized, Unit]): Unit = js.native
  def serializeSync(): Serialized = js.native
  def setCookie(cookieOrString: String, currentUrl: String): js.Promise[Cookie] = js.native
  def setCookie(
    cookieOrString: String,
    currentUrl: String,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ Cookie, Unit]
  ): Unit = js.native
  def setCookie(cookieOrString: String, currentUrl: String, options: SetCookieOptions): js.Promise[Cookie] = js.native
  def setCookie(
    cookieOrString: String,
    currentUrl: String,
    options: SetCookieOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ Cookie, Unit]
  ): Unit = js.native
  def setCookie(cookieOrString: Cookie, currentUrl: String): js.Promise[Cookie] = js.native
  def setCookie(
    cookieOrString: Cookie,
    currentUrl: String,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ Cookie, Unit]
  ): Unit = js.native
  def setCookie(cookieOrString: Cookie, currentUrl: String, options: SetCookieOptions): js.Promise[Cookie] = js.native
  def setCookie(
    cookieOrString: Cookie,
    currentUrl: String,
    options: SetCookieOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ Cookie, Unit]
  ): Unit = js.native
  def setCookieSync(cookieOrString: String, currentUrl: String): Cookie = js.native
  def setCookieSync(cookieOrString: String, currentUrl: String, options: SetCookieOptions): Cookie = js.native
  def setCookieSync(cookieOrString: Cookie, currentUrl: String): Cookie = js.native
  def setCookieSync(cookieOrString: Cookie, currentUrl: String, options: SetCookieOptions): Cookie = js.native
  def toJSON(): Serialized = js.native
}

