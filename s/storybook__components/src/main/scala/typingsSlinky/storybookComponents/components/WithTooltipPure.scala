package typingsSlinky.storybookComponents.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.storybookComponents.storybookComponentsStrings.`right-click`
import typingsSlinky.storybookComponents.storybookComponentsStrings.click
import typingsSlinky.storybookComponents.storybookComponentsStrings.hover
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import typingsSlinky.storybookComponents.withTooltipMod.WithHideFn
import typingsSlinky.storybookComponents.withTooltipMod.WithTooltipPureProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithTooltipPure {
  @JSImport("@storybook/components", "WithTooltipPure")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def hasChrome(value: Boolean): this.type = set("hasChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def modifiers(value: Modifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: () => Unit): this.type = set("onDoubleClick", js.Any.fromFunction0(value))
    @scala.inline
    def onVisibilityChange(value: /* visibility */ Boolean => Unit): this.type = set("onVisibilityChange", js.Any.fromFunction1(value))
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def svg(value: Boolean): this.type = set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFunction1(value: /* p */ WithHideFn => TagMod[Any]): this.type = set("tooltip", js.Any.fromFunction1(value))
    @scala.inline
    def tooltip(value: TagMod[Any] | (js.Function1[/* p */ WithHideFn, TagMod[Any]])): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipShown(value: Boolean): this.type = set("tooltipShown", value.asInstanceOf[js.Any])
    @scala.inline
    def trigger(value: none | hover | click | `right-click`): this.type = set("trigger", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WithTooltipPureProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: WithTooltipPure.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

