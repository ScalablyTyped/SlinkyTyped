package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradientDef extends js.Object {
  /** GradientDef functionName */
  var functionName: js.UndefOr[String | Null] = js.native
  /** GradientDef gradientFunc */
  var gradientFunc: js.UndefOr[String | Null] = js.native
}

object IGradientDef {
  @scala.inline
  def apply(): IGradientDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientDef]
  }
  @scala.inline
  implicit class IGradientDefOps[Self <: IGradientDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(null)
        ret
    }
    @scala.inline
    def withGradientFunc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientFuncNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientFunc")(null)
        ret
    }
  }
  
}

