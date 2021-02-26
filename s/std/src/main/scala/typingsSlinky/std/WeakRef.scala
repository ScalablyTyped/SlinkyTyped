package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakRef[T /* <: js.Object */] extends StObject {
  
  /**
    * Returns the WeakRef instance's target object, or undefined if the target object has been
    * reclaimed.
    */
  def deref(): js.UndefOr[T] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typingsSlinky.std.stdStrings.WeakRef = js.native
}
