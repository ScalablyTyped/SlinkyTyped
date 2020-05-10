package typingsSlinky.yogBigpipe.mod

import typingsSlinky.yogBigpipe.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigPipeOption extends js.Object {
  var skipAnalysis: js.UndefOr[Boolean] = js.native
  var tpl: js.UndefOr[AnonDefault] = js.native
}

object BigPipeOption {
  @scala.inline
  def apply(): BigPipeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigPipeOption]
  }
  @scala.inline
  implicit class BigPipeOptionOps[Self <: BigPipeOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipAnalysis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAnalysis")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: AnonDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

