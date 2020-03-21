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
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object outputComponentsMod extends js.Object {
  @js.native
  abstract class ContextAwareRendererComponent () extends AbstractComponent[Renderer] {
    var location: js.Any = js.native
    var project: js.UndefOr[ProjectReflection] = js.native
    var reflection: js.UndefOr[DeclarationReflection] = js.native
    var urlPrefix: js.RegExp = js.native
    def getRelativeUrl(absolute: String): String = js.native
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
  }
  
  @js.native
  abstract class RendererComponent () extends AbstractComponent[Renderer]
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
}

