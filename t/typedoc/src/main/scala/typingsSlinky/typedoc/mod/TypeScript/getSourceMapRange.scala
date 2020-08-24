package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceMapRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getSourceMapRange")
@js.native
object getSourceMapRange extends js.Object {
  /**
    * Gets a custom text range to use when emitting source maps.
    */
  def apply(node: Node): SourceMapRange = js.native
}

