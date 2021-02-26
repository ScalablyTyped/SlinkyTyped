package typingsSlinky.zeroclipboard

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import typingsSlinky.zeroclipboard.ZC.List
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardClient
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AMD and CommonJS module `zeroclipboard`
  * @module
  */
object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("zeroclipboard", JSImport.Namespace)
  @js.native
  class ^ () extends ZeroClipboardClient {
    def this(elements: Element) = this()
    def this(elements: List[Element]) = this()
  }
  @JSImport("zeroclipboard", JSImport.Namespace)
  @js.native
  val ^ : ZeroClipboardStatic = js.native
  
  type _To = ZeroClipboardStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ZeroClipboardStatic = ^
}
