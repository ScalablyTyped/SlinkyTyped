package typingsSlinky.storybookComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.storybookComponents.zoomElementMod.ZoomProps
import typingsSlinky.storybookComponents.zoomIFrameMod.ZoomIFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/Zoom/Zoom", JSImport.Namespace)
@js.native
object zoomMod extends js.Object {
  
  def browserSupportsCssZoom(): Boolean = js.native
  
  @js.native
  object Zoom extends js.Object {
    
    var Element: js.Function1[/* hasScaleChildren */ ZoomProps, ReactElement] = js.native
    
    @js.native
    class IFrame () extends ZoomIFrame
    @js.native
    object IFrame extends TopLevel[Instantiable0[ZoomIFrame]]
  }
}
