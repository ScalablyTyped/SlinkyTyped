package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.componentMod.ComponentOptions
import typingsSlinky.typedoc.eventsMod.PageEvent
import typingsSlinky.typedoc.eventsMod.RendererEvent
import typingsSlinky.typedoc.reflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.reflectionsMod.ProjectReflection
import typingsSlinky.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object outputComponentsMod extends js.Object {
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
  
  @js.native
  abstract class ContextAwareRendererComponent () extends AbstractComponent[Renderer] {
    
    def getRelativeUrl(absolute: String): String = js.native
    
    var location: js.Any = js.native
    
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
    
    var project: js.UndefOr[ProjectReflection] = js.native
    
    var reflection: js.UndefOr[DeclarationReflection] = js.native
    
    var urlPrefix: js.RegExp = js.native
  }
  
  @js.native
  abstract class RendererComponent () extends AbstractComponent[Renderer]
}
