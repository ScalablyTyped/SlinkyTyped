package typingsSlinky.winrt.Windows.Media.Capture

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.Devices.AudioDeviceController
import typingsSlinky.winrt.Windows.Media.Devices.VideoDeviceController
import typingsSlinky.winrt.Windows.Media.IMediaExtension
import typingsSlinky.winrt.Windows.Media.MediaProperties.ImageEncodingProperties
import typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCapture extends js.Object {
  
  def addEffectAsync(mediaStreamType: MediaStreamType, effectActivationID: String, effectSettings: IPropertySet): IAsyncAction = js.native
  
  var audioDeviceController: AudioDeviceController = js.native
  
  def capturePhotoToStorageFileAsync(`type`: ImageEncodingProperties, file: IStorageFile): IAsyncAction = js.native
  
  def capturePhotoToStreamAsync(`type`: ImageEncodingProperties, stream: IRandomAccessStream): IAsyncAction = js.native
  
  def clearEffectsAsync(mediaStreamType: MediaStreamType): IAsyncAction = js.native
  
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String): js.Any = js.native
  
  def getPreviewMirroring(): Boolean = js.native
  
  def getPreviewRotation(): VideoRotation = js.native
  
  def getRecordRotation(): VideoRotation = js.native
  
  def initializeAsync(): IAsyncAction = js.native
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): IAsyncAction = js.native
  
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  
  var onfailed: js.Any = js.native
  
  var onrecordlimitationexceeded: js.Any = js.native
  
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String, propertyValue: js.Any): Unit = js.native
  
  def setPreviewMirroring(value: Boolean): Unit = js.native
  
  def setPreviewRotation(value: VideoRotation): Unit = js.native
  
  def setRecordRotation(value: VideoRotation): Unit = js.native
  
  def startRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  
  def startRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile, file: IStorageFile): IAsyncAction = js.native
  
  def startRecordToStreamAsync(encodingProfile: MediaEncodingProfile, stream: IRandomAccessStream): IAsyncAction = js.native
  
  def stopRecordAsync(): IAsyncAction = js.native
  
  var videoDeviceController: VideoDeviceController = js.native
}
