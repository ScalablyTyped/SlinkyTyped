package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.ExclamationToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.PropertyDeclaration
import typingsSlinky.typescript.mod.PropertyName
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateProperty")
@js.native
object updateProperty extends js.Object {
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
}

