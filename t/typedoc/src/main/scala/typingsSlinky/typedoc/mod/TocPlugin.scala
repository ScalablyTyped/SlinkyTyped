package typingsSlinky.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin ()
  extends typingsSlinky.typedoc.outputPluginsMod.TocPlugin

/* static members */
@JSImport("typedoc", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typingsSlinky.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem
  ): Unit = js.native
  def buildToc(
    model: typingsSlinky.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

