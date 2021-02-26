package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Offset
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTMLAbout
import typingsSlinky.storybookUi.anon.PickQueryLinkPropschildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "DesktopOnly")
  @js.native
  val DesktopOnly: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "FrameWrap")
  @js.native
  val FrameWrap: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], Offset, Theme] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "IframeWrapper")
  @js.native
  val IframeWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "LoaderWrapper")
  @js.native
  val LoaderWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "UnstyledLink")
  @js.native
  val UnstyledLink: StyledComponent[QueryLinkProps, PickQueryLinkPropschildre, Theme] = js.native
}
