package typingsSlinky.winrt.Windows.Media.Capture

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.IMediaExtension
import typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCaptureVideoPreview extends js.Object {
  
  def startPreviewAsync(): IAsyncAction = js.native
  
  def startPreviewToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  
  def stopPreviewAsync(): IAsyncAction = js.native
}
