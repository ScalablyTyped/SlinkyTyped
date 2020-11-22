package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.JSDocUnknownTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocTag")
@js.native
object createJSDocTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocUnknownTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier): JSDocUnknownTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocUnknownTag = js.native
}
