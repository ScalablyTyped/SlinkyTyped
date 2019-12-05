package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typingsSlinky.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typingsSlinky.typedoc.distLibOutputRendererMod.Renderer
import typingsSlinky.typedoc.distLibOutputUtilsResourcesMod.Resources
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/theme", JSImport.Namespace)
@js.native
object distLibOutputThemeMod extends js.Object {
  @js.native
  abstract class Theme protected () extends AbstractComponent[Renderer] {
    def this(renderer: Renderer, basePath: String) = this()
    var basePath: String = js.native
    var resources: Resources = js.native
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    def isOutputDirectory(path: String): Boolean = js.native
  }
  
}

