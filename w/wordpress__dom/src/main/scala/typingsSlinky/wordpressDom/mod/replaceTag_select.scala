package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.Node
import typingsSlinky.wordpressDom.wordpressDomStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "replaceTag")
@js.native
object replaceTag_select extends js.Object {
  def apply(node: Node, tagName: select): HTMLSelectElement = js.native
}

