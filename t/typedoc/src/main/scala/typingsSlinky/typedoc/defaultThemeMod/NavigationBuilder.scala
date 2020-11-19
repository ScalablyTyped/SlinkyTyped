package typingsSlinky.typedoc.defaultThemeMod

import typingsSlinky.typedoc.navigationItemMod.NavigationItem
import typingsSlinky.typedoc.reflectionsMod.ContainerReflection
import typingsSlinky.typedoc.reflectionsMod.DeclarationReflection
import typingsSlinky.typedoc.reflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "NavigationBuilder")
@js.native
class NavigationBuilder protected () extends js.Object {
  def this(project: ProjectReflection, entryPoint: ContainerReflection) = this()
  
  def build(hasSeparateGlobals: Boolean): NavigationItem = js.native
  
  /* protected */ def buildChildren(reflection: DeclarationReflection, parent: NavigationItem): Unit = js.native
  
  /* protected */ def buildGroups(reflections: js.Array[DeclarationReflection], parent: NavigationItem): Unit = js.native
  /* protected */ def buildGroups(reflections: js.Array[DeclarationReflection], parent: NavigationItem, buildChildren: Boolean): Unit = js.native
  
  /* protected */ def containsExternals(modules: js.Array[DeclarationReflection]): Boolean = js.native
  
  var entryPoint: js.Any = js.native
  
  /* protected */ def includeDedicatedUrls(reflection: DeclarationReflection, item: NavigationItem): Unit = js.native
  
  var project: js.Any = js.native
  
  /* protected */ def sortReflections(modules: js.Array[DeclarationReflection]): Unit = js.native
}
