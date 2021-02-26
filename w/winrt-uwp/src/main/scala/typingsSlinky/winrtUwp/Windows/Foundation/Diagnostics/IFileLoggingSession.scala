package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the destination of logged messages from LoggingChannel instances. */
@js.native
trait IFileLoggingSession extends IClosable {
  
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  /**
    * Adds a logging channel with the specified logging level to the current logging session.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The logging level for loggingChannel.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): Unit = js.native
  
  /**
    * Ends the current logging session and saves it to a file.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def closeAndSaveToFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Gets the name of the logging session. */
  var name: String = js.native
  
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
}
