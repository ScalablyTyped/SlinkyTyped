package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", JSImport.Namespace)
@js.native
object navigationPluginMod extends js.Object {
  
  @js.native
  class NavigationPlugin () extends AbstractComponent[Renderer] {
    
    var navigation: NavigationItem = js.native
    
    var onBeginPage: js.Any = js.native
    
    var onBeginRenderer: js.Any = js.native
  }
}
