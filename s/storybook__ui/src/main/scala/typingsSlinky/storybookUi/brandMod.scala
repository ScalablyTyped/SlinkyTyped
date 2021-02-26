package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookComponents.storybookLogoMod.StorybookLogoProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsAnch
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsImgH
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenStor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "Brand")
  @js.native
  val Brand: ReactComponentClass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_helper.AddOptionalTo<any, 'theme'> */ js.Any
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "Img")
  @js.native
  val Img: StyledComponent[
    DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
    PickDetailedHTMLPropsImgH, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "LogoLink")
  @js.native
  val LogoLink: StyledComponent[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    PickDetailedHTMLPropsAnch, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "StorybookLogoStyled")
  @js.native
  val StorybookLogoStyled: StyledComponent[PropsWithChildren[StorybookLogoProps], PickPropsWithChildrenStor, Theme] = js.native
}
