package typingsSlinky.tabris.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.tabris.ProgressEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends typingsSlinky.tabris.ProgressEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: ProgressEventInit) = this()
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[/* type */ String, typingsSlinky.tabris.ProgressEvent]
     with Instantiable2[
      /* type */ String, 
      /* eventInitDict */ ProgressEventInit, 
      typingsSlinky.tabris.ProgressEvent
    ]

