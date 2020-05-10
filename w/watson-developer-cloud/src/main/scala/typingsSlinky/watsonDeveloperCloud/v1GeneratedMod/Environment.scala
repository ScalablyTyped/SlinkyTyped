package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about an environment. */
@js.native
trait Environment extends js.Object {
  /** Creation date of the environment, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var created: js.UndefOr[String] = js.native
  /** Description of the environment. */
  var description: js.UndefOr[String] = js.native
  /** Unique identifier for the environment. */
  var environment_id: js.UndefOr[String] = js.native
  /** Details about the resource usage and capacity of the environment. */
  var index_capacity: js.UndefOr[IndexCapacity] = js.native
  /** Name that identifies the environment. */
  var name: js.UndefOr[String] = js.native
  /** If `true`, the environment contains read-only collections that are maintained by IBM. */
  var read_only: js.UndefOr[Boolean] = js.native
  /** The new size requested for this environment. Only returned when the environment *status* is `resizing`. *Note:* Querying and indexing can still be performed during an environment upsize. */
  var requested_size: js.UndefOr[String] = js.native
  /** Information about the Continuous Relevancy Training for this environment. */
  var search_status: js.UndefOr[SearchStatus] = js.native
  /** Current size of the environment. */
  var size: js.UndefOr[String] = js.native
  /** Current status of the environment. `resizing` is displayed when a request to increase the environment size has been made, but is still in the process of being completed. */
  var status: js.UndefOr[String] = js.native
  /** Date of most recent environment update, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var updated: js.UndefOr[String] = js.native
}

object Environment {
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex_capacity(value: IndexCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex_capacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRead_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_only")(js.undefined)
        ret
    }
    @scala.inline
    def withRequested_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_size")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_status(value: SearchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_status")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

