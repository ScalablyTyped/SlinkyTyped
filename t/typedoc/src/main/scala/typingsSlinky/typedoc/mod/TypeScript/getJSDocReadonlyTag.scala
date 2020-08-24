package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.JSDocReadonlyTag
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocReadonlyTag")
@js.native
object getJSDocReadonlyTag extends js.Object {
  /** Gets the JSDoc protected tag for the node if present */
  def apply(node: Node): js.UndefOr[JSDocReadonlyTag] = js.native
}

