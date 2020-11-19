package typingsSlinky.storybookRouter.routerMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryLocationProps extends js.Object {
  
  def children(renderData: RenderData): ReactElement = js.native
}
object QueryLocationProps {
  
  @scala.inline
  def apply(children: RenderData => ReactElement): QueryLocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[QueryLocationProps]
  }
  
  @scala.inline
  implicit class QueryLocationPropsOps[Self <: QueryLocationProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: RenderData => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
