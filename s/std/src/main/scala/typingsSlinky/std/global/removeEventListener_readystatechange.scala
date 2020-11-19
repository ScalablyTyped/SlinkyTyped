package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_readystatechange extends js.Object {
  
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
