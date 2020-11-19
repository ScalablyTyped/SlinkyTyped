package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocPropertyLikeTag extends JSDocTag {
  
  var _declarationBrand: js.Any = js.native
  
  var isBracketed: Boolean = js.native
  
  /** Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like */
  var isNameFirst: Boolean = js.native
  
  var name: EntityName = js.native
  
  @JSName("parent")
  var parent_JSDocPropertyLikeTag: JSDoc = js.native
  
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}
