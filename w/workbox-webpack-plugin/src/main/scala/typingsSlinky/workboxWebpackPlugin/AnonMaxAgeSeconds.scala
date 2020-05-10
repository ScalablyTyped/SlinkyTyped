package typingsSlinky.workboxWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAgeSeconds extends js.Object {
  /**
  		 * Cache will only hold entries for X seconds.
  		 */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  /**
  		 * Cache will only hold X entries.
  		 */
  var maxEntries: js.UndefOr[Double] = js.native
}

object AnonMaxAgeSeconds {
  @scala.inline
  def apply(): AnonMaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAgeSeconds]
  }
  @scala.inline
  implicit class AnonMaxAgeSecondsOps[Self <: AnonMaxAgeSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(js.undefined)
        ret
    }
  }
  
}

