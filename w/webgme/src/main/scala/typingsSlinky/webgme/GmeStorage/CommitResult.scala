package typingsSlinky.webgme.GmeStorage

import typingsSlinky.webgme.webgmeStrings.CANCELED
import typingsSlinky.webgme.webgmeStrings.FORKED
import typingsSlinky.webgme.webgmeStrings.SYNCED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResult extends js.Object {
  /** The commitHash for the commit. */
  var hash: CommitHash
  var status: js.UndefOr[SYNCED | FORKED | CANCELED] = js.undefined
}

object CommitResult {
  @scala.inline
  def apply(hash: CommitHash, status: SYNCED | FORKED | CANCELED = null): CommitResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResult]
  }
}

