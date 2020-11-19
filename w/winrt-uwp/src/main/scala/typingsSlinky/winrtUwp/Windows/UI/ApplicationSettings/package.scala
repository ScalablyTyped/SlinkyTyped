package typingsSlinky.winrtUwp.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ApplicationSettings {
  
  /** Represents the method that's invoked by the account settings pane when the user deletes a credential. */
  type CredentialCommandCredentialDeletedHandler = js.Function1[
    /* command */ typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand, 
    scala.Unit
  ]
  
  /** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
  type WebAccountCommandInvokedHandler = js.Function2[
    /* command */ typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand, 
    /* args */ typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings.WebAccountInvokedArgs, 
    scala.Unit
  ]
  
  /** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
  type WebAccountProviderCommandInvokedHandler = js.Function1[
    /* command */ typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand, 
    scala.Unit
  ]
}
