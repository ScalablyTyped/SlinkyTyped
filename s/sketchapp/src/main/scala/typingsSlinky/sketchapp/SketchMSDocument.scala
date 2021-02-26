package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.documentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSDocument extends StObject {
  
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
  implicit class SketchMSDocumentMutableBuilder[Self <: SketchMSDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: SketchMSDocumentAssets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: Double): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo_objectID(value: String): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignSymbols(value: js.Array[SketchMSImmutableForeignSymbol]): Self = StObject.set(x, "foreignSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignSymbolsVarargs(value: SketchMSImmutableForeignSymbol*): Self = StObject.set(x, "foreignSymbols", js.Array(value :_*))
    
    @scala.inline
    def setForeignTextStyles(value: js.Array[_]): Self = StObject.set(x, "foreignTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignTextStylesVarargs(value: js.Any*): Self = StObject.set(x, "foreignTextStyles", js.Array(value :_*))
    
    @scala.inline
    def setLayerStyles(value: SketchMSSharedStyleContainer): Self = StObject.set(x, "layerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerSymbols(value: SketchMSSymbolContainers): Self = StObject.set(x, "layerSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTextStyles(value: SketchMSSharedTextStyleContainer): Self = StObject.set(x, "layerTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: js.Array[SketchMSPageReference]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: SketchMSPageReference*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: documentData): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
