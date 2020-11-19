package typingsSlinky.videoJs.videoCoreNovttMod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.videoJs.mod.videojs.EventTarget.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "on")
@js.native
object on extends js.Object {
  
  /**
    * Add an event listener to element
    * It stores the handler function in a separate cache object
    * and adds a generic handler to the element's event,
    * along with a unique id (guid) to the element.
    *
    * @param elem
    *        Element or object to bind listeners to
    *
    * @param type
    *        Type of event to bind to.
    *
    * @param fn
    *        Event listener.
    */
  def apply(elem: Element, `type`: String, fn: EventListener): Unit = js.native
  def apply(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = js.native
}
