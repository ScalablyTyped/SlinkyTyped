package typingsSlinky.wordpressBlockEditor.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor", "InnerBlocks")
@js.native
object InnerBlocks extends js.Object {
  /**
    * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
    * default Block is inserted.
    */
  var ButtonBlockerAppender: ReactComponentClass[js.Object] = js.native
  var Content: ReactComponentClass[js.Object] = js.native
  /**
    * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
    * is the `paragraph` block.
    */
  var DefaultBlockAppender: ReactComponentClass[js.Object] = js.native
  def apply(props: Props): ReactElement = js.native
}

