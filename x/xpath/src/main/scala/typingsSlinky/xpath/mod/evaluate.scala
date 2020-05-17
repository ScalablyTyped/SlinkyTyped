package typingsSlinky.xpath.mod

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.XPathResult
import typingsSlinky.std.XPathNSResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xpath", "evaluate")
@js.native
object evaluate extends js.Object {
  def apply(
    expression: String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
}

