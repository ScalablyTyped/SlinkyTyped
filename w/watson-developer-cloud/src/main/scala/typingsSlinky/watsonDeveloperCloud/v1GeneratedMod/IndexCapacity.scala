package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the resource usage and capacity of the environment. */
@js.native
trait IndexCapacity extends js.Object {
  /** Summary of the collection usage in the environment. */
  var collections: js.UndefOr[CollectionUsage] = js.native
  /** Summary of the disk usage statistics for the environment. */
  var disk_usage: js.UndefOr[DiskUsage] = js.native
  /** Summary of the document usage statistics for the environment. */
  var documents: js.UndefOr[EnvironmentDocuments] = js.native
}

object IndexCapacity {
  @scala.inline
  def apply(): IndexCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexCapacity]
  }
  @scala.inline
  implicit class IndexCapacityOps[Self <: IndexCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: CollectionUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(js.undefined)
        ret
    }
    @scala.inline
    def withDisk_usage(value: DiskUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisk_usage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(js.undefined)
        ret
    }
    @scala.inline
    def withDocuments(value: EnvironmentDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(js.undefined)
        ret
    }
  }
  
}

