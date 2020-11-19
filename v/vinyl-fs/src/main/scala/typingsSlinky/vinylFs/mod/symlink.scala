package typingsSlinky.vinylFs.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import typingsSlinky.vinylFs.anon.Cwd
import typingsSlinky.vinylFs.anon.DirMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vinyl-fs", "symlink")
@js.native
object symlink extends js.Object {
  
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opts: Cwd): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String], opts: DirMode): ReadWriteStream = js.native
}
