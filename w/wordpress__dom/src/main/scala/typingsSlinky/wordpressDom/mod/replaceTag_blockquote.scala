package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.Node
import typingsSlinky.wordpressDom.wordpressDomStrings.blockquote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "replaceTag")
@js.native
object replaceTag_blockquote extends js.Object {
  def apply(node: Node, tagName: blockquote): HTMLQuoteElement = js.native
}

