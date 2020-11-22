package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.WeakRefConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WeakRef")
@js.native
/**
  * Creates a WeakRef instance for the given target object.
  * @param target The target object for the WeakRef instance.
  */
class WeakRef[T /* <: js.Object */] ()
  extends typingsSlinky.std.WeakRef[T] {
  def this(target: T) = this()
}
@JSGlobal("WeakRef")
@js.native
object WeakRef extends TopLevel[WeakRefConstructor]
