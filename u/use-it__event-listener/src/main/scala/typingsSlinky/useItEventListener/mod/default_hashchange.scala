package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.hashchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_hashchange extends js.Object {
  
  def apply(eventName: hashchange, handler: HashChangeEvent): Unit = js.native
  def apply(
    eventName: hashchange,
    handler: HashChangeEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: hashchange, handler: HashChangeEvent, element: Window): Unit = js.native
  def apply(eventName: hashchange, handler: HashChangeEvent, element: Window, options: Options): Unit = js.native
}
