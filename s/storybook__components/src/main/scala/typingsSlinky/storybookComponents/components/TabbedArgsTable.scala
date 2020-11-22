package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.std.Record
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typingsSlinky.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbedArgsTable {
  
  @JSImport("@storybook/components", "TabbedArgsTable")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabbedArgsTableProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(tabs: Record[String, ArgsTableProps]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TabbedArgsTableProps]))
  }
}
