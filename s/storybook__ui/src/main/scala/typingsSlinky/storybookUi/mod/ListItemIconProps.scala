package typingsSlinky.storybookUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemIconProps extends js.Object {
  
  var icon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
  ] = js.native
  
  var imgSrc: js.UndefOr[String] = js.native
}
object ListItemIconProps {
  
  @scala.inline
  def apply(): ListItemIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemIconProps]
  }
  
  @scala.inline
  implicit class ListItemIconPropsOps[Self <: ListItemIconProps] (val x: Self) extends AnyVal {
    
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
    def setIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
    ): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImgSrc(value: String): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
  }
}
