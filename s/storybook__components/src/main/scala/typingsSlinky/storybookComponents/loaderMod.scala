package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookComponents.anon.Complete
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@storybook/components/dist/Loader/Loader", "Loader")
  @js.native
  val Loader: ReactComponentClass[
    ComponentProps[
      ReactComponentClass[
        LoaderProps with (ComponentProps[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ProgressWrapper */ js.Any
        ])
      ]
    ]
  ] = js.native
  
  @JSImport("@storybook/components/dist/Loader/Loader", "PureLoader")
  @js.native
  val PureLoader: ReactComponentClass[
    LoaderProps with (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ] = js.native
  
  @js.native
  trait LoaderProps extends StObject {
    
    var error: js.UndefOr[js.Error] = js.native
    
    var progress: js.UndefOr[Progress] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object LoaderProps {
    
    @scala.inline
    def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setProgress(value: Progress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Progress extends StObject {
    
    var message: String = js.native
    
    var modules: js.UndefOr[Complete] = js.native
    
    var value: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(message: String, value: Double): Progress = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModules(value: Complete): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
