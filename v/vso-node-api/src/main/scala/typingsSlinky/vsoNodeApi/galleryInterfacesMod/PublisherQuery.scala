package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherQuery extends js.Object {
  /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter] = js.native
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
  var flags: PublisherQueryFlags = js.native
}

object PublisherQuery {
  @scala.inline
  def apply(filters: js.Array[QueryFilter], flags: PublisherQueryFlags): PublisherQuery = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherQuery]
  }
  @scala.inline
  implicit class PublisherQueryOps[Self <: PublisherQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[QueryFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: PublisherQueryFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

