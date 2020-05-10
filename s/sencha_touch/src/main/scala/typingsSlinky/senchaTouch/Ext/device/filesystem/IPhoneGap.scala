package typingsSlinky.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhoneGap extends IHTML5 {
  /** [Method] Downloads a file from the server saving it into the Local File System
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Method]
  		* @param config Object
  		*/
  var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Send a file to a server
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Method]
  		* @param config Object
  		*/
  var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPhoneGap {
  @scala.inline
  def apply(): IPhoneGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPhoneGap]
  }
  @scala.inline
  implicit class IPhoneGapOps[Self <: IPhoneGap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: /* config */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withReadMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: /* config */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWriteMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMetadata")(js.undefined)
        ret
    }
  }
  
}

