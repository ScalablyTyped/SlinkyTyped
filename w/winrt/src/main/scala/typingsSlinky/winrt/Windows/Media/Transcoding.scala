package typingsSlinky.winrt.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transcoding {
  
  @js.native
  sealed trait TranscodeFailureReason extends StObject
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @js.native
    sealed trait codecNotFound extends TranscodeFailureReason
    
    @js.native
    sealed trait invalidProfile extends TranscodeFailureReason
    
    @js.native
    sealed trait none extends TranscodeFailureReason
    
    @js.native
    sealed trait unknown extends TranscodeFailureReason
  }
  
  @js.native
  trait IMediaTranscoder extends StObject {
    
    def addAudioEffect(activatableClassId: String): Unit = js.native
    def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    def addVideoEffect(activatableClassId: String): Unit = js.native
    def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    var alwaysReencode: Boolean = js.native
    
    def clearEffects(): Unit = js.native
    
    var hardwareAccelerationEnabled: Boolean = js.native
    
    def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    var trimStartTime: Double = js.native
    
    var trimStopTime: Double = js.native
  }
  
  @js.native
  trait IPrepareTranscodeResult extends StObject {
    
    var canTranscode: Boolean = js.native
    
    var failureReason: TranscodeFailureReason = js.native
    
    def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
  }
  object IPrepareTranscodeResult {
    
    @scala.inline
    def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: () => IAsyncActionWithProgress[Double]
    ): IPrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
      __obj.asInstanceOf[IPrepareTranscodeResult]
    }
    
    @scala.inline
    implicit class IPrepareTranscodeResultMutableBuilder[Self <: IPrepareTranscodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanTranscode(value: Boolean): Self = StObject.set(x, "canTranscode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureReason(value: TranscodeFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeAsync(value: () => IAsyncActionWithProgress[Double]): Self = StObject.set(x, "transcodeAsync", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MediaTranscoder extends IMediaTranscoder
  
  @js.native
  trait PrepareTranscodeResult extends IPrepareTranscodeResult
  object PrepareTranscodeResult {
    
    @scala.inline
    def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: () => IAsyncActionWithProgress[Double]
    ): PrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
      __obj.asInstanceOf[PrepareTranscodeResult]
    }
  }
}
