package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentSyncOptions extends js.Object {
  /**
    * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
    * and TextDocumentSyncKind.Incremental.
    */
  var change: js.UndefOr[TextDocumentSyncKind] = js.native
  /**
    * Open and close notifications are sent to the server.
    */
  var openClose: js.UndefOr[Boolean] = js.native
  /**
    * Save notifications are sent to the server.
    */
  var save: js.UndefOr[SaveOptions] = js.native
  /**
    * Will save notifications are sent to the server.
    */
  var willSave: js.UndefOr[Boolean] = js.native
  /**
    * Will save wait until requests are sent to the server.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.native
}

object TextDocumentSyncOptions {
  @scala.inline
  def apply(): TextDocumentSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentSyncOptions]
  }
  @scala.inline
  implicit class TextDocumentSyncOptionsOps[Self <: TextDocumentSyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: TextDocumentSyncKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: SaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withWillSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSave")(js.undefined)
        ret
    }
    @scala.inline
    def withWillSaveWaitUntil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSaveWaitUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillSaveWaitUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSaveWaitUntil")(js.undefined)
        ret
    }
  }
  
}

