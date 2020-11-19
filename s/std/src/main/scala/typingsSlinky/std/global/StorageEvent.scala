package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.StorageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("StorageEvent")
@js.native
class StorageEvent protected ()
  extends typingsSlinky.std.StorageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: StorageEventInit) = this()
}
@JSGlobal("StorageEvent")
@js.native
object StorageEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.StorageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ StorageEventInit, 
      org.scalajs.dom.raw.StorageEvent
    ]
