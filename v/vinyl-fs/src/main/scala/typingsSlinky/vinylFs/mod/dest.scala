package typingsSlinky.vinylFs.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", "dest")
@js.native
object dest extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
}

