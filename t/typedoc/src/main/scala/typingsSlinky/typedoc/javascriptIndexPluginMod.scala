package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/JavascriptIndexPlugin", JSImport.Namespace)
@js.native
object javascriptIndexPluginMod extends js.Object {
  @js.native
  class JavascriptIndexPlugin () extends AbstractComponent[Renderer] {
    var onRendererBegin: js.Any = js.native
  }
  
}

