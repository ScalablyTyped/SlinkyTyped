package typingsSlinky.storybookAddonCentered

import typingsSlinky.storybookAddonCentered.storybookAddonCenteredStrings.`0`
import typingsSlinky.storybookAddonCentered.storybookAddonCenteredStrings.auto
import typingsSlinky.storybookAddonCentered.storybookAddonCenteredStrings.center
import typingsSlinky.storybookAddonCentered.storybookAddonCenteredStrings.fixed
import typingsSlinky.storybookAddonCentered.storybookAddonCenteredStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignItems extends js.Object {
  val alignItems: center = js.native
  val bottom: `0` = js.native
  val display: flex = js.native
  val left: `0` = js.native
  val overflow: auto = js.native
  val position: fixed = js.native
  val right: `0` = js.native
  val top: `0` = js.native
}

object AnonAlignItems {
  @scala.inline
  def apply(
    alignItems: center,
    bottom: `0`,
    display: flex,
    left: `0`,
    overflow: auto,
    position: fixed,
    right: `0`,
    top: `0`
  ): AnonAlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignItems]
  }
  @scala.inline
  implicit class AnonAlignItemsOps[Self <: AnonAlignItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: flex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

