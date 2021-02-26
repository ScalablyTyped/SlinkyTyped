package typingsSlinky.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EchoFunction extends StObject {
  
  /**
    * Prints string to stdout, and returns string with additional utility methods like .to().
    *
    * @param options Available options:
    *        - `-e`: interpret backslash escapes (default)
    *        - `-n`: remove trailing newline from output
    * @param text The text to print.
    * @return     Returns the string that was passed as argument.
    */
  def apply(options: String, text: String*): typingsSlinky.shelljs.mod.ShellString = js.native
  /**
    * Prints string to stdout, and returns string with additional utility methods like .to().
    *
    * @param text The text to print.
    * @return     Returns the string that was passed as argument.
    */
  def apply(text: String*): typingsSlinky.shelljs.mod.ShellString = js.native
}
