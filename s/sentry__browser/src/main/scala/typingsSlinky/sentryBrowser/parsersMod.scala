package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.tracekitMod.StackFrame
import typingsSlinky.sentryBrowser.tracekitMod.StackTrace
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.exceptionMod.Exception
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/parsers", JSImport.Namespace)
@js.native
object parsersMod extends js.Object {
  
  def eventFromPlainObject(exception: Record[String, _]): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.UndefOr[scala.Nothing], rejection: Boolean): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.Error): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.Error, rejection: Boolean): Event = js.native
  
  def eventFromStacktrace(stacktrace: StackTrace): Event = js.native
  
  def exceptionFromStacktrace(stacktrace: StackTrace): Exception = js.native
  
  def prepareFramesForEvent(stack: js.Array[StackFrame]): js.Array[typingsSlinky.sentryTypes.stackframeMod.StackFrame] = js.native
}
