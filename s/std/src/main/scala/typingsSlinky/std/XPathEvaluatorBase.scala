package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathEvaluatorBase extends js.Object {
  def createExpression(expression: java.lang.String): XPathExpression = js.native
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  def createNSResolver(nodeResolver: org.scalajs.dom.raw.Node): XPathNSResolver = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.raw.Node): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: js.UndefOr[XPathNSResolver],
    `type`: js.UndefOr[scala.Nothing],
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: js.UndefOr[XPathNSResolver],
    `type`: Double
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: js.UndefOr[XPathNSResolver],
    `type`: Double,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: js.UndefOr[scala.Nothing],
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: Double
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: org.scalajs.dom.raw.Node,
    resolver: Null,
    `type`: Double,
    result: org.scalajs.dom.raw.XPathResult
  ): org.scalajs.dom.raw.XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: org.scalajs.dom.raw.Node, resolver: XPathNSResolver): org.scalajs.dom.raw.XPathResult = js.native
}

