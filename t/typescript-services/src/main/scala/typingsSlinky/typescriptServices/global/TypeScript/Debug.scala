package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Debug")
@js.native
class Debug ()
  extends typingsSlinky.typescriptServices.TypeScript.Debug
/* static members */
@JSGlobal("TypeScript.Debug")
@js.native
object Debug extends js.Object {
  
  def assert(expression: js.Any): Unit = js.native
  def assert(expression: js.Any, message: js.UndefOr[scala.Nothing], verboseDebugInfo: js.Function0[String]): Unit = js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  def assert(expression: js.Any, message: String, verboseDebugInfo: js.Function0[String]): Unit = js.native
  
  var currentAssertionLevel: js.Any = js.native
  
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  
  def shouldAssert(level: typingsSlinky.typescriptServices.TypeScript.AssertionLevel): Boolean = js.native
}
