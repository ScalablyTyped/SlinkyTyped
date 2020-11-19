package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.projectMod.ProjectReflection
import typingsSlinky.typedoc.rendererMod.Renderer
import typingsSlinky.typedoc.resourcesMod.Resources
import typingsSlinky.typedoc.urlMappingMod.UrlMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  
  @js.native
  abstract class Theme protected () extends AbstractComponent[Renderer] {
    def this(renderer: Renderer, basePath: String) = this()
    
    var basePath: String = js.native
    
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    
    def isOutputDirectory(path: String): Boolean = js.native
    
    var resources: Resources = js.native
  }
}
