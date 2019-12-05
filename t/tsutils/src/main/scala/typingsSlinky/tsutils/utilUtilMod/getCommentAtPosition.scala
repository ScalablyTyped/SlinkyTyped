package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.typescriptMod.CommentRange
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getCommentAtPosition")
@js.native
object getCommentAtPosition extends js.Object {
  def apply(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def apply(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
}

