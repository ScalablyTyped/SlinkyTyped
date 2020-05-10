package typingsSlinky.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveConfig extends js.Object {
  /**
    * Whether the optimizer will be saved (if exists).
    *
    * Default: `false`.
    */
  var includeOptimizer: js.UndefOr[Boolean] = js.native
  /**
    * Whether to save only the trainable weights of the model, ignoring the
    * non-trainable ones.
    */
  var trainableOnly: js.UndefOr[Boolean] = js.native
}

object SaveConfig {
  @scala.inline
  def apply(): SaveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveConfig]
  }
  @scala.inline
  implicit class SaveConfigOps[Self <: SaveConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeOptimizer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOptimizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOptimizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOptimizer")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainableOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainableOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainableOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainableOnly")(js.undefined)
        ret
    }
  }
  
}

