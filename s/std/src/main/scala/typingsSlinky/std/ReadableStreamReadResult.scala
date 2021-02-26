package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`false`
import typingsSlinky.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ReadableStreamReadValueResult[T]
  - typingsSlinky.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  @scala.inline
  def ReadableStreamReadDoneResult[T](done: `true`): typingsSlinky.std.ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.ReadableStreamReadDoneResult[T]]
  }
  
  @scala.inline
  def ReadableStreamReadValueResult[T](done: `false`, value: T): typingsSlinky.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.ReadableStreamReadValueResult[T]]
  }
}
