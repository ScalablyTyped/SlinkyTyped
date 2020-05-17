package typingsSlinky.winrtUwp.global.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of timed text data. */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
abstract class TimedTextSource ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSource

/* static members */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
object TimedTextSource extends js.Object {
  /**
    * Creates a new instance of TimedTextSource from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @return The new timed text source.
    */
  def createFromStream(stream: IRandomAccessStream): typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  def createFromStream(stream: IRandomAccessStream, defaultLanguage: String): typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @return The new timed text source.
    */
  def createFromUri(uri: Uri): typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  def createFromUri(uri: Uri, defaultLanguage: String): typingsSlinky.winrtUwp.Windows.Media.Core.TimedTextSource = js.native
}

