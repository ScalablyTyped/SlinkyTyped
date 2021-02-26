package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapFrame extends StObject {
  
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  
  var bitmapProperties: BitmapPropertiesView = js.native
  
  var dpiX: Double = js.native
  
  var dpiY: Double = js.native
  
  def getPixelDataAsync(): IAsyncOperation[PixelDataProvider] = js.native
  def getPixelDataAsync(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    transform: BitmapTransform,
    exifOrientationMode: ExifOrientationMode,
    colorManagementMode: ColorManagementMode
  ): IAsyncOperation[PixelDataProvider] = js.native
  
  def getThumbnailAsync(): IAsyncOperation[ImageStream] = js.native
  
  var orientedPixelHeight: Double = js.native
  
  var orientedPixelWidth: Double = js.native
  
  var pixelHeight: Double = js.native
  
  var pixelWidth: Double = js.native
}
