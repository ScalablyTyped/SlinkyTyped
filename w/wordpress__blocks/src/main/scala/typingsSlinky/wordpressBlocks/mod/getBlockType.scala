package typingsSlinky.wordpressBlocks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getBlockType")
@js.native
object getBlockType extends js.Object {
  
  def apply[T](): js.UndefOr[Block[T]] = js.native
  def apply[T](name: String): js.UndefOr[Block[T]] = js.native
}
