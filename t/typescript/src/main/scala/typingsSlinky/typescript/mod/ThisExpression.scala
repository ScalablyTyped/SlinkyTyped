package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ThisKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typingsSlinky.typescript.mod.KeywordTypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined  */ @js.native
trait ThisExpression
  extends PrimaryExpression
     with JsxTagNameExpression {
  
  var _typeNodeBrand: js.Any = js.native
  
  @JSName("kind")
  var kind_ThisExpression: ThisKeyword = js.native
}
