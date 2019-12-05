package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.distLibModelsReflectionsMod.ProjectReflection
import typingsSlinky.typedoc.distLibOutputEventsMod.PageEvent
import typingsSlinky.typedoc.distLibOutputEventsMod.RendererEvent
import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import typingsSlinky.typedoc.distLibUtilsComponentMod.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object distLibOutputComponentsMod extends js.Object {
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

