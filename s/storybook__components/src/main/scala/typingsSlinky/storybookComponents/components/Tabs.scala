package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.anon.OnSelect
import typingsSlinky.storybookComponents.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("@storybook/components", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def absolute(value: Boolean): this.type = set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actions(value: OnSelect): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: String): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toolsReactElement(value: ReactElement): this.type = set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tools(value: ReactElement): this.type = set("tools", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
