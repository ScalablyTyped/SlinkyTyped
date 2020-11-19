package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.JSDocTag because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined tagName, comment */ @js.native
trait JSDocTypedefTag
  extends NamedDeclaration
     with DeclarationWithTypeParameters {
  
  var comment: js.UndefOr[java.lang.String] = js.native
  
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  
  @JSName("kind")
  var kind_JSDocTypedefTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypedefTag = js.native
  
  @JSName("name")
  var name_JSDocTypedefTag: js.UndefOr[Identifier] = js.native
  
  @JSName("parent")
  var parent_JSDocTypedefTag: JSDoc = js.native
  
  var tagName: Identifier = js.native
  
  var typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral] = js.native
}
