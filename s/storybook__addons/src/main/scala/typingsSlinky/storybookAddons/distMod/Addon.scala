package typingsSlinky.storybookAddons.distMod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.typesMod.Types_
import typingsSlinky.storybookRouter.routerMod.RenderData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addon extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `match`: js.UndefOr[js.Function1[/* matchOptions */ RenderData, Boolean]] = js.native
  
  var paramKey: js.UndefOr[String] = js.native
  
  def render(renderOptions: RenderOptions): ReactElement = js.native
  
  var route: js.UndefOr[js.Function1[/* routeOptions */ RenderData, String]] = js.native
  
  var title: js.Function0[String] | String = js.native
  
  var `type`: js.UndefOr[Types_] = js.native
}
object Addon {
  
  @scala.inline
  def apply(render: RenderOptions => ReactElement, title: js.Function0[String] | String): Addon = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
  
  @scala.inline
  implicit class AddonOps[Self <: Addon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRender(value: RenderOptions => ReactElement): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: js.Function0[String] | String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMatch(value: /* matchOptions */ RenderData => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setParamKey(value: String): Self = this.set("paramKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamKey: Self = this.set("paramKey", js.undefined)
    
    @scala.inline
    def setRoute(value: /* routeOptions */ RenderData => String): Self = this.set("route", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setType(value: Types_): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
