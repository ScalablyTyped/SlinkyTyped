package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.componentMod.ComponentOptions
import typingsSlinky.typedoc.eventsMod.PageEvent
import typingsSlinky.typedoc.eventsMod.RendererEvent
import typingsSlinky.typedoc.reflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.reflectionsMod.ProjectReflection
import typingsSlinky.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputComponentsMod {
  
  @JSImport("typedoc/dist/lib/output/components", "Component")
  @js.native
  def Component(options: ComponentOptions): ClassDecorator = js.native
  
  @JSImport("typedoc/dist/lib/output/components", "ContextAwareRendererComponent")
  @js.native
  abstract class ContextAwareRendererComponent protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    def getRelativeUrl(absolute: String): String = js.native
    
    var location: js.Any = js.native
    
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
    
    var project: js.UndefOr[ProjectReflection] = js.native
    
    var reflection: js.UndefOr[DeclarationReflection] = js.native
    
    var urlPrefix: js.RegExp = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/components", "RendererComponent")
  @js.native
  abstract class RendererComponent protected () extends AbstractComponent[Renderer] {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
}
