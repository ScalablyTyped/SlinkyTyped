package typingsSlinky.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreWindowActivationState extends StObject
@JSGlobal("Windows.UI.Core.CoreWindowActivationState")
@js.native
object CoreWindowActivationState extends StObject {
  
  @js.native
  sealed trait codeActivated extends CoreWindowActivationState
  
  @js.native
  sealed trait deactivated extends CoreWindowActivationState
  
  @js.native
  sealed trait pointerActivated extends CoreWindowActivationState
}
