package typingsSlinky.wordpressBlockEditor.componentsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.anon.Children
import typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerBlocks {
  
  @JSImport("@wordpress/block-editor/components", "InnerBlocks")
  @js.native
  def apply(props: Props): ReactElement = js.native
  @JSImport("@wordpress/block-editor/components", "InnerBlocks")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
    * default Block is inserted.
    */
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.ButtonBlockerAppender")
  @js.native
  def ButtonBlockerAppender: ReactComponentClass[Children] = js.native
  @scala.inline
  def ButtonBlockerAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockerAppender")(x.asInstanceOf[js.Any])
  
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.Content")
  @js.native
  def Content: ReactComponentClass[Children] = js.native
  @scala.inline
  def Content_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /**
    * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
    * is the `paragraph` block.
    */
  @JSImport("@wordpress/block-editor/components", "InnerBlocks.DefaultBlockAppender")
  @js.native
  def DefaultBlockAppender: ReactComponentClass[Children] = js.native
  @scala.inline
  def DefaultBlockAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
}
