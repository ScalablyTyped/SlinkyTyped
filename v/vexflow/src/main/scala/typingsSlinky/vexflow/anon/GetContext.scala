package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContext extends js.Object {
  var getContext: js.Function = js.native
  var getMetrics: js.Function = js.native
  var renderToStave: js.Function = js.native
  var setStave: js.Function = js.native
}

object GetContext {
  @scala.inline
  def apply(
    getContext: js.Function,
    getMetrics: js.Function,
    renderToStave: js.Function,
    setStave: js.Function
  ): GetContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.asInstanceOf[js.Any], getMetrics = getMetrics.asInstanceOf[js.Any], renderToStave = renderToStave.asInstanceOf[js.Any], setStave = setStave.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContext]
  }
  @scala.inline
  implicit class GetContextOps[Self <: GetContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContext(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMetrics(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderToStave(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToStave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetStave(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

