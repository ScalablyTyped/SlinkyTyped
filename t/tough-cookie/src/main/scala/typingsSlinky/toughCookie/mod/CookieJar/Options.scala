package typingsSlinky.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowSpecialUseDomain: js.UndefOr[Boolean] = js.native
  var looseMode: js.UndefOr[Boolean] = js.native
  var prefixSecurity: js.UndefOr[String] = js.native
  var rejectPublicSuffixes: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSpecialUseDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSpecialUseDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSpecialUseDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSpecialUseDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withLooseMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLooseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looseMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectPublicSuffixes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectPublicSuffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectPublicSuffixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectPublicSuffixes")(js.undefined)
        ret
    }
  }
  
}

