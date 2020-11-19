package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait StringLiteral
  extends LiteralExpression
     with ModuleName
     with PropertyName
     with StringLiteralLike {
  
  var _declarationBrand: js.Any = js.native
  
  @JSName("kind")
  var kind_StringLiteral: typingsSlinky.typescript.mod.SyntaxKind.StringLiteral = js.native
}
