package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocSignature
  extends JSDocType
     with DeclarationWithTypeParameters {
  
  var _declarationBrand: js.Any = js.native
  
  @JSName("kind")
  var kind_JSDocSignature: typingsSlinky.typescript.mod.SyntaxKind.JSDocSignature = js.native
  
  var parameters: js.Array[JSDocParameterTag] = js.native
  
  var `type`: js.UndefOr[JSDocReturnTag] = js.native
  
  var typeParameters: js.UndefOr[js.Array[JSDocTemplateTag]] = js.native
}
