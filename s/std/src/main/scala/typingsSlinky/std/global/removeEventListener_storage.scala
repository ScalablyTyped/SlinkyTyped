package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_storage extends js.Object {
  
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.StorageEvent, _]
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
