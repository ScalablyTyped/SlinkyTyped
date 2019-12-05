package typingsSlinky.atWordpressElement.atWordpressElementMod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.react.reactMod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// ReactDOM re-exports
//
@JSImport("@wordpress/element", "createPortal")
@js.native
object createPortal extends js.Object {
  def apply(children: TagMod[Any], container: Element): ReactPortal = js.native
  def apply(children: TagMod[Any], container: Element, key: String): ReactPortal = js.native
}

