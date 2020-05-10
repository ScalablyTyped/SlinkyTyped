package typingsSlinky.senchaTouch.Ext.device.filesystem

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileSystem extends IBase {
  /** [Method] Returns a Ext device filesystem DirectoryEntry instance for the root of the file system
  		* @returns Ext.device.filesystem.DirectoryEntry The file system root directory.
  		*/
  var getRoot: js.UndefOr[js.Function0[IDirectoryEntry]] = js.native
}

object IFileSystem {
  @scala.inline
  def apply(): IFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileSystem]
  }
  @scala.inline
  implicit class IFileSystemOps[Self <: IFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRoot(value: () => IDirectoryEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.undefined)
        ret
    }
  }
  
}

