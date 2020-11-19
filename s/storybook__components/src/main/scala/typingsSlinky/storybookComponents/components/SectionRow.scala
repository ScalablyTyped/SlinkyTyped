package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.sectionRowMod.SectionRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SectionRow {
  
  @JSImport("@storybook/components/dist/blocks/PropsTable/SectionRow", "SectionRow")
  @js.native
  object component extends js.Object
  
  def withProps(p: SectionRowProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(section: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SectionRowProps]))
  }
}
