package typingsSlinky.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exception extends Shortcut {
  
  @JSImport("sjcl", "exception")
  @js.native
  val ^ : SjclExceptions = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "exception.bug")
  @js.native
  class bug protected () extends Error {
    def this(message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "exception.corrupt")
  @js.native
  class corrupt protected () extends Error {
    def this(message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "exception.invalid")
  @js.native
  class invalid protected () extends Error {
    def this(message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "exception.notReady")
  @js.native
  class notReady protected () extends Error {
    def this(message: String) = this()
  }
  
  type _To = SjclExceptions
  
  /* This means you don't have to write `^`, but can instead just say `exception.foo` */
  override def _to: SjclExceptions = ^
}
