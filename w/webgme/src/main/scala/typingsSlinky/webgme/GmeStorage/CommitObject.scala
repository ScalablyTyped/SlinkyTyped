package typingsSlinky.webgme.GmeStorage

import typingsSlinky.webgme.Core.ObjectHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitObject extends js.Object {
  /**
    * Hash of the commit object, a.k.a commitHash.
    */
  var _id: CommitHash = js.native
  /**
    * Commit message.
    */
  var message: String = js.native
  /**
    * Commits from where this commit evolved.
    */
  var parents: js.Array[CommitHash] = js.native
  /**
    * Hash of the associated root object, a.k.a. rootHash.
    */
  var root: ObjectHash = js.native
  /**
    * When the commit object was created (new Date()).getTime().
    */
  var time: Double = js.native
  /**
    * A constant 'commit'.
    */
  var `type`: String = js.native
  /**
    * Who performed the update.
    */
  var updater: js.Array[String] = js.native
}

object CommitObject {
  @scala.inline
  def apply(
    _id: CommitHash,
    message: String,
    parents: js.Array[CommitHash],
    root: ObjectHash,
    time: Double,
    `type`: String,
    updater: js.Array[String]
  ): CommitObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updater = updater.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitObject]
  }
  @scala.inline
  implicit class CommitObjectOps[Self <: CommitObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: CommitHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[CommitHash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: ObjectHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdater(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

