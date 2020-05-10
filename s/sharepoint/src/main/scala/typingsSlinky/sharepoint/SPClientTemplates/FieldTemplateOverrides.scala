package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTemplateOverrides extends js.Object {
  /** Defines templates for rendering the field on a display form. */
  var DisplayForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on an edit form. */
  var EditForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on a new form. */
  var NewForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on a list view. */
  var View: js.UndefOr[FieldInViewCallback] = js.native
}

object FieldTemplateOverrides {
  @scala.inline
  def apply(): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
  @scala.inline
  implicit class FieldTemplateOverridesOps[Self <: FieldTemplateOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisplayForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayForm")(js.undefined)
        ret
    }
    @scala.inline
    def withEditForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditForm")(js.undefined)
        ret
    }
    @scala.inline
    def withNewForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNewForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewForm")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: /* renderContext */ RenderContextFieldInView => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(js.undefined)
        ret
    }
  }
  
}

