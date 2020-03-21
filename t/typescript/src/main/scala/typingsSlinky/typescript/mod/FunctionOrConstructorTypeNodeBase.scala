package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ConstructorType
import typingsSlinky.typescript.mod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait FunctionOrConstructorTypeNodeBase extends SignatureDeclarationBase {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_FunctionOrConstructorTypeNodeBase: FunctionType | ConstructorType = js.native
  @JSName("type")
  var type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}

