package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteConfigurationResponse. */
@js.native
trait DeleteConfigurationResponse extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: String = js.native
  /** An array of notice messages, if any. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Status of the configuration. A deleted configuration has the status deleted. */
  var status: String = js.native
}

object DeleteConfigurationResponse {
  @scala.inline
  def apply(configuration_id: String, status: String): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
  @scala.inline
  implicit class DeleteConfigurationResponseOps[Self <: DeleteConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotices(value: js.Array[Notice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(js.undefined)
        ret
    }
  }
  
}

