package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsCommentsMod.Comment
import typingsSlinky.typedoc.distLibModelsMod.Reflection
import typingsSlinky.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typedoc.distLibModelsReflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", JSImport.Namespace)
@js.native
object distLibConverterPluginsMod extends js.Object {
  @js.native
  class CategoryPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsCategoryPluginMod.CategoryPlugin
  
  @js.native
  class CommentPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsCommentPluginMod.CommentPlugin
  
  @js.native
  class DecoratorPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsDecoratorPluginMod.DecoratorPlugin
  
  @js.native
  class DeepCommentPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsDeepCommentPluginMod.DeepCommentPlugin
  
  @js.native
  class DynamicModulePlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsDynamicModulePluginMod.DynamicModulePlugin
  
  @js.native
  class GitHubPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsGitHubPluginMod.GitHubPlugin
  
  @js.native
  class GroupPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsGroupPluginMod.GroupPlugin
  
  @js.native
  class ImplementsPlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsImplementsPluginMod.ImplementsPlugin
  
  @js.native
  class PackagePlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsPackagePluginMod.PackagePlugin
  
  @js.native
  class SourcePlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsSourcePluginMod.SourcePlugin
  
  @js.native
  class TypePlugin ()
    extends typingsSlinky.typedoc.distLibConverterPluginsTypePluginMod.TypePlugin
  
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
    def removeReflection(
      project: ProjectReflection,
      reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection
    ): Unit = js.native
    def removeReflection(
      project: ProjectReflection,
      reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
      deletedIds: js.Array[Double]
    ): Unit = js.native
    def removeReflections(
      project: ProjectReflection,
      reflections: js.Array[typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection]
    ): Unit = js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    var getKindString: js.Any = js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    def getReflectionGroups(reflections: js.Array[typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    def sortCallback(
      a: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
      b: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection
    ): Double = js.native
  }
  
}

