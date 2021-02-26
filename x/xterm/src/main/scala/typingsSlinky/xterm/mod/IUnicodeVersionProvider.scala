package typingsSlinky.xterm.mod

import typingsSlinky.xterm.xtermNumbers.`0`
import typingsSlinky.xterm.xtermNumbers.`1`
import typingsSlinky.xterm.xtermNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUnicodeVersionProvider extends StObject {
  
  /**
    * String indicating the Unicode version provided.
    */
  val version: String = js.native
  
  /**
    * Unicode version dependent wcwidth implementation.
    */
  def wcwidth(codepoint: Double): `0` | `1` | `2` = js.native
}
object IUnicodeVersionProvider {
  
  @scala.inline
  def apply(version: String, wcwidth: Double => `0` | `1` | `2`): IUnicodeVersionProvider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], wcwidth = js.Any.fromFunction1(wcwidth))
    __obj.asInstanceOf[IUnicodeVersionProvider]
  }
  
  @scala.inline
  implicit class IUnicodeVersionProviderMutableBuilder[Self <: IUnicodeVersionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWcwidth(value: Double => `0` | `1` | `2`): Self = StObject.set(x, "wcwidth", js.Any.fromFunction1(value))
  }
}
