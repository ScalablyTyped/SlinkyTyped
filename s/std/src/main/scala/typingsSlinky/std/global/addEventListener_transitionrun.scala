package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.transitionrun
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionrun extends js.Object {
  
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
