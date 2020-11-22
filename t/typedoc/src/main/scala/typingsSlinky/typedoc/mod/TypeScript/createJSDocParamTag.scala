package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.EntityName
import typingsSlinky.typescript.mod.JSDocParameterTag
import typingsSlinky.typescript.mod.JSDocTypeExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocParamTag")
@js.native
object createJSDocParamTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocParameterTag` or the factory supplied by your transformation context instead. */
  def apply(name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def apply(name: EntityName, isBracketed: Boolean, typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocParameterTag = js.native
  def apply(name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
  def apply(name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression, comment: String): JSDocParameterTag = js.native
}
