package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContext extends js.Object {
  var BaseViewID: js.UndefOr[Double] = js.native
  var ControlMode: js.UndefOr[ClientControlMode] = js.native
  var CurrentCultureName: js.UndefOr[String] = js.native
  var CurrentLanguage: js.UndefOr[Double] = js.native
  var CurrentSelectedItems: js.UndefOr[js.Any] = js.native
  var CurrentUICultureName: js.UndefOr[String] = js.native
  var ListTemplateType: js.UndefOr[Double] = js.native
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  var RenderBody: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderFieldByName: js.UndefOr[js.Function2[/* renderContext */ this.type, /* fieldName */ String, String]] = js.native
  var RenderFields: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderFooter: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderGroups: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderHeader: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderItems: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var RenderView: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  var SiteClientTag: js.UndefOr[String] = js.native
  var Templates: js.UndefOr[typingsSlinky.sharepoint.SPClientTemplates.Templates] = js.native
  var onRefreshFailed: js.UndefOr[js.Any] = js.native
}

object RenderContext {
  @scala.inline
  def apply(): RenderContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderContext]
  }
  @scala.inline
  implicit class RenderContextOps[Self <: RenderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseViewID(value: Double): Self = {
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
    def withControlMode(value: ClientControlMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentCultureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentCultureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCultureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentCultureName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLanguage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentSelectedItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSelectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentUICultureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUICultureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentUICultureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUICultureName")(js.undefined)
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
    def withRenderBody(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFieldByName(value: (RenderContext, /* fieldName */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFieldByName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderFieldByName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFieldByName")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFields(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooter(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderGroups(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeader(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItems(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderView(value: RenderContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderView")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteClientTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteClientTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteClientTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteClientTag")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: Templates): Self = {
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
    def withOnRefreshFailed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefreshFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRefreshFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefreshFailed")(js.undefined)
        ret
    }
  }
  
}

