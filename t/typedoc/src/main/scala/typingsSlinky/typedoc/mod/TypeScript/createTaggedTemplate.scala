package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TaggedTemplateExpression
import typingsSlinky.typescript.mod.TemplateLiteral
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTaggedTemplate")
@js.native
object createTaggedTemplate extends js.Object {
  
  /** @deprecated Use `factory.createTaggedTemplate` or the factory supplied by your transformation context instead. */
  def apply(tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(tag: Expression, typeArguments: js.UndefOr[scala.Nothing], template: TemplateLiteral): TaggedTemplateExpression = js.native
  /** @deprecated Use `factory.createTaggedTemplate` or the factory supplied by your transformation context instead. */
  def apply(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
}
