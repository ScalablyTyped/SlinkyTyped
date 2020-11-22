package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.JsxAttribute
import typingsSlinky.typescript.mod.JsxExpression
import typingsSlinky.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxAttribute")
@js.native
object createJsxAttribute extends js.Object {
  
  /** @deprecated Use `factory.createJsxAttribute` or the factory supplied by your transformation context instead. */
  def apply(name: Identifier): JsxAttribute = js.native
  def apply(name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def apply(name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
}
