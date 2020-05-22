package typingsSlinky.wonka

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/shims/Dom.shim", JSImport.Namespace)
@js.native
object domShimMod extends js.Object {
  type element = HTMLElement
  type event = Event
}

