package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Caption
import typingsSlinky.typedoc.eventsMod.MarkdownEvent
import typingsSlinky.typedoc.eventsMod.RendererEvent
import typingsSlinky.typedoc.outputComponentsMod.ContextAwareRendererComponent
import typingsSlinky.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markedLinksPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin")
  @js.native
  class MarkedLinksPlugin protected () extends ContextAwareRendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var brackets: js.Any = js.native
    
    var buildLink: js.Any = js.native
    
    var inlineTag: js.Any = js.native
    
    var listInvalidSymbolLinks: Boolean = js.native
    
    def onEndRenderer(event: RendererEvent): Unit = js.native
    
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
    
    var replaceBrackets: js.Any = js.native
    
    var replaceInlineTags: js.Any = js.native
    
    var warnings: js.Any = js.native
  }
  /* static members */
  object MarkedLinksPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin.splitLinkText")
    @js.native
    def splitLinkText(text: String): Caption = js.native
  }
}
