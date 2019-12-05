package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection
import typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsTocPluginMod extends js.Object {
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

