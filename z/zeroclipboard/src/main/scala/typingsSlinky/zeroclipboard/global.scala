package typingsSlinky.zeroclipboard

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsSlinky.zeroclipboard.ZC.List
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardClient
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class ZeroClipboard () extends ZeroClipboardClient {
    def this(elements: Element) = this()
    def this(elements: List[Element]) = this()
  }
  
  /**
    * [ZeroClipboard description]
    * @type {ZC.ZeroClipboardStatic}
    */
  @js.native
  object ZeroClipboard extends TopLevel[ZeroClipboardStatic]
  
}

