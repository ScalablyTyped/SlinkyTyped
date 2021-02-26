package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.storybookAddons.distMod.Addon
import typingsSlinky.storybookUi.anon.Reset
import typingsSlinky.storybookUi.anon.Set
import typingsSlinky.storybookUi.anon.ShouldScale
import typingsSlinky.storybookUi.anon.Value
import typingsSlinky.storybookUi.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "Zoom")
  @js.native
  val Zoom: ReactComponentClass[Reset] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomConsumer")
  @js.native
  val ZoomConsumer: ReactComponentClass[ConsumerProps[Set]] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomProvider")
  @js.native
  class ZoomProvider protected ()
    extends Component[ShouldScale, Value, js.Any] {
    def this(props: ShouldScale) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ShouldScale, context: js.Any) = this()
    
    def set(value: Double): Unit = js.native
    
    @JSName("state")
    var state_ZoomProvider: `0` = js.native
  }
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "zoomTool")
  @js.native
  val zoomTool: Addon = js.native
}
