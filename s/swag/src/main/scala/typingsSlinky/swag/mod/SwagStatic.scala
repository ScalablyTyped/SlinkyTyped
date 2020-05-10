package typingsSlinky.swag.mod

import typingsSlinky.swag.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwagStatic extends js.Object {
  def registerHelpers(handlebars: TypeofHandlebars): Unit = js.native
}

object SwagStatic {
  @scala.inline
  def apply(registerHelpers: TypeofHandlebars => Unit): SwagStatic = {
    val __obj = js.Dynamic.literal(registerHelpers = js.Any.fromFunction1(registerHelpers))
    __obj.asInstanceOf[SwagStatic]
  }
  @scala.inline
  implicit class SwagStaticOps[Self <: SwagStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterHelpers(value: TypeofHandlebars => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHelpers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

