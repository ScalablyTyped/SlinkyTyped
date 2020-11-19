package typingsSlinky.wouter.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wouter.matcherMod.DefaultParams
import typingsSlinky.wouter.matcherMod.Params
import typingsSlinky.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteProps[T /* <: DefaultParams */] extends js.Object {
  
  var children: js.UndefOr[(js.Function1[/* params */ Params[T], ReactElement]) | ReactElement] = js.native
  
  var component: js.UndefOr[ReactComponentClass[RouteComponentProps[T]]] = js.native
  
  var path: js.UndefOr[Path] = js.native
}
object RouteProps {
  
  @scala.inline
  def apply[T /* <: DefaultParams */](): RouteProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps[T]]
  }
  
  @scala.inline
  implicit class RoutePropsOps[Self <: RouteProps[_], T /* <: DefaultParams */] (val x: Self with RouteProps[T]) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* params */ Params[T] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* params */ Params[T], ReactElement]) | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[RouteComponentProps[T]]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[RouteComponentProps[T]]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactComponentClass[RouteComponentProps[T]]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
