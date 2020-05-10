package typingsSlinky.simplecrawler

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var Accept: String = js.native
  var `Accept-Encoding`: js.UndefOr[String] = js.native
  var Authorization: js.UndefOr[String] = js.native
  var Host: String = js.native
  var `Proxy-Authorization`: js.UndefOr[String] = js.native
  var Referer: js.UndefOr[String] = js.native
  var `User-Agent`: String = js.native
  var cookie: js.UndefOr[String] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(Accept: String, Host: String, `User-Agent`: String): AnonDictkey = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-Agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAccept-Encoding`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept-Encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-Encoding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept-Encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(js.undefined)
        ret
    }
    @scala.inline
    def `withProxy-Authorization`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proxy-Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProxy-Authorization`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proxy-Authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withReferer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Referer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Referer")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
  }
  
}

