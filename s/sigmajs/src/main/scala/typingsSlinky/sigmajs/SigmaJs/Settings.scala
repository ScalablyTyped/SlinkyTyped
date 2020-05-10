package typingsSlinky.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  // Animation settings
  var animationsTime: js.UndefOr[Double] = js.native
  var autoRescale: js.UndefOr[js.Any] = js.native
  // Global settings
  var autoResize: js.UndefOr[Boolean] = js.native
  // Batch edge drawing
  var batchEdgesDrawing: js.UndefOr[Boolean] = js.native
  // hovered node customizations
  var borderSize: js.UndefOr[Double] = js.native
  var canvasEdgesBatchSize: js.UndefOr[Double] = js.native
  // Graph settings
  @JSName("clone")
  var clone_FSettings: js.UndefOr[Boolean] = js.native
  var defaultEdgeColor: js.UndefOr[String] = js.native
  var defaultEdgeHoverColor: js.UndefOr[String] = js.native
  var defaultEdgeType: js.UndefOr[String] = js.native
  var defaultHoverLabelBGColor: js.UndefOr[String] = js.native
  var defaultLabelColor: js.UndefOr[String] = js.native
  var defaultLabelHoverColor: js.UndefOr[String] = js.native
  var defaultLabelSize: js.UndefOr[String] = js.native
  var defaultNodeBorderColor: js.UndefOr[String] = js.native
  var defaultNodeColor: js.UndefOr[String] = js.native
  var defaultNodeHoverColor: js.UndefOr[String] = js.native
  // Renderers settings
  var defaultNodeType: js.UndefOr[String] = js.native
  var doubleClickEnabled: js.UndefOr[Boolean] = js.native
  var doubleClickTimeout: js.UndefOr[Double] = js.native
  var doubleClickZoomDuration: js.UndefOr[Double] = js.native
  var doubleClickZoomingRatio: js.UndefOr[Double] = js.native
  var doubleTapTimeout: js.UndefOr[Double] = js.native
  var dragTimeout: js.UndefOr[Double] = js.native
  var drawEdges: js.UndefOr[Boolean] = js.native
  // Draw settings for labels, edges, and nodes
  var drawLabels: js.UndefOr[Boolean] = js.native
  var drawNodes: js.UndefOr[Boolean] = js.native
  var edgeColor: js.UndefOr[String] = js.native
  // hovered edge customizations
  var edgeHoverColor: js.UndefOr[String] = js.native
  var edgeHoverExtremities: js.UndefOr[Boolean] = js.native
  var edgeHoverPrecision: js.UndefOr[Double] = js.native
  var edgeHoverSizeRatio: js.UndefOr[Double] = js.native
  var edgesPowRatio: js.UndefOr[Double] = js.native
  var enableCamera: js.UndefOr[Boolean] = js.native
  var enableEdgeHovering: js.UndefOr[Boolean] = js.native
  var enableHovering: js.UndefOr[Boolean] = js.native
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  var font: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var hideEdgesOnMove: js.UndefOr[Boolean] = js.native
  var hoverFont: js.UndefOr[Double] = js.native
  var hoverFontStyle: js.UndefOr[String] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var labelAlignment: js.UndefOr[String] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelHoverBGColor: js.UndefOr[String] = js.native
  var labelHoverColor: js.UndefOr[String] = js.native
  var labelHoverShadow: js.UndefOr[String] = js.native
  var labelHoverShadowColor: js.UndefOr[String] = js.native
  var labelSize: js.UndefOr[String] = js.native
  var labelSizeRatio: js.UndefOr[String] = js.native
  var labelThreshold: js.UndefOr[Double] = js.native
  var maxEdgeSize: js.UndefOr[Double] = js.native
  var maxNodeSize: js.UndefOr[Double] = js.native
  var minArrowSize: js.UndefOr[Double] = js.native
  // max/min node and edge size
  var minEdgeSize: js.UndefOr[Double] = js.native
  var minNodeSize: js.UndefOr[Double] = js.native
  var mouseEnabled: js.UndefOr[Boolean] = js.native
  var mouseInertiaDuration: js.UndefOr[Double] = js.native
  var mouseInertiaRatio: js.UndefOr[Double] = js.native
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.native
  var mouseZoomDuration: js.UndefOr[Double] = js.native
  var nodeHoverColor: js.UndefOr[String] = js.native
  // Camera settings
  var nodesPowRatio: js.UndefOr[Double] = js.native
  var rescaleIgnoreSize: js.UndefOr[Boolean] = js.native
  // Rescale settings
  var scalingMode: js.UndefOr[String] = js.native
  var sideMargin: js.UndefOr[Double] = js.native
  var singleHover: js.UndefOr[Boolean] = js.native
  var skipErrors: js.UndefOr[Boolean] = js.native
  // Captor settings
  var touchEnabled: js.UndefOr[Boolean] = js.native
  var touchInertiaDuration: js.UndefOr[Double] = js.native
  var touchInertiaRatio: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var webglEdgesBatchSize: js.UndefOr[Double] = js.native
  var webglOversamplingRatio: js.UndefOr[Double] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomingRatio: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationsTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationsTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRescale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRescale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRescale")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchEdgesDrawing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEdgesDrawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchEdgesDrawing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEdgesDrawing")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasEdgesBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasEdgesBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasEdgesBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasEdgesBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEdgeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEdgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEdgeHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEdgeHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEdgeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEdgeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdgeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHoverLabelBGColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHoverLabelBGColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHoverLabelBGColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHoverLabelBGColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabelHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabelHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabelSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNodeBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNodeBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNodeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNodeHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNodeHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoomDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoomDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoomDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoomingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoomingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoomingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoomingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleTapTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleTapTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHoverExtremities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverExtremities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHoverExtremities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverExtremities")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHoverPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHoverPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHoverSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHoverSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHoverSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgesPowRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesPowRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgesPowRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesPowRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEdgeHovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEdgeHovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEdgeHovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEdgeHovering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHovering")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEdgesOnMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdgesOnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEdgesOnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdgesOnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverFont(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverFont")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHoverBGColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverBGColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHoverBGColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverBGColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHoverShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHoverShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHoverShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHoverShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSizeRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEdgeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEdgeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEdgeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEdgeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNodeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minArrowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinEdgeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEdgeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinEdgeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEdgeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNodeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseInertiaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseInertiaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseInertiaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseInertiaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseInertiaRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseInertiaRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseInertiaRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseInertiaRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseZoomDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseZoomDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseZoomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseZoomDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodesPowRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesPowRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodesPowRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesPowRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRescaleIgnoreSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescaleIgnoreSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRescaleIgnoreSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescaleIgnoreSize")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSideMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchInertiaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchInertiaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchInertiaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchInertiaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchInertiaRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchInertiaRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchInertiaRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchInertiaRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withWebglEdgesBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglEdgesBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebglEdgesBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglEdgesBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWebglOversamplingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglOversamplingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebglOversamplingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglOversamplingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingRatio")(js.undefined)
        ret
    }
  }
  
}

