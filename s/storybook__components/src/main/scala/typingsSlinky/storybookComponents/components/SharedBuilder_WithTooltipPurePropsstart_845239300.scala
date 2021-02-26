package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.storybookComponents.anon.PartialModifierstring
import typingsSlinky.storybookComponents.storybookComponentsStrings.`right-click`
import typingsSlinky.storybookComponents.storybookComponentsStrings.click
import typingsSlinky.storybookComponents.storybookComponentsStrings.hover
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import typingsSlinky.storybookComponents.withTooltipMod.WithHideFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_WithTooltipPurePropsstart_845239300 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasChrome(value: Boolean): this.type = set("hasChrome", value.asInstanceOf[js.Any])
  
  @scala.inline
  def modifiers(value: js.Array[PartialModifierstring]): this.type = set("modifiers", value.asInstanceOf[js.Any])
  
  @scala.inline
  def modifiersVarargs(value: PartialModifierstring*): this.type = set("modifiers", js.Array(value :_*))
  
  @scala.inline
  def onDoubleClick(value: () => Unit): this.type = set("onDoubleClick", js.Any.fromFunction0(value))
  
  @scala.inline
  def onVisibilityChange(value: /* visibility */ Boolean => Unit): this.type = set("onVisibilityChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def svg(value: Boolean): this.type = set("svg", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltip(value: ReactElement | (js.Function1[/* p */ WithHideFn, ReactElement])): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltipFunction1(value: /* p */ WithHideFn => ReactElement): this.type = set("tooltip", js.Any.fromFunction1(value))
  
  @scala.inline
  def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltipShown(value: Boolean): this.type = set("tooltipShown", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: none | hover | click | `right-click`): this.type = set("trigger", value.asInstanceOf[js.Any])
}
