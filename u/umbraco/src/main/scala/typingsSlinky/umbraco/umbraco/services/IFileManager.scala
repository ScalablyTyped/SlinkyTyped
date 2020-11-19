package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.fileManager
  * @function
  *
  * @description
  * Used by editors to manage any files that require uploading with the posted data, normally called by property editors
  * that need to attach files.
  * When a route changes successfully, we ensure that the collection is cleared.
  */
@js.native
trait IFileManager extends js.Object {
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#clearFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Removes all files from the manager
    */
  def clearFiles(): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#getFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Returns all of the files attached to the file manager
    */
  def getFiles(): js.Array[IFile] = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#addFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Attaches files to the current manager for the current editor for a particular property, if an empty array is set
    *   for the files collection that effectively clears the files for the specified editor.
    */
  def setFiles(propertyAlias: String, files: js.Array[IFile]): Unit = js.native
}
object IFileManager {
  
  @scala.inline
  def apply(
    clearFiles: () => Unit,
    getFiles: () => js.Array[IFile],
    setFiles: (String, js.Array[IFile]) => Unit
  ): IFileManager = {
    val __obj = js.Dynamic.literal(clearFiles = js.Any.fromFunction0(clearFiles), getFiles = js.Any.fromFunction0(getFiles), setFiles = js.Any.fromFunction2(setFiles))
    __obj.asInstanceOf[IFileManager]
  }
  
  @scala.inline
  implicit class IFileManagerOps[Self <: IFileManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearFiles(value: () => Unit): Self = this.set("clearFiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFiles(value: () => js.Array[IFile]): Self = this.set("getFiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFiles(value: (String, js.Array[IFile]) => Unit): Self = this.set("setFiles", js.Any.fromFunction2(value))
  }
}
