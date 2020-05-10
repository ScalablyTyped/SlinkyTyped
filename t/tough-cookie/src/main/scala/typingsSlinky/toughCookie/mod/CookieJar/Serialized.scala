package typingsSlinky.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serialized extends js.Object {
  var cookies: js.Array[typingsSlinky.toughCookie.mod.Cookie.Serialized] = js.native
  var rejectPublicSuffixes: Boolean = js.native
  var storeType: String = js.native
  var version: String = js.native
}

object Serialized {
  @scala.inline
  def apply(
    cookies: js.Array[typingsSlinky.toughCookie.mod.Cookie.Serialized],
    rejectPublicSuffixes: Boolean,
    storeType: String,
    version: String
  ): Serialized = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], rejectPublicSuffixes = rejectPublicSuffixes.asInstanceOf[js.Any], storeType = storeType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serialized]
  }
  @scala.inline
  implicit class SerializedOps[Self <: Serialized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookies(value: js.Array[typingsSlinky.toughCookie.mod.Cookie.Serialized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectPublicSuffixes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectPublicSuffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

