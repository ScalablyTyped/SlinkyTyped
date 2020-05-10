package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand */ @js.native
trait DeclarationStatement extends NamedDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("name")
  var name_DeclarationStatement: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
}

