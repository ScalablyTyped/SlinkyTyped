package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree. */
@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: org.scalajs.dom.raw.Node): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(contextNode: org.scalajs.dom.raw.Node, `type`: Double): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(contextNode: org.scalajs.dom.raw.Node, `type`: Double, result: org.scalajs.dom.raw.XPathResult): org.scalajs.dom.raw.XPathResult = js.native
}

@JSGlobal("XPathExpression")
@js.native
object XPathExpression extends Instantiable0[XPathExpression]

