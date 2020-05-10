package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizationOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.native
  var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.native
}

object OptimizationOptions {
  @scala.inline
  def apply(): OptimizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationOptions]
  }
  @scala.inline
  implicit class OptimizationOptionsOps[Self <: OptimizationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizerFunction1(value: /* compiler */ js.Any => Plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinimizer(value: js.Array[Plugin] | PluginFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizer")(js.undefined)
        ret
    }
  }
  
}

