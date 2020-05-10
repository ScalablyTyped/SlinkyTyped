package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeList[T] extends js.Object {
  var allChangesIncluded: Boolean = js.native
  var changeCounts: NumberDictionary[Double] = js.native
  var changes: js.Array[Change[T]] = js.native
  var comment: String = js.native
  var commentTruncated: Boolean = js.native
  var creationDate: js.Date = js.native
  var notes: js.Array[CheckinNote] = js.native
  var owner: String = js.native
  var ownerDisplayName: String = js.native
  var ownerId: String = js.native
  var sortDate: js.Date = js.native
  var version: String = js.native
}

object ChangeList {
  @scala.inline
  def apply[T](
    allChangesIncluded: Boolean,
    changeCounts: NumberDictionary[Double],
    changes: js.Array[Change[T]],
    comment: String,
    commentTruncated: Boolean,
    creationDate: js.Date,
    notes: js.Array[CheckinNote],
    owner: String,
    ownerDisplayName: String,
    ownerId: String,
    sortDate: js.Date,
    version: String
  ): ChangeList[T] = {
    val __obj = js.Dynamic.literal(allChangesIncluded = allChangesIncluded.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ownerDisplayName = ownerDisplayName.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], sortDate = sortDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeList[T]]
  }
  @scala.inline
  implicit class ChangeListOps[Self[t] <: ChangeList[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAllChangesIncluded(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allChangesIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeCounts(value: NumberDictionary[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: js.Array[Change[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentTruncated(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[CheckinNote]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerDisplayName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

