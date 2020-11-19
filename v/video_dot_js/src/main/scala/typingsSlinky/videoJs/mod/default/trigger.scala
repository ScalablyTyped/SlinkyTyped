package typingsSlinky.videoJs.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "trigger")
@js.native
object trigger extends js.Object {
  
  def apply(elem: Element, event: String): js.UndefOr[Boolean] = js.native
  def apply(elem: Element, event: String, hash: js.Any): js.UndefOr[Boolean] = js.native
  /**
    * Trigger an event for an element
    *
    * @param elem
    *        Element to trigger an event on
    *
    * @param event
    *        A string (the type) or an event object with a type attribute
    *
    * @param [hash]
    *        data hash to pass along with the event
    *
    * @return    - Returns the opposite of `defaultPrevented` if default was prevented
    *         - Otherwise returns undefined
    */
  def apply(elem: Element, event: Event): js.UndefOr[Boolean] = js.native
  def apply(elem: Element, event: Event, hash: js.Any): js.UndefOr[Boolean] = js.native
}
