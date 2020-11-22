package typingsSlinky.tuyaPanelKit

import slinky.core.facade.ReactRef
import typingsSlinky.tuyaPanelKit.anon.GetInitialState
import typingsSlinky.tuyaPanelKit.nativeTypesMod.LinkingOptions
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/native/useLinking", JSImport.Namespace)
@js.native
object useLinkingMod extends js.Object {
  
  def default(
    ref: ReactRef[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
}
