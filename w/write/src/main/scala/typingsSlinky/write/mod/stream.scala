package typingsSlinky.write.mod

import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write", "stream")
@js.native
object stream extends js.Object {
  
  def apply(filepath: String): WriteStream = js.native
  def apply(filepath: String, options: StreamOptions): WriteStream = js.native
}
