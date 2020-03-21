package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block
  extends Statement
     with BlockLike {
  @JSName("kind")
  var kind_Block: typingsSlinky.typescript.mod.SyntaxKind.Block = js.native
  var statements: NodeArray[Statement] = js.native
}

