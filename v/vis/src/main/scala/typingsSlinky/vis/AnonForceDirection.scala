package typingsSlinky.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceDirection extends js.Object {
  var enabled: Boolean = js.native
  var forceDirection: js.UndefOr[String | Boolean] = js.native
  var roundness: Double = js.native
  var `type`: String = js.native
}

object AnonForceDirection {
  @scala.inline
  def apply(enabled: Boolean, roundness: Double, `type`: String): AnonForceDirection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceDirection]
  }
  @scala.inline
  implicit class AnonForceDirectionOps[Self <: AnonForceDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceDirection(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDirection")(js.undefined)
        ret
    }
  }
  
}

