package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOverrides extends js.Object {
   // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | String] = js.native
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplateMap] = js.native
  /** Defines template for rendering list view footer.
    Can be either string or SingleTemplateCallback */
  var Footer: js.UndefOr[SingleTemplateCallback | String] = js.native
   // TODO: determine appropriate context type and purpose of this template
  /** Defines templates for rendering groups (aggregations). */
  var Group: js.UndefOr[GroupCallback | String] = js.native
  /** Defines template for rendering list view header.
    Can be either string or SingleTemplateCallback */
  var Header: js.UndefOr[SingleTemplateCallback | String] = js.native
  /** Defines templates for list items rendering. */
  var Item: js.UndefOr[ItemCallback | String] = js.native
  var View: js.UndefOr[RenderCallback | String] = js.native
}

object TemplateOverrides {
  @scala.inline
  def apply(): TemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverrides]
  }
  @scala.inline
  implicit class TemplateOverridesOps[Self <: TemplateOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyFunction1(value: /* ctx */ RenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBody(value: RenderCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: FieldTemplateMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFunction1(value: /* renderContext */ RenderContextInView => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFooter(value: SingleTemplateCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupFunction1(value: /* renderContext */ RenderContextGroupInView => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroup(value: GroupCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFunction1(value: /* renderContext */ RenderContextInView => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeader(value: SingleTemplateCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(js.undefined)
        ret
    }
    @scala.inline
    def withItemFunction1(value: /* renderContext */ RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: ItemCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
    @scala.inline
    def withViewFunction1(value: /* ctx */ RenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withView(value: RenderCallback | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
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

