package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.reflectionsMod.Reflection
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", JSImport.Namespace)
@js.native
object tocPluginMod extends js.Object {
  
  @js.native
  class TocPlugin () extends AbstractComponent[Renderer] {
    
    var onRendererBeginPage: js.Any = js.native
  }
  /* static members */
  @js.native
  object TocPlugin extends js.Object {
    
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
}
