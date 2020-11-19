package typingsSlinky.tizenCommonWeb.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileFilter extends js.Object {
  
  /**
    * The File created attribute filter.
    * Files with created date earlier than this attribute or equal to it match the filtering criteria.
    */
  var endCreated: js.Date = js.native
  
  /**
    * The File modified attribute filter.
    * Files with modified date earlier than this attribute or equal to it match the filtering criteria.
    */
  var endModified: js.Date = js.native
  
  /**
    * If true match only directories, If false do not match directories.
    * May be undefined.
    * @since 5.0
    */
  var isDirectory: Boolean = js.native
  
  /**
    * If true match only files. If false do not match files.
    * May be undefined.
    * @since 5.0
    */
  var isFile: Boolean = js.native
  
  /**
    * The File name attribute filter.
    * Files that have a name that corresponds with this attribute (either exactly or with the specified wildcards) match this filtering criteria.
    */
  var name: String = js.native
  
  /**
    * The File created attribute filter.
    * Files with created date later than this attribute or equal to it match the filtering criteria.
    */
  var startCreated: js.Date = js.native
  
  /**
    * The File modified attribute filter.
    * Files with modified date later than this attribute or equal to it match the filtering criteria.
    */
  var startModified: js.Date = js.native
}
object FileFilter {
  
  @scala.inline
  def apply(
    endCreated: js.Date,
    endModified: js.Date,
    isDirectory: Boolean,
    isFile: Boolean,
    name: String,
    startCreated: js.Date,
    startModified: js.Date
  ): FileFilter = {
    val __obj = js.Dynamic.literal(endCreated = endCreated.asInstanceOf[js.Any], endModified = endModified.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startCreated = startCreated.asInstanceOf[js.Any], startModified = startModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileFilter]
  }
  
  @scala.inline
  implicit class FileFilterOps[Self <: FileFilter] (val x: Self) extends AnyVal {
    
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
    def setEndCreated(value: js.Date): Self = this.set("endCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndModified(value: js.Date): Self = this.set("endModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCreated(value: js.Date): Self = this.set("startCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartModified(value: js.Date): Self = this.set("startModified", value.asInstanceOf[js.Any])
  }
}
