package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.ReturnType
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.ComposedRefstateReturnTyp
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.storybookUiStrings.auth
import typingsSlinky.storybookUi.storybookUiStrings.empty
import typingsSlinky.storybookUi.storybookUiStrings.error
import typingsSlinky.storybookUi.storybookUiStrings.loading
import typingsSlinky.storybookUi.storybookUiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refIndicatorMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefIndicator", "MessageWrapper")
  @js.native
  val MessageWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefIndicator", "RefIndicator")
  @js.native
  val RefIndicator: ReactComponentClass[ForwardRefExoticComponent[ComposedRefstateReturnTyp]] = js.native
  
  type ClickHandler = /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'][number]['onClick'] */ js.Any
  
  @js.native
  trait CurrentVersionProps extends StObject {
    
    var url: String = js.native
    
    var versions: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any = js.native
  }
  object CurrentVersionProps {
    
    @scala.inline
    def apply(
      url: String,
      versions: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any
    ): CurrentVersionProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentVersionProps]
    }
    
    @scala.inline
    implicit class CurrentVersionPropsMutableBuilder[Self <: CurrentVersionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any
      ): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IndicatorIconProps extends StObject {
    
    var `type`: ReturnType[
        js.Function4[
          /* isLoading */ Boolean, 
          /* isAuthRequired */ Boolean, 
          /* isError */ Boolean, 
          /* isEmpty */ Boolean, 
          auth | error | loading | empty | ready
        ]
      ] = js.native
  }
  object IndicatorIconProps {
    
    @scala.inline
    def apply(
      `type`: ReturnType[
          js.Function4[
            /* isLoading */ Boolean, 
            /* isAuthRequired */ Boolean, 
            /* isError */ Boolean, 
            /* isEmpty */ Boolean, 
            auth | error | loading | empty | ready
          ]
        ]
    ): IndicatorIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicatorIconProps]
    }
    
    @scala.inline
    implicit class IndicatorIconPropsMutableBuilder[Self <: IndicatorIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(
        value: ReturnType[
              js.Function4[
                /* isLoading */ Boolean, 
                /* isAuthRequired */ Boolean, 
                /* isError */ Boolean, 
                /* isEmpty */ Boolean, 
                auth | error | loading | empty | ready
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
