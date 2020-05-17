package typingsSlinky.winrtUwp.global.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides random access of data in input and output streams for a file. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
abstract class RandomAccessStreamReference ()
  extends typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  /**
    * Creates a random access stream around a file.
    * @param file The file to create a stream around.
    * @return The stream that encapsulates file.
    */
  def createFromFile(file: IStorageFile): typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  /**
    * Creates a random access stream around the specified stream.
    * @param stream The source stream.
    * @return The random access stream that encapsulates stream.
    */
  def createFromStream(stream: IRandomAccessStream): typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  /**
    * Creates a random access stream around the specified URI.
    * @param uri The URI to create the stream around. The valid URI schemes are http, https, ms-appx, and ms-appdata.
    * @return The random access stream that encapsulates uri.
    */
  def createFromUri(uri: Uri): typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
}

