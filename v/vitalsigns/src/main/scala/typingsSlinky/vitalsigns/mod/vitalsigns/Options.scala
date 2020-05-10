package typingsSlinky.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Number of milliseconds to wait between automatic health checks.
    * @type {number|boolean}
    */
  var autoCheck: js.UndefOr[Double | Boolean] = js.native
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpHealthy: js.UndefOr[Double] = js.native
  /**
    * HTTP response code to send back in the VitalSigns.
    * @type {number}
    */
  var httpUnhealthy: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCheck(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHealthy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHealthy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHealthy")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpUnhealthy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpUnhealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpUnhealthy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpUnhealthy")(js.undefined)
        ret
    }
  }
  
}

