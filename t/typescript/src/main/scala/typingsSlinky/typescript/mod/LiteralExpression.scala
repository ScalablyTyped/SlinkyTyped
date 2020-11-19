package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.LiteralLikeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined text, isUnterminated, hasExtendedUnicodeEscape */ @js.native
trait LiteralExpression extends PrimaryExpression {
  
  var _literalExpressionBrand: js.Any = js.native
  
  var hasExtendedUnicodeEscape: js.UndefOr[Boolean] = js.native
  
  var isUnterminated: js.UndefOr[Boolean] = js.native
  
  var text: java.lang.String = js.native
}
