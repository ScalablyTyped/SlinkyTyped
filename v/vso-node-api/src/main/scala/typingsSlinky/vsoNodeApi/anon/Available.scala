package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: scala.Double = js.native
  var offline: scala.Double = js.native
  var unavailable: scala.Double = js.native
}

object Available {
  @scala.inline
  def apply(available: scala.Double, offline: scala.Double, unavailable: scala.Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffline(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnavailable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

