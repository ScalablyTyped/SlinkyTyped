package typingsSlinky.uglifyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  /**
    * Support top level `return` statements
    * @default false
    */
  var bare_returns: js.UndefOr[Boolean] = js.native
  /** @default true */
  var html5_comments: js.UndefOr[Boolean] = js.native
  /**
    * Support `#!command` as the first line
    * @default true
    */
  var shebang: js.UndefOr[Boolean] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBare_returns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare_returns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBare_returns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bare_returns")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withShebang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shebang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShebang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shebang")(js.undefined)
        ret
    }
  }
  
}

