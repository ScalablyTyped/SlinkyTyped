package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibOutputThemesDefaultThemeMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/MinimalTheme", JSImport.Namespace)
@js.native
object distLibOutputThemesMinimalThemeMod extends js.Object {
  @js.native
  class MinimalTheme protected () extends DefaultTheme {
    def this(renderer: Renderer, basePath: String) = this()
    var onRendererBeginPage: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MinimalTheme extends js.Object {
    def buildToc(model: DeclarationReflection, parent: NavigationItem): Unit = js.native
  }
  
}

