package typingsSlinky.virtualDom.VirtualDOM

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.virtualDom.VirtualDOM.VText
  - typingsSlinky.virtualDom.VirtualDOM.VNode
  - typingsSlinky.virtualDom.VirtualDOM.Widget
  - typingsSlinky.virtualDom.VirtualDOM.Thunk
*/
trait VTree extends js.Object
object VTree {
  
  @scala.inline
  def VText(text: String, `type`: String, version: String): VTree = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
  
  @scala.inline
  def VNode(
    children: js.Array[VTree],
    count: Double,
    descendantHooks: js.Array[_],
    hasThunks: Boolean,
    hasWidgets: Boolean,
    hooks: js.Array[_],
    properties: VProperties,
    tagName: String,
    `type`: String,
    version: String
  ): VTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
  
  @scala.inline
  def Widget(
    destroy: Element => Unit,
    init: () => Element,
    `type`: String,
    update: (typingsSlinky.virtualDom.VirtualDOM.Widget, Element) => Unit
  ): VTree = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
  
  @scala.inline
  def Thunk(render: VTree => VTree, `type`: String, vnode: VTree): VTree = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
}
