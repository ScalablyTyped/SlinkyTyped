package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.autosizeMod.AutoSize
import typingsSlinky.vegaTypings.autosizeMod.AutoSizeType
import typingsSlinky.vegaTypings.vegaTypingsStrings.content
import typingsSlinky.vegaTypings.vegaTypingsStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contains extends AutoSize {
  var contains: js.UndefOr[content | padding] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var `type`: AutoSizeType = js.native
}

object Contains {
  @scala.inline
  def apply(`type`: AutoSizeType): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  @scala.inline
  implicit class ContainsOps[Self <: Contains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: AutoSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: content | padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
  }
  
}

