package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountSelectionOptions extends StObject
/** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions")
@js.native
object WebAccountSelectionOptions extends StObject {
  
  /** The user selected the default account. */
  @js.native
  sealed trait default extends WebAccountSelectionOptions
  
  /** The user selected to add a new account. */
  @js.native
  sealed trait `new` extends WebAccountSelectionOptions
}
