package typingsSlinky.serveHandler.anon

import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): ReadStream = js.native
}
