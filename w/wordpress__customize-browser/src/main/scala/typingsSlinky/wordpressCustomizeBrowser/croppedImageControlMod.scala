package typingsSlinky.wordpressCustomizeBrowser

import typingsSlinky.wordpressCustomizeBrowser.externalMod.Attachment
import typingsSlinky.wordpressCustomizeBrowser.externalMod.Cropper
import typingsSlinky.wordpressCustomizeBrowser.mediaControlMod.MediaControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object croppedImageControlMod {
  
  @JSImport("@wordpress/customize-browser/CroppedImageControl", "CroppedImageControl")
  @js.native
  class CroppedImageControl protected () extends MediaControl {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    // TODO
    def calculateImageSelectOptions(attachment: Attachment, controller: Cropper): ImageSelectOptions = js.native
    
    def mustBeCropped(flexW: Boolean, flexH: Boolean, dstW: Double, dstH: Double, imgW: Double, imgH: Double): Boolean = js.native
    
    def onCropped(croppedImage: js.Any): Unit = js.native
    
    def onSelect(): Unit = js.native
    
    def onSkippedCrop(): Unit = js.native
    
    def setImageFromAttachment(attachment: js.Any): Unit = js.native
  }
  
  @js.native
  trait ImageSelectOptions extends StObject {
    
    var aspectRatio: js.UndefOr[String] = js.native
    
    var handles: Boolean = js.native
    
    var imageHeight: Double = js.native
    
    var imageWidth: Double = js.native
    
    var instance: Boolean = js.native
    
    var keys: Boolean = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var persistent: Boolean = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  object ImageSelectOptions {
    
    @scala.inline
    def apply(
      handles: Boolean,
      imageHeight: Double,
      imageWidth: Double,
      instance: Boolean,
      keys: Boolean,
      persistent: Boolean,
      x1: Double,
      x2: Double,
      y1: Double,
      y2: Double
    ): ImageSelectOptions = {
      val __obj = js.Dynamic.literal(handles = handles.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSelectOptions]
    }
    
    @scala.inline
    implicit class ImageSelectOptionsMutableBuilder[Self <: ImageSelectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setHandles(value: Boolean): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
