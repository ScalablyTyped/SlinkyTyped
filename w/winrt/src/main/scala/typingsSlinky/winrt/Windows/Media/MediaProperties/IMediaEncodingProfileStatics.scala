package typingsSlinky.winrt.Windows.Media.MediaProperties

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaEncodingProfileStatics extends StObject {
  
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile] = js.native
  
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile] = js.native
  
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
  
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
}
object IMediaEncodingProfileStatics {
  
  @scala.inline
  def apply(
    createFromFileAsync: IStorageFile => IAsyncOperation[MediaEncodingProfile],
    createFromStreamAsync: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile],
    createM4a: AudioEncodingQuality => MediaEncodingProfile,
    createMp3: AudioEncodingQuality => MediaEncodingProfile,
    createMp4: VideoEncodingQuality => MediaEncodingProfile,
    createWma: AudioEncodingQuality => MediaEncodingProfile,
    createWmv: VideoEncodingQuality => MediaEncodingProfile
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal(createFromFileAsync = js.Any.fromFunction1(createFromFileAsync), createFromStreamAsync = js.Any.fromFunction1(createFromStreamAsync), createM4a = js.Any.fromFunction1(createM4a), createMp3 = js.Any.fromFunction1(createMp3), createMp4 = js.Any.fromFunction1(createMp4), createWma = js.Any.fromFunction1(createWma), createWmv = js.Any.fromFunction1(createWmv))
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
  
  @scala.inline
  implicit class IMediaEncodingProfileStaticsMutableBuilder[Self <: IMediaEncodingProfileStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFromFileAsync(value: IStorageFile => IAsyncOperation[MediaEncodingProfile]): Self = StObject.set(x, "createFromFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile]): Self = StObject.set(x, "createFromStreamAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateM4a(value: AudioEncodingQuality => MediaEncodingProfile): Self = StObject.set(x, "createM4a", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMp3(value: AudioEncodingQuality => MediaEncodingProfile): Self = StObject.set(x, "createMp3", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateMp4(value: VideoEncodingQuality => MediaEncodingProfile): Self = StObject.set(x, "createMp4", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWma(value: AudioEncodingQuality => MediaEncodingProfile): Self = StObject.set(x, "createWma", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWmv(value: VideoEncodingQuality => MediaEncodingProfile): Self = StObject.set(x, "createWmv", js.Any.fromFunction1(value))
  }
}
