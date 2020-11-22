package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocParameterTag
import typingsSlinky.typescript.mod.JSDocReturnTag
import typingsSlinky.typescript.mod.JSDocSignature
import typingsSlinky.typescript.mod.JSDocTemplateTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocSignature")
@js.native
object createJSDocSignature extends js.Object {
  
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  /** @deprecated Use `factory.createJSDocSignature` or the factory supplied by your transformation context instead. */
  def apply(typeParameters: js.Array[JSDocTemplateTag], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def apply(
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
}
