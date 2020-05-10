package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.documentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSDocument extends js.Object {
  var _class: documentData = js.native
  var assets: SketchMSDocumentAssets = js.native
  var colorSpace: Double = js.native
  var currentPageIndex: Double = js.native
  var do_objectID: String = js.native
  var foreignSymbols: js.Array[SketchMSImmutableForeignSymbol] = js.native
  var foreignTextStyles: js.Array[_] = js.native
  var layerStyles: SketchMSSharedStyleContainer = js.native
  var layerSymbols: SketchMSSymbolContainers = js.native
  var layerTextStyles: SketchMSSharedTextStyleContainer = js.native
  var pages: js.Array[SketchMSPageReference] = js.native
}

object SketchMSDocument {
  @scala.inline
  def apply(
    _class: documentData,
    assets: SketchMSDocumentAssets,
    colorSpace: Double,
    currentPageIndex: Double,
    do_objectID: String,
    foreignSymbols: js.Array[SketchMSImmutableForeignSymbol],
    foreignTextStyles: js.Array[_],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    pages: js.Array[SketchMSPageReference]
  ): SketchMSDocument = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerSymbols = layerSymbols.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocument]
  }
  @scala.inline
  implicit class SketchMSDocumentOps[Self <: SketchMSDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: documentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssets(value: SketchMSDocumentAssets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDo_objectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("do_objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeignSymbols(value: js.Array[SketchMSImmutableForeignSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeignTextStyles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignTextStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerStyles(value: SketchMSSharedStyleContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerSymbols(value: SketchMSSymbolContainers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerTextStyles(value: SketchMSSharedTextStyleContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTextStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[SketchMSPageReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

