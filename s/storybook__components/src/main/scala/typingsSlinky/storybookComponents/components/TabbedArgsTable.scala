package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.std.Record
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typingsSlinky.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbedArgsTable {
  
  @scala.inline
  def apply(tabs: Record[String, ArgsTableProps]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TabbedArgsTableProps]))
  }
  
  @JSImport("@storybook/components", "TabbedArgsTable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabbedArgsTableProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
