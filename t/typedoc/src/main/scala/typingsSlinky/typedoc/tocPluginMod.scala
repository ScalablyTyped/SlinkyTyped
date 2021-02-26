package typingsSlinky.typedoc

import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.outputComponentsMod.RendererComponent
import typingsSlinky.typedoc.reflectionsMod.Reflection
import typingsSlinky.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tocPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin")
  @js.native
  class TocPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var onRendererBeginPage: js.Any = js.native
  }
  /* static members */
  object TocPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin.buildToc")
    @js.native
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    @JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin.buildToc")
    @js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
}
