package typingsSlinky.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileEntry extends IEntry {
  /** [Method] Requests a File Handle from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the byte offset into the file at which the next read write will occur
  		* @returns Number The file offset.
  		*/
  var getOffset: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Reads the data from the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var read: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the byte offset into the file at which the next read write will occur
  		* @param config Object The object which contains the following config options:
  		*/
  var seek: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Truncates or extends the file to the specified size in bytes
  		* @param config Object The object which contains the following config options:
  		*/
  var truncate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Writes the data to the file starting at the file offset
  		* @param config Object The object which contains the following config options:
  		*/
  var write: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IFileEntry {
  @scala.inline
  def apply(): IFileEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileEntry]
  }
  @scala.inline
  implicit class IFileEntryOps[Self <: IFileEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEntry(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSeek(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

