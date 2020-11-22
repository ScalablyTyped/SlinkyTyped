package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ArrayBindingPattern
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ObjectBindingPattern
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBindingElement")
@js.native
object createBindingElement extends js.Object {
  
  /** @deprecated Use `factory.createBindingElement` or the factory supplied by your transformation context instead. */
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[
      String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier
    ],
    name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    initializer: js.UndefOr[Expression]
  ): BindingElement = js.native
}
