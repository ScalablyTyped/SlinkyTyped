package typingsSlinky.trustedTypes.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var TrustedHTML: typingsSlinky.trustedTypes.mod._Global_.TrustedHTML = js.native
  var TrustedScript: typingsSlinky.trustedTypes.mod._Global_.TrustedScript = js.native
  var TrustedScriptURL: typingsSlinky.trustedTypes.mod._Global_.TrustedScriptURL = js.native
  var TrustedTypePolicy: typingsSlinky.trustedTypes.mod._Global_.TrustedTypePolicy = js.native
  var TrustedTypePolicyFactory: typingsSlinky.trustedTypes.mod._Global_.TrustedTypePolicyFactory = js.native
  /** @deprecated Prefer the lowercase version. */
  var TrustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.native
  var TrustedURL: typingsSlinky.trustedTypes.mod._Global_.TrustedURL = js.native
  // NOTE: This is needed while the implementation in Chrome still relies
  // on the old uppercase name, either of the values below could be
  // undefined.
  // See https://github.com/w3c/webappsec-trusted-types/issues/177
  var trustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.native
}

object Window {
  @scala.inline
  def apply(
    TrustedHTML: TrustedHTML,
    TrustedScript: TrustedScript,
    TrustedScriptURL: TrustedScriptURL,
    TrustedTypePolicy: TrustedTypePolicy,
    TrustedTypePolicyFactory: TrustedTypePolicyFactory,
    TrustedURL: TrustedURL
  ): Window = {
    val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML.asInstanceOf[js.Any], TrustedScript = TrustedScript.asInstanceOf[js.Any], TrustedScriptURL = TrustedScriptURL.asInstanceOf[js.Any], TrustedTypePolicy = TrustedTypePolicy.asInstanceOf[js.Any], TrustedTypePolicyFactory = TrustedTypePolicyFactory.asInstanceOf[js.Any], TrustedURL = TrustedURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrustedHTML(value: TrustedHTML): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedScript(value: TrustedScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedScriptURL(value: TrustedScriptURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedScriptURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedTypePolicy(value: TrustedTypePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedTypePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedTypePolicyFactory(value: TrustedTypePolicyFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedTypePolicyFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedURL(value: TrustedURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedTypes(value: TrustedTypePolicyFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustedTypes")(js.undefined)
        ret
    }
  }
  
}

