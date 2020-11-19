package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.JSDocTag because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined tagName, comment */ @js.native
trait JSDocCallbackTag
  extends NamedDeclaration
     with DeclarationWithTypeParameters {
  
  var comment: js.UndefOr[java.lang.String] = js.native
  
  var fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  
  @JSName("kind")
  var kind_JSDocCallbackTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocCallbackTag = js.native
  
  @JSName("name")
  var name_JSDocCallbackTag: js.UndefOr[Identifier] = js.native
  
  @JSName("parent")
  var parent_JSDocCallbackTag: JSDoc = js.native
  
  var tagName: Identifier = js.native
  
  var typeExpression: JSDocSignature = js.native
}
