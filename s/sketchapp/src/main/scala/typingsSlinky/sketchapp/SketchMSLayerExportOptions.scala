package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.exportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayerExportOptions extends js.Object {
  var _class: exportOptions = js.native
  var exportFormats: js.Array[_] = js.native
  var includedLayerIds: js.Array[_] = js.native
  var layerOptions: Double = js.native
  var shouldTrim: Boolean = js.native
}

object SketchMSLayerExportOptions {
  @scala.inline
  def apply(
    _class: exportOptions,
    exportFormats: js.Array[_],
    includedLayerIds: js.Array[_],
    layerOptions: Double,
    shouldTrim: Boolean
  ): SketchMSLayerExportOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
  @scala.inline
  implicit class SketchMSLayerExportOptionsOps[Self <: SketchMSLayerExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: exportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportFormats(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludedLayerIds(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedLayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldTrim")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

