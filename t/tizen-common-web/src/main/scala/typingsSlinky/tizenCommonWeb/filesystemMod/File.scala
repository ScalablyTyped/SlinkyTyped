package typingsSlinky.tizenCommonWeb.filesystemMod

import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.a
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.r
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.rw
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.rwo
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.w
import typingsSlinky.tizenCommonWeb.tizenMod.ErrorCallback
import typingsSlinky.tizenCommonWeb.tizenMod.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /**
    * Copies (and overwrites if possible and specified) a file or a
    *        directory from a specified location to another specified location.
    * The copy of the file or directory identified by the `originFilePath` parameter must be created in the path passed in the `destinationFilePath` parameter.
    * The file or directory to copy must be under the Directory from which the method is invoked, otherwise the operation must not be performed.
    * If the copy is performed successfully, the onsuccess() method is invoked.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `NotFoundError` - If the `originFilePath` does not correspond to a valid file or `destinationPath` is not a valid path.
    *   - `IOError` - If the file in which the copyTo() method is invoked is a file (and not a directory), `originFilePath` corresponds to a file or directory in use by another process, `overwrite` parameter is ***false*** and `destinationFilePath` corresponds to an existing file or directory.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param originFilePath      Origin full virtual file or directory path and it must be under the current directory.
    * @param destinationFilePath New full virtual file path or directory path.
    * @param overwrite           Attribute to determine whether overwriting is allowed or not
    *                            If set to ***true***, it enforces overwriting an existing file.
    * @param onsuccess           Callback method to be invoked when the file has been copied.
    * @param onerror             Callback method to be invoked when an error has occurred.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def copyTo(originFilePath: String, destinationFilePath: String, overwrite: Boolean): Unit = js.native
  def copyTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def copyTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: SuccessCallback
  ): Unit = js.native
  def copyTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  
  /**
    * Creates a new directory.
    * A new directory will be created relative to the current
    * directory that this operation is performed on. The implementation will attempt to
    * create all necessary sub-directories specified in the dirPath, as well. The use of "."
    * or ".." in path components is not supported.
    * This operation can only be performed on file handles that represent directories (that is, `isDirectory` == ***true***).
    * If the directory is successfully created, it will be returned.
    * In case the directory cannot be created, an error must be thrown with the appropriate error type.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param dirPath Relative directory path and it only contains characters supported by the underlying filesystem.
    * @returns File handle of the new directory.
    *              The new `File` object has "rw" access rights, as it inherits this from the `File` object on which the createDirectory() method is called.
    * @throw WebAPIException with error type IOError, InvalidValuesError, TypeMismatchError, SecurityError, UnknownError
    */
  def createDirectory(dirPath: String): File = js.native
  
  /**
    * Creates a empty new file in a specified location that is relative to the directory indicated by current `File` object's `path` attribute.
    * The use of "." or ".." in path components is not supported. This operation can only be performed on file handlers that represent a directory (that is, `isDirectory` == ***true***).
    * If the file is successfully created, a file handle must be returned by this method.
    * In case the file cannot be created, an error must be thrown with the appropriate error type.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param relativeFilePath New file path and it should only contain characters supported by the underlying filesystem.
    * @returns File handle for the new empty file.
    *              The new `File` object has "rw" access rights, as it inherits this from the `File` object on which the createFile() method is
    *              called.
    * @throw WebAPIException with error type IOError, InvalidValuesError, TypeMismatchError, SecurityError, UnknownError
    */
  def createFile(relativeFilePath: String): File = js.native
  
  /**
    * The timestamp when a file is first created in the filesystem.
    * This timestamp is equivalent to the timestamp when a call to createFile() succeeds.
    * If the platform does not support this attribute, it will
    * be ***null***.
    * It is unspecified and platform-dependent if the creation
    * timestamp changes when a file is moved.
    * @note `deprecated` 5.0
    */
  val created: js.UndefOr[js.Date] = js.native
  
  /**
    * Deletes a specified directory and directory tree if specified.
    * This method attempts to asynchronously delete a directory or directory tree under the current directory.
    * If the `recursive` parameter is set to ***true***, all the directories and files under the specified directory must be deleted. If the `recursive` parameter is set to ***false***, the directory is only deleted if it is empty, otherwise an IOError error type will be passed in onerror().
    * If the deletion is performed successfully, the onsuccess() is invoked.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `NotFoundError` -If the passed directory does not correspond to a valid directory.
    *   - `IOError` - If the `File` in which the delete method is invoked is a file (and not a directory), the directory is in use by another process or the directory is not empty and `recursive` argument is ***false***.
    *    This code is also used if a recursive deletion partially fails and any data deleted so far cannot be recovered. This may occur due to the lack of filesystem permissions or if any directories or files are already opened by other processes.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param directoryPath Full virtual path to the directory to delete (must be under the current one).
    * @param recursive     Flag indicating whether the deletion is recursive or not
    *                      When set to ***true*** recursive deletion is allowed. Also, this function deletes
    *                      all data in all subdirectories and so needs to be used with caution.
    * @param onsuccess     Callback method to be invoked when a directory is successfully deleted.
    * @param onerror       Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def deleteDirectory(directoryPath: String, recursive: Boolean): Unit = js.native
  def deleteDirectory(
    directoryPath: String,
    recursive: Boolean,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def deleteDirectory(directoryPath: String, recursive: Boolean, onsuccess: SuccessCallback): Unit = js.native
  def deleteDirectory(directoryPath: String, recursive: Boolean, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Deletes a specified file.
    * This function attempts to asynchronously delete a file under the current directory.
    * If the deletion is performed successfully, the onsuccess() is invoked.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `NotFoundError` - If the file does not correspond to a valid file.
    *   - `IOError` - If the file in which the delete() method is invoked is a file (not a directory), the file is in use by another process, or there is no permission in the file system.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param filePath  Full virtual path to the file to delete (must be under the current directory).
    * @param onsuccess Callback method to be invoked when the file is successfully deleted.
    * @param onerror   Callback method to be invoked when an error has occurred.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def deleteFile(filePath: String): Unit = js.native
  def deleteFile(filePath: String, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def deleteFile(filePath: String, onsuccess: SuccessCallback): Unit = js.native
  def deleteFile(filePath: String, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * The size of this file, in bytes.
    * If an attempt to read this attribute for a directory is made, ***undefined*** is returned. To retrieve the number of files and directories contained in the directory, use the `length` attribute.
    * @note `deprecated` 5.0
    */
  val fileSize: Double = js.native
  
  /**
    * The full path of a file.
    * It begins with the name of the root containing the file,
    * and including the name of the file or directory itself.
    * For instance, if the RockawayBeach.mp3 file is located at music/ramones/volume1/, then the `fullPath` is music/ramones/volume1/RockawayBeach.mp3.
    * For a directory, if the volume1 directory is located at music/ramones/, then the `fullPath` is music/ramones/volume1.
    * For the special case of the root itself, if the root is music, then the `fullPath` is music.
    * The `fullPath` is always equal to path + name.
    * @note `deprecated` 5.0
    */
  val fullPath: String = js.native
  
  /**
    * The flag indicating whether it is a directory.
    * This attribute can have the following values:
    *
    *   - ***true*** if this handle is a directory
    *   - ***false*** if this handle is a file
    *
    * @note `deprecated` 5.0
    */
  val isDirectory: Boolean = js.native
  
  /**
    * The flag indicating whether it is a file.
    * This attribute can have the following values:
    *
    *   - ***true*** if this handle is a file
    *   - ***false*** if this handle is a directory
    *
    * @note `deprecated` 5.0
    */
  val isFile: Boolean = js.native
  
  /**
    * The number of files and directories contained in a file handle.
    * If an attempt to read this attribute for a file is made, ***undefined*** is returned. To retrieve the size of a file, use the `fileSize` attribute.
    * @note `deprecated` 5.0
    */
  val length: Double = js.native
  
  /**
    * Lists all files in a directory.
    * The list of files is passed as a File[] in onsuccess() and contains directories and files. However, the directories "." and ".." must not be returned. Each `File` object that is part of the array must inherit all the access rights (that is, one of the values in FileMode) from the `File` object in which this method is invoked.
    * If the filter is passed and contains valid values, only those directories and files in the directory that match the filter criteria specified in the `FileFilter` interface must be returned in the onsuccess() method. If no filter is passed, the filter is ***null ***or ***undefined***, or the filter contains invalid values, the implementation must return the full list of files in the directory.
    * If the directory does not contain any files or directories, or the filter criteria do not match any files or directories, the onsuccess() is invoked with an empty array.
    * The ErrorCallback is launched with these error types:
    *
    *   - `IOError` - If the operation is launched on a file (not a directory).
    *   - `InvalidValuesError` - If any of the input parameters contain an invalid value.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param onsuccess Callback method to be invoked when the list operation has been successfully completed.
    * @param onerror   Callback method to be invoked when an error has occurred.
    * @param filter    Criteria to restrict the listed files.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def listFiles(onsuccess: FileArraySuccessCallback): Unit = js.native
  def listFiles(onsuccess: FileArraySuccessCallback, onerror: js.UndefOr[scala.Nothing], filter: FileFilter): Unit = js.native
  def listFiles(onsuccess: FileArraySuccessCallback, onerror: ErrorCallback): Unit = js.native
  def listFiles(onsuccess: FileArraySuccessCallback, onerror: ErrorCallback, filter: FileFilter): Unit = js.native
  
  /**
    * The timestamp when the most recent modification is made to a file, usually when the last write operation succeeds.
    * Opening a file for reading does not change the modification timestamp.
    * If the platform does not support this attribute, it will be ***null***.
    * It is unspecified and platform-dependent if the modified
    * timestamp changes when a file is moved.
    * @note `deprecated` 5.0
    */
  val modified: js.UndefOr[js.Date] = js.native
  
  /**
    * Moves (and overwrites if possible and specified) a file or a directory from a specified location to another.
    *  This operation is different from instantiating copyTo() and then deleting the original file, as on certain platforms, this operation does not require extra disk space.
    * The file or directory identified by the `originFilePath` parameter is moved to the path passed in the `destinationFilePath` parameter.
    * The file to move must be under the directory from which the method is invoked, else the operation can not be performed.
    * If the file or directory is moved successfully, the onsuccess() method is invoked.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `NotFoundError` - If `originFilePath` does not correspond to a valid file or `destinationPath` is not a valid path.
    *   - `IOError` - If the `File` in which the moveTo() method is invoked is a file (not a directory), `originFilePath` corresponds to a file or directory in use by another process, overwrite parameter is ***false*** and `destinationFilePath` corresponds to an existing file or directory.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param originFilePath      Origin full virtual file or directory path and it must be under the current directory.
    * @param destinationFilePath New full virtual file path or directory path.
    * @param overwrite           Flag indicating whether to overwrite an existing file.
    *                            When set to ***true***, the files can be overwritten.
    * @param onsuccess           Callback method to be invoked when the file has been moved.
    * @param onerror             Callback method to be invoked when an error has occurred.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def moveTo(originFilePath: String, destinationFilePath: String, overwrite: Boolean): Unit = js.native
  def moveTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def moveTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: SuccessCallback
  ): Unit = js.native
  def moveTo(
    originFilePath: String,
    destinationFilePath: String,
    overwrite: Boolean,
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  
  /**
    * The file name after excluding the root name and any path components.
    * This is the name of this file, excluding the root name and any other path components.
    * For example, if a file is located at
    * music/ramones/volume1/RockawayBeach.mp3, the `name`  is "RockawayBeach.mp3".
    * For example, if a directory is located at music/ramones/volume1, the
    * `name`  is be "volume1".
    * For the special case of the root itself, the `name`  is an empty string.
    * @note `deprecated` 5.0
    */
  val name: String = js.native
  
  /**
    * Opens the file in the given mode supporting a specified encoding.
    * This operation is performed asynchronously. If the file is opened successfully, the onsuccess() method is invoked with a `FileStream` that can be used for reading and writing the file, depending on the mode. The returned `FileStream` instance includes a file pointer, which represents the current position in the file. The file pointer, by default, is at the start of the file, except in the case of opening a file in append ("a") mode, in which case the file pointer points to the end of the file.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `IOError` - The operation is launched on a directory (not a file), the file is not valid or it does not exist.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param mode      Mode in which the file is opened
    *                  **"r"** for reading
    *                  **"a"** for appending
    *                  **"w"** for [over]writing
    *                  **"rw"** for reading and writing
    * @param onsuccess Callback method to be invoked when a file has been opened.
    * @param onerror   Callback method to be invoked when an error has occurred.
    * @param encoding  Encoding to use for read/write operations on the file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" latin1 encoding
    *                  If no encoding is passed by the developer, then the default platform encoding must be used.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def openStream(mode: FileMode, onsuccess: FileStreamSuccessCallback): Unit = js.native
  def openStream(
    mode: FileMode,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  def openStream(mode: FileMode, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def openStream(mode: FileMode, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  @JSName("openStream")
  def openStream_a(mode: a, onsuccess: FileStreamSuccessCallback): Unit = js.native
  @JSName("openStream")
  def openStream_a(
    mode: a,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  @JSName("openStream")
  def openStream_a(mode: a, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  @JSName("openStream")
  def openStream_a(mode: a, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  @JSName("openStream")
  def openStream_r(mode: r, onsuccess: FileStreamSuccessCallback): Unit = js.native
  @JSName("openStream")
  def openStream_r(
    mode: r,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  @JSName("openStream")
  def openStream_r(mode: r, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  @JSName("openStream")
  def openStream_r(mode: r, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  @JSName("openStream")
  def openStream_rw(mode: rw, onsuccess: FileStreamSuccessCallback): Unit = js.native
  @JSName("openStream")
  def openStream_rw(
    mode: rw,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  @JSName("openStream")
  def openStream_rw(mode: rw, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  @JSName("openStream")
  def openStream_rw(mode: rw, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  @JSName("openStream")
  def openStream_rwo(mode: rwo, onsuccess: FileStreamSuccessCallback): Unit = js.native
  @JSName("openStream")
  def openStream_rwo(
    mode: rwo,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  @JSName("openStream")
  def openStream_rwo(mode: rwo, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  @JSName("openStream")
  def openStream_rwo(mode: rwo, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  @JSName("openStream")
  def openStream_w(mode: w, onsuccess: FileStreamSuccessCallback): Unit = js.native
  @JSName("openStream")
  def openStream_w(
    mode: w,
    onsuccess: FileStreamSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    encoding: String
  ): Unit = js.native
  @JSName("openStream")
  def openStream_w(mode: w, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback): Unit = js.native
  @JSName("openStream")
  def openStream_w(mode: w, onsuccess: FileStreamSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  
  /**
    * The parent directory handle.
    * This attribute is set to ***null*** if there is no parent directory. This also implies that this directory represents a root location.
    * @note `deprecated` 5.0
    */
  val parent: js.UndefOr[File] = js.native
  
  /**
    * The path of a file after excluding its file name.
    * It begins with the name of the root containing the file, followed by the path, including the directory containing the file, but excluding the file name.
    * Except in some special cases of the File representing the root itself, the last
    * character is always "/".
    * For example, if a file is located at music/ramones/volume1/RockawayBeach.mp3,
    * the path is music/ramones/volume1/.
    * For example, if a directory is located at music/ramones/volume1, the path is
    * music/ramones/.
    * For the virtual roots, the path is same as the name of the virtual root.
    * For example, if the root is music, then the path is music. If the root is documents, then the path is documents.
    * @note `deprecated` 5.0
    */
  val path: String = js.native
  
  /**
    * Reads the content of a file as a DOMString.
    * If the operation is successfully executed, the onsuccess() method is invoked and a DOMString is passed as input parameter that represents the file content in the format determined by the `encoding` parameter.
    * The ErrorCallback is launched with these error types:
    *
    *   - `InvalidValuesError` - If any of the input parameters contains an invalid value.
    *   - `IOError` - If the operation is launched on a directory (not a file), the file is not valid, or the file does not exist.
    *   - `UnknownError` - If any other error occurs.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param onsuccess Callback method to be invoked when a file has been successfully read.
    * @param onerror   Callback method to be invoked when an error occurs while reading a file.
    * @param encoding  Encoding for read/write operations on a file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" latin1 encoding
    *                  If no encoding is passed by the developer, then the default platform encoding must be used.
    * @throw WebAPIException TypeMismatchError, SecurityError
    */
  def readAsText(onsuccess: FileStringSuccessCallback): Unit = js.native
  def readAsText(onsuccess: FileStringSuccessCallback, onerror: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def readAsText(onsuccess: FileStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readAsText(onsuccess: FileStringSuccessCallback, onerror: ErrorCallback, encoding: String): Unit = js.native
  
  /**
    * The file/directory access state in the filesystem.
    * This attribute is set to:
    *
    *   - ***true*** - if object has read-only access at its location.
    *   - ***false*** - if object has write access at its location.
    *
    * This attribute represents the actual state of a file or directory in the filesystem. Its value is not affected by the mode used in FileSystemManager.resolve() that was used to create the `File` object from which this `File` object was obtained.
    * @note `deprecated` 5.0
    */
  val readOnly: Boolean = js.native
  
  /**
    * Resolves an existing file or directory relative to the current directory this operation is performed on and returns a file handle for it.
    * The `filePath` is not allowed to contain the "." or ".." directory entries inside its value.
    * The encoding of file paths is [UTF-8](http://www.ietf.org/rfc/rfc2279.txt).
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param filePath Relative file path or file URI to resolve.
    * @returns File handle of the file.
    *              The new `File` object inherits its access rights from the `File` object on which this resolve() method is called.
    * @throw WebAPIException with error type TypeMismatchError, InvalidValuesError, IOError, NotFoundError, SecurityError, UnknownError
    */
  def resolve(filePath: String): File = js.native
  
  /**
    * Returns a URI for a file to identify an entry (such as using it as the src attribute on an HTML img element).
    *        The URI has no specific expiration, it should be valid at least as long as the file exists.
    * If that URI corresponds to any of the public virtual roots (that is
    * images, videos, music, documents and downloads) the URI
    * must be globally unique and could be used by any widget.
    * If that URI corresponds to a file located in any a widget's private areas (such as wgt-package, wgt-private, wgt-private-tmp),
    * the generated URI must be unique for that file and for the widget making the request (such as including some derived from the widget ID in the URI).
    * These URIs must not be accessible to other widgets, apart from the one invoking this method.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @returns URI that identifies the file or ***null*** if an error occurs.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see `Storage privileges`.
    * @throw WebAPIException with error type UnknownError, if any other error occurred.
    */
  def toURI(): String = js.native
}
