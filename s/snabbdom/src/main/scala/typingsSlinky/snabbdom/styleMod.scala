package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.anon.Delayed
import typingsSlinky.snabbdom.moduleMod.Module
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/modules/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) with Delayed
}
