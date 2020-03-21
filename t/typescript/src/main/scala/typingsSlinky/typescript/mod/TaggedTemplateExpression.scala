package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpression
  extends MemberExpression
     with CallLikeExpression
     with HasTypeArguments {
  @JSName("kind")
  var kind_TaggedTemplateExpression: typingsSlinky.typescript.mod.SyntaxKind.TaggedTemplateExpression = js.native
  var tag: LeftHandSideExpression = js.native
  var template: TemplateLiteral = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

