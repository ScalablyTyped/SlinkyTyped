package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeInjection extends js.Object {
  var codeinjection_foot: js.UndefOr[Nullable[String]] = js.native
  var codeinjection_head: js.UndefOr[Nullable[String]] = js.native
}

object CodeInjection {
  @scala.inline
  def apply(): CodeInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeInjection]
  }
  @scala.inline
  implicit class CodeInjectionOps[Self <: CodeInjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeinjection_foot(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_foot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeinjection_foot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_foot")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeinjection_footNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_foot")(null)
        ret
    }
    @scala.inline
    def withCodeinjection_head(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeinjection_head: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_head")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeinjection_headNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeinjection_head")(null)
        ret
    }
  }
  
}

