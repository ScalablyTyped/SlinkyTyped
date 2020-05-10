package typingsSlinky.storybookComponents.tooltipMod

import typingsSlinky.storybookComponents.storybookComponentsStrings.ancillary
import typingsSlinky.storybookComponents.storybookComponentsStrings.border
import typingsSlinky.storybookComponents.storybookComponentsStrings.critical
import typingsSlinky.storybookComponents.storybookComponentsStrings.dark
import typingsSlinky.storybookComponents.storybookComponentsStrings.darker
import typingsSlinky.storybookComponents.storybookComponentsStrings.darkest
import typingsSlinky.storybookComponents.storybookComponentsStrings.defaultText
import typingsSlinky.storybookComponents.storybookComponentsStrings.gold
import typingsSlinky.storybookComponents.storybookComponentsStrings.green
import typingsSlinky.storybookComponents.storybookComponentsStrings.inverseText
import typingsSlinky.storybookComponents.storybookComponentsStrings.light
import typingsSlinky.storybookComponents.storybookComponentsStrings.lighter
import typingsSlinky.storybookComponents.storybookComponentsStrings.lightest
import typingsSlinky.storybookComponents.storybookComponentsStrings.medium
import typingsSlinky.storybookComponents.storybookComponentsStrings.mediumdark
import typingsSlinky.storybookComponents.storybookComponentsStrings.mediumlight
import typingsSlinky.storybookComponents.storybookComponentsStrings.negative
import typingsSlinky.storybookComponents.storybookComponentsStrings.orange
import typingsSlinky.storybookComponents.storybookComponentsStrings.positive
import typingsSlinky.storybookComponents.storybookComponentsStrings.primary
import typingsSlinky.storybookComponents.storybookComponentsStrings.purple
import typingsSlinky.storybookComponents.storybookComponentsStrings.seafoam
import typingsSlinky.storybookComponents.storybookComponentsStrings.secondary
import typingsSlinky.storybookComponents.storybookComponentsStrings.tertiary
import typingsSlinky.storybookComponents.storybookComponentsStrings.ultraviolet
import typingsSlinky.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends js.Object {
  var arrowProps: js.UndefOr[js.Any] = js.native
  var arrowRef: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[
    primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
  ] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var placement: js.UndefOr[String] = js.native
  var tooltipRef: js.UndefOr[js.Any] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(
      value: primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChrome")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipRef")(js.undefined)
        ret
    }
  }
  
}

