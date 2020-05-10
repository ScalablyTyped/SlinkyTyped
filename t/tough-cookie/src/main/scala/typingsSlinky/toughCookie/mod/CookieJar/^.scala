package typingsSlinky.toughCookie.mod.CookieJar

import typingsSlinky.toughCookie.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "CookieJar")
@js.native
object ^ extends js.Object {
  def deserialize(serialized: String): js.Promise[typingsSlinky.toughCookie.mod.CookieJar] = js.native
  def deserialize(serialized: String, cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(serialized: String, store: Store): js.Promise[typingsSlinky.toughCookie.mod.CookieJar] = js.native
  def deserialize(
    serialized: String,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserialize(serialized: Serialized): js.Promise[typingsSlinky.toughCookie.mod.CookieJar] = js.native
  def deserialize(serialized: Serialized, cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(serialized: Serialized, store: Store): js.Promise[typingsSlinky.toughCookie.mod.CookieJar] = js.native
  def deserialize(
    serialized: Serialized,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserializeSync(serialized: String): typingsSlinky.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: String, store: Store): typingsSlinky.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: Serialized): typingsSlinky.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: Serialized, store: Store): typingsSlinky.toughCookie.mod.CookieJar = js.native
  def fromJSON(string: String): typingsSlinky.toughCookie.mod.CookieJar = js.native
}

