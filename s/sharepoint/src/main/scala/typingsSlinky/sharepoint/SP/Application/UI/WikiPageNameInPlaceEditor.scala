package typingsSlinky.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WikiPageNameInPlaceEditor extends js.Object {
  def editingPageCallback(): Unit = js.native
  def savingPageCallback(): Unit = js.native
}

object WikiPageNameInPlaceEditor {
  @scala.inline
  def apply(editingPageCallback: () => Unit, savingPageCallback: () => Unit): WikiPageNameInPlaceEditor = {
    val __obj = js.Dynamic.literal(editingPageCallback = js.Any.fromFunction0(editingPageCallback), savingPageCallback = js.Any.fromFunction0(savingPageCallback))
    __obj.asInstanceOf[WikiPageNameInPlaceEditor]
  }
  @scala.inline
  implicit class WikiPageNameInPlaceEditorOps[Self <: WikiPageNameInPlaceEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditingPageCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingPageCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSavingPageCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingPageCallback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

