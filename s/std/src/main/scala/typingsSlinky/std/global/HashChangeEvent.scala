package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.HashChangeEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("HashChangeEvent")
@js.native
class HashChangeEvent protected ()
  extends typingsSlinky.std.HashChangeEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: HashChangeEventInit) = this()
}
@JSGlobal("HashChangeEvent")
@js.native
object HashChangeEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.HashChangeEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ HashChangeEventInit, 
      org.scalajs.dom.raw.HashChangeEvent
    ]
