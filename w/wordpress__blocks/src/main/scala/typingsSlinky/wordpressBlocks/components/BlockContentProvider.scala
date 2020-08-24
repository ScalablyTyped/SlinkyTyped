package typingsSlinky.wordpressBlocks.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockContentProvider {
  @JSImport("@wordpress/blocks/block-content-provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

