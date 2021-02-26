package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.tabsMod.TabWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabWrapper {
  
  @scala.inline
  def apply(active: Boolean): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabWrapperProps]))
  }
  
  @JSImport("@storybook/components", "TabWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def render(value: () => ReactElement): this.type = set("render", js.Any.fromFunction0(value))
  }
  
  def withProps(p: TabWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
