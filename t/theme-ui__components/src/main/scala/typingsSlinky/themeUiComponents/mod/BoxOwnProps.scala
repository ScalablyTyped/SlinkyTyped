package typingsSlinky.themeUiComponents.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionCore.mod.InterpolationWithTheme
import typingsSlinky.emotionSerialize.mod.Interpolation
import typingsSlinky.styledSystem.mod.BackgroundColorProps
import typingsSlinky.styledSystem.mod.OpacityProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.SpaceProps
import typingsSlinky.styledSystem.mod.TextColorProps
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.colors
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxOwnProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme] {
  
  var as: js.UndefOr[ReactElement] = js.native
  
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
  
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
  ] = js.native
  
  var variant: js.UndefOr[String] = js.native
}
object BoxOwnProps {
  
  @scala.inline
  def apply(): BoxOwnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOwnProps]
  }
  
  @scala.inline
  implicit class BoxOwnPropsOps[Self <: BoxOwnProps] (val x: Self) extends AnyVal {
    
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
    def setAsFunctionComponent(value: ReactComponentClass[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsComponentClass(value: ReactComponentClass[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: ReactElement): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = this.set("css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCss(value: InterpolationWithTheme[_]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCssNull: Self = this.set("css", null)
    
    @scala.inline
    def setSx(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
    ): Self = this.set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSx: Self = this.set("sx", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
