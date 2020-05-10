package typingsSlinky.trustedTypes.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedTypePolicyOptions extends js.Object {
  var createHTML: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  var createScript: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  var createScriptURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  var createURL: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
}

object TrustedTypePolicyOptions {
  @scala.inline
  def apply(): TrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedTypePolicyOptions]
  }
  @scala.inline
  implicit class TrustedTypePolicyOptionsOps[Self <: TrustedTypePolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHTML(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateScript(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScript")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateScriptURL(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScriptURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateScriptURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScriptURL")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateURL(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.undefined)
        ret
    }
  }
  
}

