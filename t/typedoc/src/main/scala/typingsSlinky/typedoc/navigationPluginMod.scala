package typingsSlinky.typedoc

import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.outputComponentsMod.RendererComponent
import typingsSlinky.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", "NavigationPlugin")
  @js.native
  class NavigationPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var navigation: NavigationItem = js.native
    
    var onBeginPage: js.Any = js.native
    
    var onBeginRenderer: js.Any = js.native
  }
}
