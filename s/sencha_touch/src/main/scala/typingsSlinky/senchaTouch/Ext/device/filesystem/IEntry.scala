package typingsSlinky.senchaTouch.Ext.device.filesystem

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntry extends IBase {
  /** [Method] Works the same way as moveTo but copies the entry
  		* @param config Object
  		*/
  var copyTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the file system on which the entry resides
  		* @returns Ext.device.filesystem.FileSystem The entry file system.
  		*/
  var getFileSystem: js.UndefOr[js.Function0[IFileSystem]] = js.native
  /** [Method] Returns the full absolute path from the root to the entry
  		* @returns String The entry full path.
  		*/
  var getFullPath: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the name of the entry excluding the path leading to it
  		* @returns String The entry name.
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Looks up the parent directory containing the entry
  		* @param config Object The object which contains the following config options:
  		*/
  var getParent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns whether the entry is a directory
  		* @returns Boolean The entry is a directory.
  		*/
  var isDirectory: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns whether the entry is a file
  		* @returns Boolean The entry is a file.
  		*/
  var isFile: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Moves the entry to a different location on the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var moveTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes the entry from the file system
  		* @param config Object The object which contains the following config options:
  		*/
  var remove: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IEntry {
  @scala.inline
  def apply(): IEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntry]
  }
  @scala.inline
  implicit class IEntryOps[Self <: IEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFileSystem(value: () => IFileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFullPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFullPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirectory(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

