package typingsSlinky.typedoc.mod

import typingsSlinky.typedoc.defaultThemeMod.TemplateMapping
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typingsSlinky.typedoc.defaultThemeMod.DefaultTheme {
  def this(renderer: typingsSlinky.typedoc.rendererMod.Renderer, basePath: String) = this()
}

/* static members */
@JSImport("typedoc", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: js.RegExp = js.native
  def applyAnchorUrl(
    reflection: typingsSlinky.typedoc.reflectionsMod.Reflection,
    container: typingsSlinky.typedoc.reflectionsMod.Reflection
  ): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: typingsSlinky.typedoc.reflectionsMod.DeclarationReflection): Unit = js.native
  def buildUrls(
    reflection: typingsSlinky.typedoc.reflectionsMod.DeclarationReflection,
    urls: js.Array[typingsSlinky.typedoc.urlMappingMod.UrlMapping]
  ): js.Array[typingsSlinky.typedoc.urlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typingsSlinky.typedoc.reflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: typingsSlinky.typedoc.reflectionsMod.Reflection): String = js.native
  def getUrl(
    reflection: typingsSlinky.typedoc.reflectionsMod.Reflection,
    relative: js.UndefOr[scala.Nothing],
    separator: String
  ): String = js.native
  def getUrl(
    reflection: typingsSlinky.typedoc.reflectionsMod.Reflection,
    relative: typingsSlinky.typedoc.reflectionsMod.Reflection
  ): String = js.native
  def getUrl(
    reflection: typingsSlinky.typedoc.reflectionsMod.Reflection,
    relative: typingsSlinky.typedoc.reflectionsMod.Reflection,
    separator: String
  ): String = js.native
  def toStyleClass(str: String): String = js.native
}

