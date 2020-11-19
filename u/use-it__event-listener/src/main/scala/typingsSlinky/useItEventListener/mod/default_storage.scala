package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_storage extends js.Object {
  
  def apply(eventName: storage, handler: StorageEvent): Unit = js.native
  def apply(eventName: storage, handler: StorageEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(eventName: storage, handler: StorageEvent, element: Window): Unit = js.native
  def apply(eventName: storage, handler: StorageEvent, element: Window, options: Options): Unit = js.native
}
