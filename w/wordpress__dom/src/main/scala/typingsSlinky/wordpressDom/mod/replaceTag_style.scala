package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.Node
import typingsSlinky.wordpressDom.wordpressDomStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "replaceTag")
@js.native
object replaceTag_style extends js.Object {
  def apply(node: Node, tagName: style): HTMLStyleElement = js.native
}

