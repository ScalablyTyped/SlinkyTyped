package typingsSlinky.winrtUwp.global.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Media.Core.IMediaSource
import typingsSlinky.winrtUwp.Windows.Media.Core.MseStreamSource
import typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
abstract class MediaSource ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource
object MediaSource {
  
  /**
    * Creates an instance of MediaSource from the provided AdaptiveMediaSource .
    * @param mediaSource The AdaptiveMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromAdaptiveMediaSource")
  @js.native
  def createFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromIMediaSource")
  @js.native
  def createFromIMediaSource(mediaSource: IMediaSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMediaBinder")
  @js.native
  def createFromMediaBinder(binder: typingsSlinky.winrtUwp.Windows.Media.Core.MediaBinder): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMediaStreamSource")
  @js.native
  def createFromMediaStreamSource(mediaSource: typingsSlinky.winrtUwp.Windows.Media.Core.MediaStreamSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromMseStreamSource")
  @js.native
  def createFromMseStreamSource(mediaSource: MseStreamSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStorageFile")
  @js.native
  def createFromStorageFile(file: IStorageFile): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStream")
  @js.native
  def createFromStream(stream: IRandomAccessStream, contentType: String): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromStreamReference")
  @js.native
  def createFromStreamReference(stream: IRandomAccessStreamReference, contentType: String): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaSource.createFromUri")
  @js.native
  def createFromUri(uri: Uri): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
}
