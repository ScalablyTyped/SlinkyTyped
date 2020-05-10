package typingsSlinky.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizeOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
}

object TokenizeOptions {
  @scala.inline
  def apply(): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizeOptions]
  }
  @scala.inline
  implicit class TokenizeOptionsOps[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
  }
  
}

