package typingsSlinky.styletronReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronReact.mod.DevProviderProps
import typingsSlinky.styletronStandard.mod.StandardEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DevProvider {
  
  @scala.inline
  def apply(value: StandardEngine): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DevProviderProps]))
  }
  
  @JSImport("styletron-react", "DevProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.styletronReact.mod.DevProvider] {
    
    @scala.inline
    def debug(value: DebugEngine): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debugAfterHydration(value: Boolean): this.type = set("debugAfterHydration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DevProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
