package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a get token silently operation. */
@js.native
trait WebAccountProviderGetTokenSilentOperation extends StObject {
  
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: js.Date = js.native
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse] = js.native
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  
  /** Informs the activating app that user interaction is required to continue the operation. */
  def reportUserInteractionRequired(): Unit = js.native
  /**
    * Informs the activating app that an error has occurred and user interaction is required to continue the operation.
    * @param value The error that has occurred.
    */
  def reportUserInteractionRequired(value: WebProviderError): Unit = js.native
}
