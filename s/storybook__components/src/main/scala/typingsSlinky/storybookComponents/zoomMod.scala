package typingsSlinky.storybookComponents

import org.scalablytyped.runtime.Instantiable0
import slinky.core.facade.ReactElement
import typingsSlinky.storybookComponents.zoomElementMod.ZoomProps
import typingsSlinky.storybookComponents.zoomIFrameMod.ZoomIFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
  object Zoom {
    
    @JSImport("@storybook/components/dist/Zoom/Zoom", "Zoom")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/Zoom/Zoom", "Zoom.Element")
    @js.native
    def Element: js.Function1[/* hasScaleChildren */ ZoomProps, ReactElement] = js.native
    @scala.inline
    def Element_=(x: js.Function1[/* hasScaleChildren */ ZoomProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/components/dist/Zoom/Zoom", "Zoom.IFrame")
    @js.native
    class IFrame () extends ZoomIFrame
    @JSImport("@storybook/components/dist/Zoom/Zoom", "Zoom.IFrame")
    @js.native
    def IFrame: Instantiable0[ZoomIFrame] = js.native
    @scala.inline
    def IFrame_=(x: Instantiable0[ZoomIFrame]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFrame")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/components/dist/Zoom/Zoom", "browserSupportsCssZoom")
  @js.native
  def browserSupportsCssZoom(): Boolean = js.native
}
