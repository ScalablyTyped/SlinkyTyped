package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait NumericLiteral
  extends LiteralExpression
     with DeclarationName
     with PropertyName {
  
  var _declarationBrand: js.Any = js.native
  
  @JSName("kind")
  var kind_NumericLiteral: typingsSlinky.typescript.mod.SyntaxKind.NumericLiteral = js.native
}
