package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TemplateMiddle
import typingsSlinky.typescript.mod.TemplateSpan
import typingsSlinky.typescript.mod.TemplateTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTemplateSpan")
@js.native
object createTemplateSpan extends js.Object {
  
  /** @deprecated Use `factory.createTemplateSpan` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def apply(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
}
