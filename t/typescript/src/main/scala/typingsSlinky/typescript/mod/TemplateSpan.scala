package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSpan extends Node {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_TemplateSpan: typingsSlinky.typescript.mod.SyntaxKind.TemplateSpan = js.native
  var literal: TemplateMiddle | TemplateTail = js.native
  @JSName("parent")
  var parent_TemplateSpan: TemplateExpression = js.native
}

