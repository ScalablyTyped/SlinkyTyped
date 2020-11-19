package typingsSlinky.webgme.GmeStorage

import typingsSlinky.webgme.webgmeStrings.CANCELED
import typingsSlinky.webgme.webgmeStrings.FORKED
import typingsSlinky.webgme.webgmeStrings.SYNCED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: CommitHash): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SYNCED | FORKED | CANCELED): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
