package typingsSlinky.wordpressElement.components

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressElement.anon.childrenstringPickDetaile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RawHTML {
  
  @JSImport("@wordpress/element", "RawHTML")
  @js.native
  object component extends js.Object
  
  def withProps(p: childrenstringPickDetaile): SharedBuilder_childrenstringPickDetaile209446344 = new SharedBuilder_childrenstringPickDetaile209446344(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: String with js.UndefOr[ReactElement]): SharedBuilder_childrenstringPickDetaile209446344 = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_childrenstringPickDetaile209446344(js.Array(this.component, __props.asInstanceOf[childrenstringPickDetaile]))
  }
}

object RawHtml {
  
  @JSImport("@wordpress/element/build-types/raw-html", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: childrenstringPickDetaile): SharedBuilder_childrenstringPickDetaile209446344 = new SharedBuilder_childrenstringPickDetaile209446344(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: String with js.UndefOr[ReactElement]): SharedBuilder_childrenstringPickDetaile209446344 = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_childrenstringPickDetaile209446344(js.Array(this.component, __props.asInstanceOf[childrenstringPickDetaile]))
  }
}
