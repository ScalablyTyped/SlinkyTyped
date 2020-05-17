package typingsSlinky.typedGithubApi.anon

import typingsSlinky.typedGithubApi.typedGithubApiStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bloburl extends js.Object {
  var additions: Double = js.native
  var blob_url: String = js.native
  var changes: Double = js.native
  var deletions: Double = js.native
  var filename: String = js.native
  var patch: String = js.native
  var raw_url: String = js.native
  var status: modified = js.native
}

object Bloburl {
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    status: modified
  ): Bloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloburl]
  }
  @scala.inline
  implicit class BloburlOps[Self <: Bloburl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: modified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

