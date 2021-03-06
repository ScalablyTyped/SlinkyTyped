package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.tooltipNoteMod.TooltipNoteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipNote {
  
  @scala.inline
  def apply(note: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TooltipNoteProps]))
  }
  
  @JSImport("@storybook/components", "TooltipNote")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipNoteProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
