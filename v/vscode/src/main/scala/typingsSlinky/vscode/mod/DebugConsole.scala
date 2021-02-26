package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugConsole extends StObject {
  
  /**
    * Append the given value to the debug console.
    *
    * @param value A string, falsy values will not be printed.
    */
  def append(value: String): Unit = js.native
  
  /**
    * Append the given value and a line feed character
    * to the debug console.
    *
    * @param value A string, falsy values will be printed.
    */
  def appendLine(value: String): Unit = js.native
}
object DebugConsole {
  
  @scala.inline
  def apply(append: String => Unit, appendLine: String => Unit): DebugConsole = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendLine = js.Any.fromFunction1(appendLine))
    __obj.asInstanceOf[DebugConsole]
  }
  
  @scala.inline
  implicit class DebugConsoleMutableBuilder[Self <: DebugConsole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendLine(value: String => Unit): Self = StObject.set(x, "appendLine", js.Any.fromFunction1(value))
  }
}
