package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachTokenWithTrivia")
@js.native
object forEachTokenWithTrivia extends js.Object {
  def apply(node: Node, cb: ForEachTokenCallback): Unit = js.native
  def apply(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = js.native
}

