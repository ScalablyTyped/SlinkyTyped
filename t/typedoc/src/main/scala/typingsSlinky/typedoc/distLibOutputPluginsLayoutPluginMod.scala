package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/LayoutPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsLayoutPluginMod extends js.Object {
  @js.native
  class LayoutPlugin () extends AbstractComponent[Renderer] {
    var onRendererEndPage: js.Any = js.native
  }
  
}

