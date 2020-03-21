package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typingsSlinky.typescript.mod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, name, parent, pos. Inlined 
- typingsSlinky.typescript.mod.ClassLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name, typeParameters, heritageClauses, members */ @js.native
trait ClassExpression
  extends PrimaryExpression
     with ClassLikeDeclaration
     with JSDocContainer {
  var _declarationBrand: js.Any = js.native
  var heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  @JSName("kind")
  var kind_ClassExpression: typingsSlinky.typescript.mod.SyntaxKind.ClassExpression = js.native
  var members: NodeArray[ClassElement] = js.native
  var name: js.UndefOr[Identifier] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

