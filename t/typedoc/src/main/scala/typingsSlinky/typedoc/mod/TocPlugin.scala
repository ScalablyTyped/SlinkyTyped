package typingsSlinky.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin protected ()
  extends typingsSlinky.typedoc.outputPluginsMod.TocPlugin {
  def this(owner: js.Symbol) = this()
  def this(owner: typingsSlinky.typedoc.rendererMod.Renderer) = this()
}
/* static members */
object TocPlugin {
  
  @JSImport("typedoc", "TocPlugin.buildToc")
  @js.native
  def buildToc(
    model: typingsSlinky.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem
  ): Unit = js.native
  @JSImport("typedoc", "TocPlugin.buildToc")
  @js.native
  def buildToc(
    model: typingsSlinky.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsSlinky.typedoc.reflectionsMod.Reflection],
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}
