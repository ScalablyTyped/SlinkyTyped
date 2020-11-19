package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.MappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait MappedTypeNode
  extends TypeNode
     with HasType {
  
  var _declarationBrand: js.Any = js.native
  
  @JSName("kind")
  var kind_MappedTypeNode: MappedType = js.native
  
  var questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken] = js.native
  
  var readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken] = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
  
  var typeParameter: TypeParameterDeclaration = js.native
}
