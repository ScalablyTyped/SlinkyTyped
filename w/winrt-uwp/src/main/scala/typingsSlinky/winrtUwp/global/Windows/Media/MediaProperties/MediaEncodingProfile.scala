package typingsSlinky.winrtUwp.global.Windows.Media.MediaProperties

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
/** Creates a new instance of the MediaEncodingProfile class. */
class MediaEncodingProfile ()
  extends typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
/* static members */
@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
object MediaEncodingProfile extends js.Object {
  
  /**
    * Creates an instance of MediaEncodingProfile for AVI.
    * @param quality The video quality.
    * @return The media encoding profile.
    */
  def createAvi(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an encoding profile from an existing media file.
    * @param file The media file from which to create the profile.
    * @return An object that is used to control the asynchronous operation.
    */
  def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
  
  /**
    * Creates an encoding profile from a stream that contains media data.
    * @param stream The media stream from which to create the profile.
    * @return An object that is used to control the asynchronous operation.
    */
  def createFromStreamAsync(stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile] = js.native
  
  /**
    * Creates an encoding profile for AAC audio.
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createM4a(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an encoding profile for MP3 (MPEG-1 layer 3) audio.
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createMp3(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an encoding profile for H.264 video.
    * @param quality Specifies the video resolution of the profile.
    * @return Returns a media encoding profile.
    */
  def createMp4(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an instance of MediaEncodingProfile for WAV
    * @param quality The audio encoding quality.
    * @return The media encoding profile.
    */
  def createWav(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an encoding profile for Windows Media Audio (WMA).
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createWma(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
  
  /**
    * Creates an encoding profile for Windows Media Video (WMV).
    * @param quality Specifies the video resolution of the profile.
    * @return Returns a media encoding profile.
    */
  def createWmv(quality: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.VideoEncodingQuality): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile = js.native
}
