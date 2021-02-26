package typingsSlinky.wordpressBlocks.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockContentProvider {
  
  @scala.inline
  def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/blocks/block-content-provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
