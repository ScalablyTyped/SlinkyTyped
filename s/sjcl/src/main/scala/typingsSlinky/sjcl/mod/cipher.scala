package typingsSlinky.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipher extends Shortcut {
  
  @JSImport("sjcl", "cipher")
  @js.native
  val ^ : SjclCiphers = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "cipher.aes")
  @js.native
  class aes protected () extends SjclCipher {
    def this(key: js.Array[Double]) = this()
  }
  
  type _To = SjclCiphers
  
  /* This means you don't have to write `^`, but can instead just say `cipher.foo` */
  override def _to: SjclCiphers = ^
}
