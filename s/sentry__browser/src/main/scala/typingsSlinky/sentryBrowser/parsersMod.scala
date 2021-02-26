package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.tracekitMod.StackFrame
import typingsSlinky.sentryBrowser.tracekitMod.StackTrace
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.exceptionMod.Exception
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _]): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.UndefOr[scala.Nothing], rejection: Boolean): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.Error): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.Error, rejection: Boolean): Event = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "eventFromStacktrace")
  @js.native
  def eventFromStacktrace(stacktrace: StackTrace): Event = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "exceptionFromStacktrace")
  @js.native
  def exceptionFromStacktrace(stacktrace: StackTrace): Exception = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "prepareFramesForEvent")
  @js.native
  def prepareFramesForEvent(stack: js.Array[StackFrame]): js.Array[typingsSlinky.sentryTypes.stackframeMod.StackFrame] = js.native
}
