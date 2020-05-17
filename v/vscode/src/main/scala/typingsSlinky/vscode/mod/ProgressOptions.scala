package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.ViewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressOptions extends js.Object {
  /**
  		 * Controls if a cancel button should show to allow the user to
  		 * cancel the long running operation.  Note that currently only
  		 * `ProgressLocation.Notification` is supporting to show a cancel
  		 * button.
  		 */
  var cancellable: js.UndefOr[Boolean] = js.native
  /**
  		 * The location at which progress should show.
  		 */
  var location: ProgressLocation | ViewId = js.native
  /**
  		 * A human-readable string which will be used to describe the
  		 * operation.
  		 */
  var title: js.UndefOr[String] = js.native
}

object ProgressOptions {
  @scala.inline
  def apply(location: ProgressLocation | ViewId): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
  @scala.inline
  implicit class ProgressOptionsOps[Self <: ProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: ProgressLocation | ViewId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancellable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellable")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

