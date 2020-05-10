package typingsSlinky.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalOptions extends js.Object {
  var excludeRoot: js.UndefOr[Boolean] = js.native
  var maxParallelLoad: js.UndefOr[Double] = js.native
  var order: js.UndefOr[TraversalOrder] = js.native
  var stopOnError: js.UndefOr[Boolean] = js.native
}

object TraversalOptions {
  @scala.inline
  def apply(): TraversalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalOptions]
  }
  @scala.inline
  implicit class TraversalOptionsOps[Self <: TraversalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParallelLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParallelLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: TraversalOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnError")(js.undefined)
        ret
    }
  }
  
}

