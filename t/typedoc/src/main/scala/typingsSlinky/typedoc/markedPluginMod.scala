package typingsSlinky.typedoc

import typingsSlinky.typedoc.eventsMod.MarkdownEvent
import typingsSlinky.typedoc.outputComponentsMod.ContextAwareRendererComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/MarkedPlugin", JSImport.Namespace)
@js.native
object markedPluginMod extends js.Object {
  
  @js.native
  class MarkedPlugin () extends ContextAwareRendererComponent {
    
    def getHighlighted(text: String): String = js.native
    def getHighlighted(text: String, lang: String): String = js.native
    
    var includePattern: js.Any = js.native
    
    var includeSource: String = js.native
    
    var includes: js.Any = js.native
    
    var mediaDirectory: js.Any = js.native
    
    var mediaPattern: js.Any = js.native
    
    var mediaSource: String = js.native
    
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
    
    def parseMarkdown(text: String, context: js.Any): String = js.native
  }
}
