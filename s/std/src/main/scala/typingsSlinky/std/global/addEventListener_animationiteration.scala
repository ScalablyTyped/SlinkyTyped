package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.animationiteration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addEventListener")
@js.native
object addEventListener_animationiteration extends js.Object {
  
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
