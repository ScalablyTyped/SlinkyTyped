package typingsSlinky.shelljs.mod

import typingsSlinky.shelljs.shelljsStrings.PlussignN
import typingsSlinky.shelljs.shelljsStrings.`-N`
import typingsSlinky.shelljs.shelljsStrings.`-c`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirsFunction extends StObject {
  
  /**
    * Displays the list of currently remembered directories.
    *
    * @param options Available options:
    *        - `-c`: Clears the directory stack by deleting all of the elements.
    *        - `-N`: Displays the Nth directory (counting from the right of the list
    *                printed by dirs when invoked without options), starting with zero.
    *        - `+N`: Displays the Nth directory (counting from the left of the list
    *                printed by dirs when invoked without options), starting with zero.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  def apply(options: String): ShellArray | typingsSlinky.shelljs.mod.ShellString = js.native
  /**
    * Displays the list of currently remembered directories.
    *
    * @param options Displays the Nth directory (counting from the left of the list
    *                printed by dirs when invoked without options), starting with zero.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  def apply(options: PlussignN): typingsSlinky.shelljs.mod.ShellString = js.native
  /**
    * Displays the list of currently remembered directories.
    *
    * @param options Displays the Nth directory (counting from the right of the list
    *                printed by dirs when invoked without options), starting with zero.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  def apply(options: `-N`): typingsSlinky.shelljs.mod.ShellString = js.native
  /**
    * Clears the directory stack by deleting all of the elements.
    *
    * @param options Clears the directory stack by deleting all of the elements.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  def apply(options: `-c`): ShellArray = js.native
}
