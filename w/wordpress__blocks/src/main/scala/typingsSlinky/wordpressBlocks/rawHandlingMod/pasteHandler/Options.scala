package typingsSlinky.wordpressBlocks.rawHandlingMod.pasteHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions
  - typingsSlinky.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def HTMLOptions(HTML: String): Options = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def PlainTextOptions(plainText: String): Options = {
    val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
