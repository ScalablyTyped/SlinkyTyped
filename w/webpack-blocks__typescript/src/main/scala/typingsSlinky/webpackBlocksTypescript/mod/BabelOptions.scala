package typingsSlinky.webpackBlocksTypescript.mod

import typingsSlinky.webpackBlocksTypescript.AnonModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelOptions extends js.Object {
  var babelrc: js.UndefOr[Boolean] = js.native
  var presets: js.UndefOr[js.Array[js.Array[AnonModules | String]]] = js.native
}

object BabelOptions {
  @scala.inline
  def apply(): BabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelOptions]
  }
  @scala.inline
  implicit class BabelOptionsOps[Self <: BabelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBabelrc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: js.Array[js.Array[AnonModules | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(js.undefined)
        ret
    }
  }
  
}

