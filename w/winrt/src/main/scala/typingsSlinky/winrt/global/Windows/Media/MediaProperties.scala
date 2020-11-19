package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality
import typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.MediaProperties")
@js.native
object MediaProperties extends js.Object {
  
  @js.native
  class AudioEncodingProperties ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingProperties
  
  @js.native
  object AudioEncodingQuality extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality with Double
      ] = js.native
    
    /* 0 */ val auto: typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.auto with Double = js.native
    
    /* 1 */ val high: typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.high with Double = js.native
    
    /* 3 */ val low: typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.low with Double = js.native
    
    /* 2 */ val medium: typingsSlinky.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.medium with Double = js.native
  }
  
  @js.native
  class ContainerEncodingProperties ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties
  
  @js.native
  class ImageEncodingProperties ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.ImageEncodingProperties
  /* static members */
  @js.native
  object ImageEncodingProperties extends js.Object {
    
    def createJpeg(): typingsSlinky.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    
    def createJpegXR(): typingsSlinky.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
    
    def createPng(): typingsSlinky.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  }
  
  @js.native
  class MediaEncodingProfile ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
  /* static members */
  @js.native
  object MediaEncodingProfile extends js.Object {
    
    def createFromFileAsync(file: IStorageFile): IAsyncOperation[typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    
    def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
    
    def createM4a(quality: AudioEncodingQuality): typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    def createMp3(quality: AudioEncodingQuality): typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    def createMp4(quality: VideoEncodingQuality): typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    def createWma(quality: AudioEncodingQuality): typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
    
    def createWmv(quality: VideoEncodingQuality): typingsSlinky.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  }
  
  @js.native
  class MediaPropertySet ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.MediaPropertySet
  
  @js.native
  class MediaRatio ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.MediaRatio
  
  @js.native
  class VideoEncodingProperties ()
    extends typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingProperties
  
  @js.native
  object VideoEncodingQuality extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality with Double
      ] = js.native
    
    /* 0 */ val auto: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto with Double = js.native
    
    /* 1 */ val hD1080p: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p with Double = js.native
    
    /* 2 */ val hD720p: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p with Double = js.native
    
    /* 4 */ val ntsc: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc with Double = js.native
    
    /* 5 */ val pal: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal with Double = js.native
    
    /* 7 */ val qvga: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga with Double = js.native
    
    /* 6 */ val vga: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga with Double = js.native
    
    /* 3 */ val wvga: typingsSlinky.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga with Double = js.native
  }
}
