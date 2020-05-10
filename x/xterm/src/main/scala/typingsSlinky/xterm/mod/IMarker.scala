package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarker extends IDisposable {
  /**
    * A unique identifier for this marker.
    */
  val id: Double = js.native
  /**
    * Whether this marker is disposed.
    */
  val isDisposed: Boolean = js.native
  /**
    * The actual line index in the buffer at this point in time. This is set to
    * -1 if the marker has been disposed.
    */
  val line: Double = js.native
}

object IMarker {
  @scala.inline
  def apply(dispose: () => Unit, id: Double, isDisposed: Boolean, line: Double): IMarker = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
  @scala.inline
  implicit class IMarkerOps[Self <: IMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

