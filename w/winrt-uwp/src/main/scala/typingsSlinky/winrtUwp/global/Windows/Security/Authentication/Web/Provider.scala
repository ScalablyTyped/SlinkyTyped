package typingsSlinky.winrtUwp.global.Windows.Security.Authentication.Web

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope
import typingsSlinky.winrtUwp.Windows.Security.Credentials.WebAccount
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for managing web accounts and authentication requests as an online identity provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider")
@js.native
object Provider extends js.Object {
  
  /** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
  @js.native
  class WebAccountClientView protected ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView {
    /**
      * Creates a new instance of the WebAccountClientView class.
      * @param viewType The client view type.
      * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
      */
    def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri) = this()
    /**
      * Creates a new instance of the WebAccountClientView class.
      * @param viewType The client view type.
      * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
      * @param accountPairwiseId The account pairwise Id.
      */
    def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri, accountPairwiseId: String) = this()
  }
  
  /** Represents the levels of information about a web account shown to the client. */
  @js.native
  object WebAccountClientViewType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType with Double
      ] = js.native
    
    /* 1 */ val idAndProperties: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idAndProperties with Double = js.native
    
    /* 0 */ val idOnly: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idOnly with Double = js.native
  }
  
  /** Provides methods for managing web accounts. */
  @js.native
  abstract class WebAccountManager ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountManager
  /* static members */
  @js.native
  object WebAccountManager extends js.Object {
    
    /**
      * Adds a new web account asynchronously with three inputs.
      * @param webAccountId The Id for the web account.
      * @param webAccountUserName The user name for the web account.
      * @param props Properties for the web account.
      * @return When this method completes, it returns the new web account.
      */
    def addWebAccountAsync(webAccountId: String, webAccountUserName: String, props: IMapView[String, String]): IPromiseWithIAsyncOperation[WebAccount] = js.native
    /**
      * Adds a new web account asynchronously with four inputs.
      * @param webAccountId The Id for the web account.
      * @param webAccountUserName The user name for the web account.
      * @param props Properties for the web account.
      * @param scope The scope of the web account.
      * @return When this method completes, it returns the new web account.
      */
    def addWebAccountAsync(
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView[String, String],
      scope: WebAccountScope
    ): IPromiseWithIAsyncOperation[WebAccount] = js.native
    
    /**
      * Clears the view for a web account.
      * @param webAccount The web account to clear the view for.
      * @param applicationCallbackUri The callback Uri that indicates the completion of the operation. The broker matches this Uri against every Uri that it is about to navigate to. The broker never navigates to this Uri, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      * @return This method does not return a value.
      */
    def clearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri): IPromiseWithIAsyncAction = js.native
    
    /**
      * Clears a web account picture asynchronously.
      * @param webAccount The web account to clear the picture from.
      * @return This method does not return a value.
      */
    def clearWebAccountPictureAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
    
    /**
      * Deletes a web account asynchronously.
      * @param webAccount The WebAccount to delete.
      * @return This method does not return a value.
      */
    def deleteWebAccountAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
    
    /**
      * Finds all provider web accounts asynchronously.
      * @return When this method completes, it returns all provider web accounts.
      */
    def findAllProviderWebAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the scope of the web account.
      * @param webAccount The web account to get scope for.
      * @return The scope of the web account.
      */
    def getScope(webAccount: WebAccount): WebAccountScope = js.native
    
    /**
      * Gets the views for a web account asynchronously.
      * @param webAccount The web account to get views for.
      * @return When this method completes, it returns the views for the web account.
      */
    def getViewsAsync(webAccount: WebAccount): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
      * @param uriString The Uri to pull cookies from.
      * @param callerPFN The caller's package family name.
      * @return This method does not return a value.
      */
    def pullCookiesAsync(uriString: String, callerPFN: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
      * @param uri The Uri to push the cookies to.
      * @param cookies The cookies to push.
      * @return This method does not return a value.
      */
    def pushCookiesAsync(uri: Uri, cookies: IVectorView[HttpCookie]): IPromiseWithIAsyncAction = js.native
    
    /**
      * Sets the scope of a web account asynchronously.
      * @param webAccount The web account to set scope for.
      * @param scope The scope to set.
      * @return This method does not return a value.
      */
    def setScopeAsync(webAccount: WebAccount, scope: WebAccountScope): IPromiseWithIAsyncAction = js.native
    
    /**
      * Sets the view for a web account asynchronously.
      * @param webAccount The web account to set the view for.
      * @param view The view to set.
      * @return This method does not return a value.
      */
    def setViewAsync(
      webAccount: WebAccount,
      view: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView
    ): IPromiseWithIAsyncAction = js.native
    
    /**
      * Sets the picture of a web account asynchronously.
      * @param webAccount The web account to set the picture for.
      * @param webAccountPicture The picture to set.
      * @return This method does not return a value.
      */
    def setWebAccountPictureAsync(webAccount: WebAccount, webAccountPicture: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
    
    /**
      * Updates the properties of a web account asynchronously.
      * @param webAccount The web account to update.
      * @param webAccountUserName The username to update.
      * @param additionalProperties The properties to update.
      * @return This method does not return a value.
      */
    def updateWebAccountPropertiesAsync(webAccount: WebAccount, webAccountUserName: String, additionalProperties: IMapView[String, String]): IPromiseWithIAsyncAction = js.native
  }
  
  /** Represents an add account operation. */
  @js.native
  abstract class WebAccountProviderAddAccountOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation
  
  /** Represents a delete account operation. */
  @js.native
  abstract class WebAccountProviderDeleteAccountOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation
  
  /** Represents a get token silently operation. */
  @js.native
  abstract class WebAccountProviderGetTokenSilentOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation
  
  /** Represents a manage account operation. */
  @js.native
  abstract class WebAccountProviderManageAccountOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation
  
  /** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
  @js.native
  object WebAccountProviderOperationKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind with Double
      ] = js.native
    
    /* 2 */ val addAccount: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.addAccount with Double = js.native
    
    /* 4 */ val deleteAccount: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.deleteAccount with Double = js.native
    
    /* 1 */ val getTokenSilently: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.getTokenSilently with Double = js.native
    
    /* 3 */ val manageAccount: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.manageAccount with Double = js.native
    
    /* 0 */ val requestToken: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.requestToken with Double = js.native
    
    /* 5 */ val retrieveCookies: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.retrieveCookies with Double = js.native
    
    /* 6 */ val signOutAccount: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.signOutAccount with Double = js.native
  }
  
  /** Represents a request token operation. */
  @js.native
  abstract class WebAccountProviderRequestTokenOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation
  
  /** Represents a retrieve cookies operation made by a web account provider. */
  @js.native
  abstract class WebAccountProviderRetrieveCookiesOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation
  
  /** Represents a sign out account operation made by a web account provider. */
  @js.native
  abstract class WebAccountProviderSignOutAccountOperation ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation
  
  /** Provides information about a web account provider trigger. */
  @js.native
  abstract class WebAccountProviderTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails
  
  /** Represents the scope of a web account. */
  @js.native
  object WebAccountScope extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope with Double
      ] = js.native
    
    /* 1 */ val perApplication: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perApplication with Double = js.native
    
    /* 0 */ val perUser: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perUser with Double = js.native
  }
  
  /** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
  @js.native
  object WebAccountSelectionOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.default with Double = js.native
    
    /* 1 */ val `new`: typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.`new` with Double = js.native
  }
  
  /** Represents a request for a token from a client to a provider. */
  @js.native
  abstract class WebProviderTokenRequest ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest
  
  /** Represents a web provider token response. */
  @js.native
  class WebProviderTokenResponse protected ()
    extends typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse {
    /**
      * Creates a new instance of the WebProviderTokenResponse class.
      * @param webTokenResponse The web token response from the client.
      */
    def this(webTokenResponse: WebTokenResponse) = this()
  }
}
