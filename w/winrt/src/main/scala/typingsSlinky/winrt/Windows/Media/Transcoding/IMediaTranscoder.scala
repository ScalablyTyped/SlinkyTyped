package typingsSlinky.winrt.Windows.Media.Transcoding

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaTranscoder extends js.Object {
  var alwaysReencode: Boolean = js.native
  var hardwareAccelerationEnabled: Boolean = js.native
  var trimStartTime: Double = js.native
  var trimStopTime: Double = js.native
  def addAudioEffect(activatableClassId: String): Unit = js.native
  def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  def addVideoEffect(activatableClassId: String): Unit = js.native
  def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  def clearEffects(): Unit = js.native
  def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
  def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
}

