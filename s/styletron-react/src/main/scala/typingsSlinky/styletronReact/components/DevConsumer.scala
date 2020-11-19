package typingsSlinky.styletronReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.styletronReact.anon.Children
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DevConsumer {
  
  @JSImport("styletron-react", "DevConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
}
