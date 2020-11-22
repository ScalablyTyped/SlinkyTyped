package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.JSDocTypeExpression
import typingsSlinky.typescript.mod.JSDocTypeTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocTypeTag")
@js.native
object createJSDocTypeTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocTypeTag = js.native
  /** @deprecated Use `factory.createJSDocTypeTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocTypeTag = js.native
}
