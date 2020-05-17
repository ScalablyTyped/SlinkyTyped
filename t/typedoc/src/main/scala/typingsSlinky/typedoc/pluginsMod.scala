package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.commentsMod.Comment
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.reflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  @js.native
  class CategoryPlugin ()
    extends typingsSlinky.typedoc.categoryPluginMod.CategoryPlugin
  
  @js.native
  class CommentPlugin ()
    extends typingsSlinky.typedoc.commentPluginMod.CommentPlugin
  
  @js.native
  class DecoratorPlugin ()
    extends typingsSlinky.typedoc.decoratorPluginMod.DecoratorPlugin
  
  @js.native
  class DeepCommentPlugin ()
    extends typingsSlinky.typedoc.deepCommentPluginMod.DeepCommentPlugin
  
  @js.native
  class DynamicModulePlugin ()
    extends typingsSlinky.typedoc.dynamicModulePluginMod.DynamicModulePlugin
  
  @js.native
  class GitHubPlugin ()
    extends typingsSlinky.typedoc.gitHubPluginMod.GitHubPlugin
  
  @js.native
  class GroupPlugin ()
    extends typingsSlinky.typedoc.groupPluginMod.GroupPlugin
  
  @js.native
  class ImplementsPlugin ()
    extends typingsSlinky.typedoc.implementsPluginMod.ImplementsPlugin
  
  @js.native
  class PackagePlugin ()
    extends typingsSlinky.typedoc.packagePluginMod.PackagePlugin
  
  @js.native
  class SourcePlugin ()
    extends typingsSlinky.typedoc.sourcePluginMod.SourcePlugin
  
  @js.native
  class TypePlugin ()
    extends typingsSlinky.typedoc.typePluginMod.TypePlugin
  
  /* static members */
  @js.native
  object CategoryPlugin extends js.Object {
    var WEIGHTS: js.Array[String] = js.native
    var defaultCategory: String = js.native
    def getCategory(reflection: Reflection): String = js.native
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
  
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    def removeReflection(project: ProjectReflection, reflection: typingsSlinky.typedoc.reflectionsMod.Reflection): Unit = js.native
    def removeReflection(
      project: ProjectReflection,
      reflection: typingsSlinky.typedoc.reflectionsMod.Reflection,
      deletedIds: js.Array[Double]
    ): Unit = js.native
    def removeReflections(project: ProjectReflection, reflections: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection]): Unit = js.native
    def removeTags(comment: js.UndefOr[Comment], tagName: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    var getKindString: js.Any = js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    def getReflectionGroups(reflections: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    def sortCallback(
      a: typingsSlinky.typedoc.reflectionsMod.Reflection,
      b: typingsSlinky.typedoc.reflectionsMod.Reflection
    ): Double = js.native
  }
  
}

