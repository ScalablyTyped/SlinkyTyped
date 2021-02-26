package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.sectionRowMod.Level
import typingsSlinky.storybookComponents.sectionRowMod.SectionRowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SectionRow {
  
  @scala.inline
  def apply(colSpan: Double, label: String, level: Level): Builder = {
    val __props = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SectionRowProps]))
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/SectionRow", "SectionRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def initialExpanded(value: Boolean): this.type = set("initialExpanded", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SectionRowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
