package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.MouseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MouseEvent")
@js.native
class MouseEvent protected ()
  extends typingsSlinky.std.MouseEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MouseEventInit) = this()
}
@JSGlobal("MouseEvent")
@js.native
object MouseEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalajs.dom.raw.MouseEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MouseEventInit, 
      org.scalajs.dom.raw.MouseEvent
    ]
