package typingsSlinky.wanakana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripOkuriganaOptions extends js.Object {
  var leading: js.UndefOr[Boolean] = js.native
  var matchKanji: js.UndefOr[String] = js.native
}

object StripOkuriganaOptions {
  @scala.inline
  def apply(): StripOkuriganaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripOkuriganaOptions]
  }
  @scala.inline
  implicit class StripOkuriganaOptionsOps[Self <: StripOkuriganaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchKanji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchKanji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchKanji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchKanji")(js.undefined)
        ret
    }
  }
  
}

