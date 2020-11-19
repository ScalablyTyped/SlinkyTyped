package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Area
import typingsSlinky.typedoc.anon.Code
import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.eventsMod.PageEvent
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", JSImport.Namespace)
@js.native
object prettyPrintPluginMod extends js.Object {
  
  @js.native
  class PrettyPrintPlugin () extends AbstractComponent[Renderer] {
    
    def onRendererEndPage(event: PageEvent): Unit = js.native
  }
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    
    var IGNORED_TAGS: Area = js.native
    
    var PRE_TAGS: Code = js.native
  }
}
