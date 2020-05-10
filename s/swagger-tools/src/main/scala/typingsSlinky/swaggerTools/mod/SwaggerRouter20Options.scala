package typingsSlinky.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerRouter20Options extends js.Object {
  var controllers: js.UndefOr[SwaggerRouter20OptionsControllers | String | js.Array[String]] = js.native
  var ignoreMissingHandlers: js.UndefOr[Boolean] = js.native
  var useStubs: js.UndefOr[Boolean] = js.native
}

object SwaggerRouter20Options {
  @scala.inline
  def apply(): SwaggerRouter20Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerRouter20Options]
  }
  @scala.inline
  implicit class SwaggerRouter20OptionsOps[Self <: SwaggerRouter20Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllers(value: SwaggerRouter20OptionsControllers | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMissingHandlers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMissingHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMissingHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMissingHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStubs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStubs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(js.undefined)
        ret
    }
  }
  
}

