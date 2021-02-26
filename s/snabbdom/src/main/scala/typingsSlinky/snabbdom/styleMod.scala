package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.anon.Delayed
import typingsSlinky.snabbdom.moduleMod.Module
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("snabbdom/build/package/modules/style", "styleModule")
  @js.native
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) with Delayed
}
