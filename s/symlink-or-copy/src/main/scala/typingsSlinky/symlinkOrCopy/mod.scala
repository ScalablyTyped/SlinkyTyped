package typingsSlinky.symlinkOrCopy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symlink-or-copy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val canSymlink: Boolean = js.native
  
  val canSymlinkDirectory: Boolean = js.native
  
  val canSymlinkFile: Boolean = js.native
  
  def sync(srcPath: String, destPath: String): Unit = js.native
}
