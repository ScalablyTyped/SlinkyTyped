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
trait WrapperProps extends js.Object {
  var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = js.native
  var hasChrome: Boolean = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var placement: String = js.native
}

object WrapperProps {
  @scala.inline
  def apply(
    color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
    hasChrome: Boolean,
    placement: String,
    hidden: js.UndefOr[Boolean] = js.undefined
  ): WrapperProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
}

