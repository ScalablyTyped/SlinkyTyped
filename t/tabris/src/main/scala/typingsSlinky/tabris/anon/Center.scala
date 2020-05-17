package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.JSXShorthands
import typingsSlinky.tabris.tabrisBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Center
  extends JSXShorthands[js.Any] {
  var center: js.UndefOr[`true`] = js.native
  var stretch: js.UndefOr[`true`] = js.native
  var stretchX: js.UndefOr[`true`] = js.native
  var stretchY: js.UndefOr[`true`] = js.native
}

object Center {
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withStretch(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchX(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchX")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchY(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchY")(js.undefined)
        ret
    }
  }
  
}

