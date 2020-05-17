package typingsSlinky.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a method that indicates whether a protection service has completed successfully. */
@js.native
trait MediaProtectionServiceCompletion extends js.Object {
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  def complete(success: Boolean): Unit = js.native
}

object MediaProtectionServiceCompletion {
  @scala.inline
  def apply(complete: Boolean => Unit): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
  @scala.inline
  implicit class MediaProtectionServiceCompletionOps[Self <: MediaProtectionServiceCompletion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

