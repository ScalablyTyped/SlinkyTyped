package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListEnvironmentsResponse. */
@js.native
trait ListEnvironmentsResponse extends js.Object {
  /** An array of [environments] that are available for the service instance. */
  var environments: js.UndefOr[js.Array[Environment]] = js.native
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  @scala.inline
  implicit class ListEnvironmentsResponseOps[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironments(value: js.Array[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(js.undefined)
        ret
    }
  }
  
}

