package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/AssetsPlugin", JSImport.Namespace)
@js.native
object assetsPluginMod extends js.Object {
  
  @js.native
  class AssetsPlugin () extends AbstractComponent[Renderer] {
    
    var copyDefaultAssets: Boolean = js.native
    
    var onRendererBegin: js.Any = js.native
  }
}
