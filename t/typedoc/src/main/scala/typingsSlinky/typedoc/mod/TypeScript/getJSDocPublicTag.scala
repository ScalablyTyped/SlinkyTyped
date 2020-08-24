package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocPublicTag
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocPublicTag")
@js.native
object getJSDocPublicTag extends js.Object {
  /** Gets the JSDoc public tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocPublicTag] = js.native
}

