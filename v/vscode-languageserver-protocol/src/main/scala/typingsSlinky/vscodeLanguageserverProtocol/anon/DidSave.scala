package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidSave extends js.Object {
  /**
    * The client supports did save notifications.
    */
  var didSave: js.UndefOr[Boolean] = js.native
  /**
    * Whether text document synchronization supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client supports sending will save notifications.
    */
  var willSave: js.UndefOr[Boolean] = js.native
  /**
    * The client supports sending a will save request and
    * waits for a response providing text edits which will
    * be applied to the document before it is saved.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.native
}

object DidSave {
  @scala.inline
  def apply(): DidSave = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidSave]
  }
  @scala.inline
  implicit class DidSaveOps[Self <: DidSave] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didSave")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
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

