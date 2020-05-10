package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for this class
  *
  * @param [content=undefined]
  *        Provide customized content for this modal.
  *
  * @param [description]
  *        A text description for the modal, primarily for accessibility.
  *
  * @param [fillAlways=false]
  *        Normally, modals are automatically filled only the first time
  *        they open. This tells the modal to refresh its content
  *        every time it opens.
  *
  * @param [label]
  *        A text label for the modal, primarily for accessibility.
  *
  * @param [temporary=true]
  *        If `true`, the modal can only be opened once; it will be
  *        disposed as soon as it's closed.
  *
  * @param [uncloseable=false]
  *        If `true`, the user will not be able to close the modal
  *        through the UI in the normal ways. Programmatic closing is
  *        still possible.
  */
@js.native
trait ModalDialogOptions extends ComponentOptions {
  var content: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var fillAlways: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
  var uncloseable: js.UndefOr[Boolean] = js.native
}

object ModalDialogOptions {
  @scala.inline
  def apply(): ModalDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogOptions]
  }
  @scala.inline
  implicit class ModalDialogOptionsOps[Self <: ModalDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFillAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(js.undefined)
        ret
    }
    @scala.inline
    def withUncloseable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncloseable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncloseable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncloseable")(js.undefined)
        ret
    }
  }
  
}

