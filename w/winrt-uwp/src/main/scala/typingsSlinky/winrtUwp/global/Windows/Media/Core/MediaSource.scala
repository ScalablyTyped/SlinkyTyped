package typingsSlinky.winrtUwp.global.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Media.Core.IMediaSource
import typingsSlinky.winrtUwp.Windows.Media.Core.MseStreamSource
import typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
abstract class MediaSource ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource

/* static members */
@JSGlobal("Windows.Media.Core.MediaSource")
@js.native
object MediaSource extends js.Object {
  /**
    * Creates an instance of MediaSource from the provided AdaptiveMediaSource .
    * @param mediaSource The AdaptiveMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromIMediaSource(mediaSource: IMediaSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  def createFromMediaBinder(binder: typingsSlinky.winrtUwp.Windows.Media.Core.MediaBinder): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMediaStreamSource(mediaSource: typingsSlinky.winrtUwp.Windows.Media.Core.MediaStreamSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromMseStreamSource(mediaSource: MseStreamSource): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromStorageFile(file: IStorageFile): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStream(stream: IRandomAccessStream, contentType: String): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  def createFromStreamReference(stream: IRandomAccessStreamReference, contentType: String): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  def createFromUri(uri: Uri): typingsSlinky.winrtUwp.Windows.Media.Core.MediaSource = js.native
}

