package typingsSlinky.typedoc.mod

import typingsSlinky.typedoc.anon.Area
import typingsSlinky.typedoc.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "PrettyPrintPlugin")
@js.native
class PrettyPrintPlugin protected ()
  extends typingsSlinky.typedoc.outputPluginsMod.PrettyPrintPlugin {
  def this(owner: js.Symbol) = this()
  def this(owner: typingsSlinky.typedoc.rendererMod.Renderer) = this()
}
/* static members */
object PrettyPrintPlugin {
  
  @JSImport("typedoc", "PrettyPrintPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc", "PrettyPrintPlugin.IGNORED_TAGS")
  @js.native
  def IGNORED_TAGS: Area = js.native
  @scala.inline
  def IGNORED_TAGS_=(x: Area): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORED_TAGS")(x.asInstanceOf[js.Any])
  
  @JSImport("typedoc", "PrettyPrintPlugin.PRE_TAGS")
  @js.native
  def PRE_TAGS: Code = js.native
  @scala.inline
  def PRE_TAGS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRE_TAGS")(x.asInstanceOf[js.Any])
}
