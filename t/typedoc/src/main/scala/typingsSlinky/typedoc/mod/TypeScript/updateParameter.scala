package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ArrayBindingPattern
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ObjectBindingPattern
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateParameter")
@js.native
object updateParameter extends js.Object {
  
  /** @deprecated Use `factory.updateParameterDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}
