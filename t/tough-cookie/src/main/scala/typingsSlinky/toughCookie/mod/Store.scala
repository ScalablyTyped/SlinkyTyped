package typingsSlinky.toughCookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "Store")
@js.native
abstract class Store () extends js.Object {
  var synchronous: Boolean = js.native
  def findCookie(
    domain: String,
    path: String,
    key: String,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ Cookie | Null, Unit]
  ): Unit = js.native
  def findCookies(
    domain: String,
    path: String,
    allowSpecialUseDomain: Boolean,
    cb: js.Function2[/* err */ js.Error | Null, /* cookie */ js.Array[Cookie], Unit]
  ): Unit = js.native
  def getAllCookies(cb: js.Function2[/* err */ js.Error | Null, /* cookie */ js.Array[Cookie], Unit]): Unit = js.native
  def putCookie(cookie: Cookie, cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def removeCookies(domain: String, path: String, cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
}

