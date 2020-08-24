package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocClassTag
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocClassTag")
@js.native
object getJSDocClassTag extends js.Object {
  /** Gets the JSDoc class tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocClassTag] = js.native
}

