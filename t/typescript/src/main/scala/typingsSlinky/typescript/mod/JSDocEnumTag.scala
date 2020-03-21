package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocEnumTag extends JSDocTag {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocEnumTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocEnumTag = js.native
  @JSName("parent")
  var parent_JSDocEnumTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}

