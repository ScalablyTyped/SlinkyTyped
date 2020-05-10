package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.storybookComponents.tooltipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("@storybook/components/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def arrowProps(value: js.Any): this.type = set("arrowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowRef(value: js.Any): this.type = set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def color(
      value: primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    ): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def hasChrome(value: Boolean): this.type = set("hasChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipRef(value: js.Any): this.type = set("tooltipRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

