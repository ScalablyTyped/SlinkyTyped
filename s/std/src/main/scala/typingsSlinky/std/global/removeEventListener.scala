package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener extends js.Object {
  
  def apply(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def apply(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def apply(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}
