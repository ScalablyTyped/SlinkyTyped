package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.useItEventListener.useItEventListenerStrings.securitypolicyviolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_securitypolicyviolation extends js.Object {
  
  def apply(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Document): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Document,
    options: Options
  ): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Window): Unit = js.native
  def apply(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Window,
    options: Options
  ): Unit = js.native
}
