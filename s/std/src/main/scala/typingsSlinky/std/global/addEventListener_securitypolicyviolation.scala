package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.securitypolicyviolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_securitypolicyviolation extends js.Object {
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsSlinky.std.SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

