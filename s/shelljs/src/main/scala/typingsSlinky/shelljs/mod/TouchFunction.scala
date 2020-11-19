package typingsSlinky.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchFunction extends js.Object {
  
  def apply(files: String*): ShellString = js.native
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: TouchOptionsArray, files: String*): ShellString = js.native
  def apply(options: TouchOptionsArray, files: js.Array[String]): ShellString = js.native
  def apply(options: TouchOptionsLiteral, files: String*): ShellString = js.native
  def apply(options: TouchOptionsLiteral, files: js.Array[String]): ShellString = js.native
}
