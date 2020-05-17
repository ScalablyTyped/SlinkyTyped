package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about a change to storage library content. */
@js.native
trait StorageLibraryContentChangedTriggerDetails extends js.Object {
  /** Gets the StorageFolder that has been changed. */
  var folder: StorageFolder = js.native
  /**
    * Query for the creation/modified changes since a previous such query.
    * @param lastQueryTime The time the previous query was made.
    * @return The query result.
    */
  def createModifiedSinceQuery(lastQueryTime: js.Date): StorageItemQueryResult = js.native
}

object StorageLibraryContentChangedTriggerDetails {
  @scala.inline
  def apply(createModifiedSinceQuery: js.Date => StorageItemQueryResult, folder: StorageFolder): StorageLibraryContentChangedTriggerDetails = {
    val __obj = js.Dynamic.literal(createModifiedSinceQuery = js.Any.fromFunction1(createModifiedSinceQuery), folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLibraryContentChangedTriggerDetails]
  }
  @scala.inline
  implicit class StorageLibraryContentChangedTriggerDetailsOps[Self <: StorageLibraryContentChangedTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateModifiedSinceQuery(value: js.Date => StorageItemQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createModifiedSinceQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFolder(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

