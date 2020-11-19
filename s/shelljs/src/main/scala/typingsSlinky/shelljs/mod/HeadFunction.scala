package typingsSlinky.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadFunction extends js.Object {
  
  def apply(files: String*): ShellString = js.native
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: HeadOptions, files: String*): ShellString = js.native
  def apply(options: HeadOptions, files: js.Array[String]): ShellString = js.native
}
