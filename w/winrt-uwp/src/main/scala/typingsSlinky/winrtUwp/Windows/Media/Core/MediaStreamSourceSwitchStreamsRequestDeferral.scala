package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed the MediaStreamSource.SwitchStreamsRequested event. */
@js.native
trait MediaStreamSourceSwitchStreamsRequestDeferral extends js.Object {
  /** Reports that the application has completed processing the MediaStreamSource.SwitchStreamsRequested event. */
  def complete(): Unit = js.native
}

object MediaStreamSourceSwitchStreamsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSwitchStreamsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestDeferral]
  }
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestDeferralOps[Self <: MediaStreamSourceSwitchStreamsRequestDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

