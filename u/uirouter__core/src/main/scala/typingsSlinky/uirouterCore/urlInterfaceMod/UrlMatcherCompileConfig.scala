package typingsSlinky.uirouterCore.urlInterfaceMod

import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatcherCompileConfig extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[StateDeclaration] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object UrlMatcherCompileConfig {
  @scala.inline
  def apply(): UrlMatcherCompileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMatcherCompileConfig]
  }
  @scala.inline
  implicit class UrlMatcherCompileConfigOps[Self <: UrlMatcherCompileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseInsensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: StateDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

