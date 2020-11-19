package typingsSlinky.storybookComponents.listItemMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProps extends js.Object {
  
  var LinkWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var center: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String | js.Object] = js.native
  
  var left: js.UndefOr[ReactElement] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var right: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object ListItemProps {
  
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
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
    def setLinkWrapper(value: ReactComponentClass[js.Object]): Self = this.set("LinkWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkWrapper: Self = this.set("LinkWrapper", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCenterReactElement(value: ReactElement): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: ReactElement): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHref(value: String | js.Object): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setLeftReactElement(value: ReactElement): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: ReactElement): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setRightReactElement(value: ReactElement): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: ReactElement): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
