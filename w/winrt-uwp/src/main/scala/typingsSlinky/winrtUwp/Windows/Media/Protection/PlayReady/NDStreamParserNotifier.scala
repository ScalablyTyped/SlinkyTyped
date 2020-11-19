package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Media.Core.AudioStreamDescriptor
import typingsSlinky.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import typingsSlinky.winrtUwp.Windows.Media.Core.MediaStreamSample
import typingsSlinky.winrtUwp.Windows.Media.Core.VideoStreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a stream parser plug-in uses to send notifications to a PlayReady-ND client. */
@js.native
trait NDStreamParserNotifier extends js.Object {
  
  /**
    * Called by the stream parser when it requests a setup decryptor.
    * @param descriptor The descriptor of the media stream being decrypted.
    * @param keyID The key identifier used for decryption.
    * @param proBytes The data for the setup decryptor.
    */
  def onBeginSetupDecryptor(descriptor: IMediaStreamDescriptor, keyID: String, proBytes: js.Array[Double]): Unit = js.native
  
  /**
    * Called by a stream parser when it receives the content identifier.
    * @param licenseFetchDescriptor The license fetch descriptor containing the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit = js.native
  
  /**
    * Called by the stream parser when the media stream descriptor is created.
    * @param audioStreamDescriptors An array of audio stream descriptors that are part of the media stream descriptor.
    * @param videoStreamDescriptors An array of video stream descriptors that are part of the media stream descriptor.
    */
  def onMediaStreamDescriptorCreated(
    audioStreamDescriptors: IVector[AudioStreamDescriptor],
    videoStreamDescriptors: IVector[VideoStreamDescriptor]
  ): Unit = js.native
  
  /**
    * Called when the stream parser parses a sample from the media stream.
    * @param streamID The identifier for the media stream that is being parsed.
    * @param streamType The type of the media stream. This value can be Audio or Video.
    * @param streamSample The array of stream samples.
    * @param pts The presentation timestamp that indicates when to play the sample, in milliseconds. This value is relative to previous samples in the presentation. For example, if a given sample has a presentation time stamp of 1000 and some later sample has a presentation time stamp of 2000, the later sample occurs one second (1000ms) after the given sample.
    * @param ccFormat The closed caption format. This value can be ATSC, SCTE20, or Unknown.
    * @param ccDataBytes An array that contains the closed caption data.
    */
  def onSampleParsed(
    streamID: Double,
    streamType: NDMediaStreamType,
    streamSample: MediaStreamSample,
    pts: Double,
    ccFormat: NDClosedCaptionFormat,
    ccDataBytes: js.Array[Double]
  ): Unit = js.native
}
object NDStreamParserNotifier {
  
  @scala.inline
  def apply(
    onBeginSetupDecryptor: (IMediaStreamDescriptor, String, js.Array[Double]) => Unit,
    onContentIDReceived: INDLicenseFetchDescriptor => Unit,
    onMediaStreamDescriptorCreated: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Unit,
    onSampleParsed: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Unit
  ): NDStreamParserNotifier = {
    val __obj = js.Dynamic.literal(onBeginSetupDecryptor = js.Any.fromFunction3(onBeginSetupDecryptor), onContentIDReceived = js.Any.fromFunction1(onContentIDReceived), onMediaStreamDescriptorCreated = js.Any.fromFunction2(onMediaStreamDescriptorCreated), onSampleParsed = js.Any.fromFunction6(onSampleParsed))
    __obj.asInstanceOf[NDStreamParserNotifier]
  }
  
  @scala.inline
  implicit class NDStreamParserNotifierOps[Self <: NDStreamParserNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnBeginSetupDecryptor(value: (IMediaStreamDescriptor, String, js.Array[Double]) => Unit): Self = this.set("onBeginSetupDecryptor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnContentIDReceived(value: INDLicenseFetchDescriptor => Unit): Self = this.set("onContentIDReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMediaStreamDescriptorCreated(value: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Unit): Self = this.set("onMediaStreamDescriptorCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSampleParsed(
      value: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Unit
    ): Self = this.set("onSampleParsed", js.Any.fromFunction6(value))
  }
}
