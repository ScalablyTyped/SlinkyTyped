package typingsSlinky.tinycolor2.mod

import typingsSlinky.tinycolor2.tinycolor2Strings.AA
import typingsSlinky.tinycolor2.tinycolor2Strings.AAA
import typingsSlinky.tinycolor2.tinycolor2Strings.large
import typingsSlinky.tinycolor2.tinycolor2Strings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WCAG2Options extends js.Object {
  var level: js.UndefOr[AA | AAA] = js.native
  var size: js.UndefOr[large | small] = js.native
}

object WCAG2Options {
  @scala.inline
  def apply(): WCAG2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCAG2Options]
  }
  @scala.inline
  implicit class WCAG2OptionsOps[Self <: WCAG2Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: AA | AAA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: large | small): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

