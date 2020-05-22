package typingsSlinky.wordpressBlocks.blockContentProviderMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.BlockContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/block-content-provider", "withBlockContentContext")
@js.native
object withBlockContentContext extends js.Object {
  def apply[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, BlockContent]] = js.native
}

