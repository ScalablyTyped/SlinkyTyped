package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.CustomEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CustomEvent")
@js.native
class CustomEvent[T] protected ()
  extends typingsSlinky.std.CustomEvent[T] {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CustomEventInit[T]) = this()
}

@JSGlobal("CustomEvent")
@js.native
object CustomEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalajs.dom.raw.CustomEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CustomEventInit[js.Object], 
      org.scalajs.dom.raw.CustomEvent
    ]

