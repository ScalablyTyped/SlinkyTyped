package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocTypeTag
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocTypeTag")
@js.native
object getJSDocTypeTag extends js.Object {
  /** Gets the JSDoc type tag for the node if present and valid */
  def apply(node: Node): js.UndefOr[JSDocTypeTag] = js.native
}

