package typingsSlinky.std.global

import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Window
import typingsSlinky.std.stdStrings.securitypolicyviolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_securitypolicyviolation extends js.Object {
  
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
    options: EventListenerOptions
  ): Unit = js.native
}
