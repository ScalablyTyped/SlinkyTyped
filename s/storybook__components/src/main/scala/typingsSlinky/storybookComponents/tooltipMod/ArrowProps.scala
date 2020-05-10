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
trait ArrowProps extends js.Object {
  var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = js.native
  var placement: String = js.native
}

object ArrowProps {
  @scala.inline
  def apply(
    color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
    placement: String
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowProps]
  }
  @scala.inline
  implicit class ArrowPropsOps[Self <: ArrowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(
      value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

