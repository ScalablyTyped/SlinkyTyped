package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListCollectionsResponse. */
@js.native
trait ListCollectionsResponse extends js.Object {
  /** An array containing information about each collection in the environment. */
  var collections: js.UndefOr[js.Array[Collection]] = js.native
}

object ListCollectionsResponse {
  @scala.inline
  def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  @scala.inline
  implicit class ListCollectionsResponseOps[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Array[Collection]): Self = {
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
  }
  
}

