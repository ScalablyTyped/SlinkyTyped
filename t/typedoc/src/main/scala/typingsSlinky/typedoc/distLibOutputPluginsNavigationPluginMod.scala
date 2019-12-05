package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsNavigationPluginMod extends js.Object {
  @js.native
  class NavigationPlugin () extends AbstractComponent[Renderer] {
    var navigation: NavigationItem = js.native
    var onBeginPage: js.Any = js.native
    var onBeginRenderer: js.Any = js.native
  }
  
}

