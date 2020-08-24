package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getCommentRange")
@js.native
object getCommentRange extends js.Object {
  /**
    * Gets a custom text range to use when emitting comments.
    */
  def apply(node: Node): TextRange = js.native
}

