package typingsSlinky.typescript.typescriptMod

import typingsSlinky.typescript.typescriptMod.SyntaxKind.ConstructorType
import typingsSlinky.typescript.typescriptMod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait FunctionOrConstructorTypeNodeBase extends SignatureDeclarationBase {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_FunctionOrConstructorTypeNodeBase: FunctionType | ConstructorType = js.native
  @JSName("type")
  var type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}

