package typingsSlinky.tuyaPanelKit

import slinky.core.facade.ReactRef
import typingsSlinky.tuyaPanelKit.anon.GetInitialState
import typingsSlinky.tuyaPanelKit.nativeTypesMod.LinkingOptions
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkingMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useLinking", JSImport.Default)
  @js.native
  def default(
    ref: ReactRef[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
}
