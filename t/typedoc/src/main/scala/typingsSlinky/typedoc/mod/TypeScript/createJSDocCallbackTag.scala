package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.JSDocCallbackTag
import typingsSlinky.typescript.mod.JSDocNamespaceDeclaration
import typingsSlinky.typescript.mod.JSDocSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocCallbackTag")
@js.native
object createJSDocCallbackTag extends js.Object {
  
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def apply(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: String
  ): JSDocCallbackTag = js.native
  /** @deprecated Use `factory.createJSDocCallbackTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def apply(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: String
  ): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier, comment: String): JSDocCallbackTag = js.native
  def apply(tagName: Identifier, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
  def apply(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: String
  ): JSDocCallbackTag = js.native
}
