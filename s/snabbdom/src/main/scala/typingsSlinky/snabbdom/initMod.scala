package typingsSlinky.snabbdom

import org.scalajs.dom.raw.Element
import typingsSlinky.snabbdom.anon.PartialModule
import typingsSlinky.snabbdom.htmldomapiMod.DOMAPI
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element, /* vnode */ VNode_, VNode_] = js.native
}
