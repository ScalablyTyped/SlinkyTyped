package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: Double = js.native
  var fullyQualified: Double = js.native
  var webApplication: Double = js.native
}

object AnonContext {
  @scala.inline
  def apply(context: Double, fullyQualified: Double, webApplication: Double): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
  @scala.inline
  implicit class AnonContextOps[Self <: AnonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyQualified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebApplication(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApplication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

