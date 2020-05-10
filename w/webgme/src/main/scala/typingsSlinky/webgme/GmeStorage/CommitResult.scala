package typingsSlinky.webgme.GmeStorage

import typingsSlinky.webgme.webgmeStrings.CANCELED
import typingsSlinky.webgme.webgmeStrings.FORKED
import typingsSlinky.webgme.webgmeStrings.SYNCED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitResult extends js.Object {
  /** The commitHash for the commit. */
  var hash: CommitHash = js.native
  var status: js.UndefOr[SYNCED | FORKED | CANCELED] = js.native
}

object CommitResult {
  @scala.inline
  def apply(hash: CommitHash): CommitResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResult]
  }
  @scala.inline
  implicit class CommitResultOps[Self <: CommitResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: CommitHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SYNCED | FORKED | CANCELED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

