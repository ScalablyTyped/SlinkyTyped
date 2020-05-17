package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typingsSlinky.typescript.mod.JSDocType because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _jsDocTypeBrand */ @js.native
trait JSDocFunctionType
  extends SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  var _jsDocTypeBrand: js.Any = js.native
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocFunctionType: typingsSlinky.typescript.mod.SyntaxKind.JSDocFunctionType = js.native
}

