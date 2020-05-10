package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId extends js.Object {
  var config: String = js.native
  var id: Double = js.native
  var sessionConfig: js.UndefOr[String] = js.native
  var suite: String = js.native
}

object AnonId {
  @scala.inline
  def apply(config: String, id: Double, suite: String): AnonId = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
  @scala.inline
  implicit class AnonIdOps[Self <: AnonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionConfig")(js.undefined)
        ret
    }
  }
  
}

