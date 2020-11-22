package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTypeLiteral extends JSDocType {
  
  /** If true, then this type literal represents an *array* of its type. */
  val isArrayType: Boolean = js.native
  
  val jsDocPropertyTags: js.UndefOr[js.Array[JSDocPropertyLikeTag]] = js.native
  
  @JSName("kind")
  val kind_JSDocTypeLiteral: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypeLiteral = js.native
}
