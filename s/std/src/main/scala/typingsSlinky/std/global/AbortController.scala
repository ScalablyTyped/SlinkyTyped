package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AbortController")
@js.native
class AbortController ()
  extends typingsSlinky.std.AbortController {
  /**
    * Returns the AbortSignal object associated with this object.
    */
  /* CompleteClass */
  override val signal: org.scalajs.dom.experimental.AbortSignal = js.native
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
}

@JSGlobal("AbortController")
@js.native
object AbortController
  extends Instantiable0[org.scalajs.dom.experimental.AbortController]

