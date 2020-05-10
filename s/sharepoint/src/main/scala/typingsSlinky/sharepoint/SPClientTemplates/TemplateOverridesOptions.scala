package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOverridesOptions extends js.Object {
  /** Base view ID (SPView.BaseViewID) for which the template should be applied.
    If not defined, the templates will be applied to all views. */
  var BaseViewID: js.UndefOr[Double | String] = js.native
  /** List template type (SPList.BaseTemplate) for which the template should be applied.
    If not defined, the templates will be applied to all lists. */
  var ListTemplateType: js.UndefOr[Double] = js.native
  /** Callbacks called after rendered html inserted into DOM. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  /** Callbacks called before rendering starts. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  /** Template overrides */
  var Templates: js.UndefOr[TemplateOverrides] = js.native
  /** View style (SPView.StyleID) for which the templates should be applied.
    If not defined, the templates will be applied only to default view style. */
  var ViewStyle: js.UndefOr[Double] = js.native
}

object TemplateOverridesOptions {
  @scala.inline
  def apply(): TemplateOverridesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverridesOptions]
  }
  @scala.inline
  implicit class TemplateOverridesOptionsOps[Self <: TemplateOverridesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseViewID(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseViewID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseViewID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseViewID")(js.undefined)
        ret
    }
    @scala.inline
    def withListTemplateType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListTemplateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListTemplateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListTemplateType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPostRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPostRender(value: RenderCallback | js.Array[RenderCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPostRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPostRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPostRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPreRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPreRender(value: RenderCallback | js.Array[RenderCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPreRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPreRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: TemplateOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Templates")(js.undefined)
        ret
    }
    @scala.inline
    def withViewStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewStyle")(js.undefined)
        ret
    }
  }
  
}

