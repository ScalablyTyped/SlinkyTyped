package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.Statement because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _statementBrand
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined  */ @js.native
trait ClassDeclaration
  extends ClassLikeDeclarationBase
     with ClassLikeDeclaration {
  var _statementBrand: js.Any = js.native
  @JSName("kind")
  var kind_ClassDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}

