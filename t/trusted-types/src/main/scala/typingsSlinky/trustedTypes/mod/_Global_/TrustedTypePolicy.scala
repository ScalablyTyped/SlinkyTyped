package typingsSlinky.trustedTypes.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedTypePolicy extends js.Object {
  val name: String = js.native
  def createHTML(input: String): TrustedHTML = js.native
  def createScript(input: String): TrustedScript = js.native
  def createScriptURL(input: String): TrustedScriptURL = js.native
  def createURL(input: String): TrustedURL = js.native
}

object TrustedTypePolicy {
  @scala.inline
  def apply(
    createHTML: String => TrustedHTML,
    createScript: String => TrustedScript,
    createScriptURL: String => TrustedScriptURL,
    createURL: String => TrustedURL,
    name: String
  ): TrustedTypePolicy = {
    val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), createURL = js.Any.fromFunction1(createURL), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedTypePolicy]
  }
  @scala.inline
  implicit class TrustedTypePolicyOps[Self <: TrustedTypePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHTML(value: String => TrustedHTML): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateScript(value: String => TrustedScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateScriptURL(value: String => TrustedScriptURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScriptURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateURL(value: String => TrustedURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

