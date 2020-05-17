package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: scala.Double = js.native
  var fullyQualified: scala.Double = js.native
  var webApplication: scala.Double = js.native
}

object Context {
  @scala.inline
  def apply(context: scala.Double, fullyQualified: scala.Double, webApplication: scala.Double): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyQualified(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebApplication(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApplication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

