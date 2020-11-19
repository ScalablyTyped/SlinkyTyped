package typingsSlinky.terminalKit.terminalMod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("terminal-kit/Terminal", "AutocompletionArray")
@js.native
class AutocompletionArray[T] () extends Array[T] {
  
  var postfix: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
