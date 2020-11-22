package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.MessageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MessageEvent")
@js.native
class MessageEvent[T] protected ()
  extends typingsSlinky.std.MessageEvent[T] {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MessageEventInit[T]) = this()
}
@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.MessageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MessageEventInit[js.Object], 
      org.scalajs.dom.raw.MessageEvent
    ]
