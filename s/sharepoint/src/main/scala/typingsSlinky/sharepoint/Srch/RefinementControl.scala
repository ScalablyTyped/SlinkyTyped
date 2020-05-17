package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinementControl extends js.Object {
  var alternateRenderContext: js.Any = js.native
  var alternateRenderer: js.Any = js.native
  var containerId: String = js.native
  var countDisplay: String = js.native
  var deepHits: Double = js.native
  var overrideDisplayName: String = js.native
  var propertyName: String = js.native
  var renderTemplateId: String = js.native
  var spec: String = js.native
  var useDefaultDateIntervals: Boolean = js.native
}

object RefinementControl {
  @scala.inline
  def apply(
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    containerId: String,
    countDisplay: String,
    deepHits: Double,
    overrideDisplayName: String,
    propertyName: String,
    renderTemplateId: String,
    spec: String,
    useDefaultDateIntervals: Boolean
  ): RefinementControl = {
    val __obj = js.Dynamic.literal(alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], countDisplay = countDisplay.asInstanceOf[js.Any], deepHits = deepHits.asInstanceOf[js.Any], overrideDisplayName = overrideDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], renderTemplateId = renderTemplateId.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], useDefaultDateIntervals = useDefaultDateIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementControl]
  }
  @scala.inline
  implicit class RefinementControlOps[Self <: RefinementControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateRenderContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRenderContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternateRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeepHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDefaultDateIntervals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultDateIntervals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

