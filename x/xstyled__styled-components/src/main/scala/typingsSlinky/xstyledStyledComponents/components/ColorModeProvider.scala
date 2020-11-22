package typingsSlinky.xstyledStyledComponents.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.xstyledStyledComponents.mod.ColorModeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorModeProvider {
  
  @JSImport("@xstyled/styled-components", "ColorModeProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ColorModeProviderProps): Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ColorModeProvider] = new Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ColorModeProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(target: HTMLElement, targetSelector: String): Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ColorModeProvider] = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetSelector = targetSelector.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ColorModeProvider](js.Array(this.component, __props.asInstanceOf[ColorModeProviderProps]))
  }
}
