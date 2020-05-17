package typingsSlinky.tabris.anon

import typingsSlinky.tabris.tabrisStrings.centerX
import typingsSlinky.tabris.tabrisStrings.left
import typingsSlinky.tabris.tabrisStrings.right
import typingsSlinky.tabris.tabrisStrings.stretchX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spacing extends js.Object {
  var alignment: js.UndefOr[left | centerX | stretchX | right] = js.native
  var spacing: js.UndefOr[Double] = js.native
}

object Spacing {
  @scala.inline
  def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  @scala.inline
  implicit class SpacingOps[Self <: Spacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: left | centerX | stretchX | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
  }
  
}

