package typingsSlinky.write.anon

import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: String): WriteStream = js.native
  def apply(path: PathLike, options: EmitClose): WriteStream = js.native
}
