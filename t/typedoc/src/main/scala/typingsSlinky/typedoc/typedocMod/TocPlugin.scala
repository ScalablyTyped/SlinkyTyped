package typingsSlinky.typedoc.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin ()
  extends typingsSlinky.typedoc.distLibOutputPluginsMod.TocPlugin

/* static members */
@JSImport("typedoc", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ): Unit = js.native
  def buildToc(
    model: typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.distLibModelsReflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

