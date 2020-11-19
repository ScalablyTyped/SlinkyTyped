package typingsSlinky.winrtUwp.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStreamReference
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file. Provides information about the file and its contents, and ways to manipulate them. */
@js.native
trait IStorageFile
  extends IStorageItem
     with IRandomAccessStreamReference
     with IInputStreamReference {
  
  /** Gets the MIME type of the contents of the file. */
  var contentType: String = js.native
  
  /**
    * Replaces the specified file with a copy of the current file.
    * @param fileToReplace The file to replace.
    * @return No object or value is returned when this method completes.
    */
  def copyAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Creates a copy of the file in the specified folder.
    * @param destinationFolder The destination folder where the copy is created.
    * @return When this method completes, it returns a StorageFile that represents the copy.
    */
  def copyAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a copy of the file in the specified folder, using the desired name.
    * @param destinationFolder The destination folder where the copy is created.
    * @param desiredNewName The desired name of the copy.
    * @return When this method completes, it returns a StorageFile that represents the copy.
    */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a copy of the file in the specified folder, using the desired name. This method also specifies what to do if an existing file in the specified folder has the same name.
    * @param destinationFolder The destination folder where the copy is created.
    * @param desiredNewName The desired name of the copy.
    * @param option An enum value that determines how Windows responds if the desiredNewName is the same as the name of an existing file in the destination folder.
    * @return When this method completes, it returns a StorageFile that represents the copy.
    */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Gets the type (file name extension) of the file. */
  var fileType: String = js.native
  
  /**
    * Moves the current file to the location of the specified file and replaces the specified file in that location.
    * @param fileToReplace The file to replace.
    * @return No object or value is returned by this method.
    */
  def moveAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Moves the current file to the specified folder.
    * @param destinationFolder The destination folder where the file is moved.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncAction = js.native
  /**
    * Moves the current file to the specified folder and renames the file according to the desired name.
    * @param destinationFolder The destination folder where the file is moved.
    * @param desiredNewName The desired name of the file after it is moved.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Moves the current file to the specified folder and renames the file according to the desired name. This method also specifies what to do if a file with the same name already exists in the specified folder.
    * @param destinationFolder The destination folder where the file is moved.
    * @param desiredNewName The desired name of the file after it is moved.
    * @param option An enum value that determines how Windows responds if the desiredNewName is the same as the name of an existing file in the destination folder.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
  
  /**
    * Opens a random-access stream over the file.
    * @param accessMode The type of access to allow.
    * @return When this method completes, it returns the random-access stream (type IRandomAccessStream ).
    */
  def openAsync(accessMode: FileAccessMode): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  /**
    * Opens a random-access stream over the file.
    * @param accessMode One of the enumeration values that specifies the type of access to allow.
    * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
    * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
    */
  def openAsync(accessMode: FileAccessMode, options: StorageOpenOptions): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  
  /**
    * Opens a transacted, random-access stream for writing to the file.
    * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
    */
  def openTransactedWriteAsync(): IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
  /**
    * Opens a random-access stream to the file that can be used for transacted-write operations with the specified options.
    * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
    * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
    */
  def openTransactedWriteAsync(options: StorageOpenOptions): IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
}
