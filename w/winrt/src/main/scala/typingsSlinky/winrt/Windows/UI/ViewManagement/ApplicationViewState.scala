package typingsSlinky.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationViewState extends StObject
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends StObject {
  
  @js.native
  sealed trait filled extends ApplicationViewState
  
  @js.native
  sealed trait fullScreenLandscape extends ApplicationViewState
  
  @js.native
  sealed trait fullScreenPortrait extends ApplicationViewState
  
  @js.native
  sealed trait snapped extends ApplicationViewState
}
