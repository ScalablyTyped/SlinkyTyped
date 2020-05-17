package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSRRefinementControl extends RefinementControl {
  var csr_displayTitle: String = js.native
  var csr_filters: js.Array[CSRFilter] = js.native
  var csr_isExpanded: String = js.native
  var csr_propertyName: String = js.native
  var csr_renderEmptyContainer: Boolean = js.native
  var csr_showCounts: Boolean = js.native
  var csr_useContains: Boolean = js.native
  var csr_useKQL: Boolean = js.native
}

object CSRRefinementControl {
  @scala.inline
  def apply(
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    containerId: String,
    countDisplay: String,
    csr_displayTitle: String,
    csr_filters: js.Array[CSRFilter],
    csr_isExpanded: String,
    csr_propertyName: String,
    csr_renderEmptyContainer: Boolean,
    csr_showCounts: Boolean,
    csr_useContains: Boolean,
    csr_useKQL: Boolean,
    deepHits: Double,
    overrideDisplayName: String,
    propertyName: String,
    renderTemplateId: String,
    spec: String,
    useDefaultDateIntervals: Boolean
  ): CSRRefinementControl = {
    val __obj = js.Dynamic.literal(alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], countDisplay = countDisplay.asInstanceOf[js.Any], csr_displayTitle = csr_displayTitle.asInstanceOf[js.Any], csr_filters = csr_filters.asInstanceOf[js.Any], csr_isExpanded = csr_isExpanded.asInstanceOf[js.Any], csr_propertyName = csr_propertyName.asInstanceOf[js.Any], csr_renderEmptyContainer = csr_renderEmptyContainer.asInstanceOf[js.Any], csr_showCounts = csr_showCounts.asInstanceOf[js.Any], csr_useContains = csr_useContains.asInstanceOf[js.Any], csr_useKQL = csr_useKQL.asInstanceOf[js.Any], deepHits = deepHits.asInstanceOf[js.Any], overrideDisplayName = overrideDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], renderTemplateId = renderTemplateId.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], useDefaultDateIntervals = useDefaultDateIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRRefinementControl]
  }
  @scala.inline
  implicit class CSRRefinementControlOps[Self <: CSRRefinementControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsr_displayTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_displayTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_filters(value: js.Array[CSRFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_isExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_propertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_renderEmptyContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_renderEmptyContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_showCounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_showCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_useContains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_useContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr_useKQL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr_useKQL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

