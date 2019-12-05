package typingsSlinky.typedoc.typedocMod

import typingsSlinky.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.distLibOutputThemesDefaultThemeMod.TemplateMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typingsSlinky.typedoc.distLibOutputThemesDefaultThemeMod.DefaultTheme {
  def this(renderer: typingsSlinky.typedoc.distLibOutputRendererMod.Renderer, basePath: String) = this()
}

/* static members */
@JSImport("typedoc", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: js.RegExp = js.native
  def applyAnchorUrl(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    container: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection
  ): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection): Unit = js.native
  def buildUrls(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection,
    urls: js.Array[typingsSlinky.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping]
  ): js.Array[typingsSlinky.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection): String = js.native
  def getUrl(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    relative: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection
  ): String = js.native
  def getUrl(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    relative: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    separator: String
  ): String = js.native
  def toStyleClass(str: String): String = js.native
}

