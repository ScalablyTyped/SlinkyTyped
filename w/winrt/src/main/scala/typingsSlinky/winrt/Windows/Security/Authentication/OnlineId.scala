package typingsSlinky.winrt.Windows.Security.Authentication

import typingsSlinky.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncInfo
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.anon.CompletedGetResults
import typingsSlinky.winrt.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnlineId {
  
  @js.native
  sealed trait CredentialPromptType extends StObject
  @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
  @js.native
  object CredentialPromptType extends StObject {
    
    @js.native
    sealed trait doNotPrompt extends CredentialPromptType
    
    @js.native
    sealed trait promptIfNeeded extends CredentialPromptType
    
    @js.native
    sealed trait retypeCredentials extends CredentialPromptType
  }
  
  @js.native
  trait IOnlineIdAuthenticator extends StObject {
    
    var applicationId: String = js.native
    
    def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): UserAuthenticationOperation = js.native
    def authenticateUserAsync(request: OnlineIdServiceTicketRequest): UserAuthenticationOperation = js.native
    
    var authenticatedSafeCustomerId: String = js.native
    
    var canSignOut: Boolean = js.native
    
    def signOutUserAsync(): SignOutUserOperation = js.native
  }
  
  @js.native
  trait IOnlineIdServiceTicket extends StObject {
    
    var errorCode: Double = js.native
    
    var request: OnlineIdServiceTicketRequest = js.native
    
    var value: String = js.native
  }
  object IOnlineIdServiceTicket {
    
    @scala.inline
    def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): IOnlineIdServiceTicket = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnlineIdServiceTicket]
    }
    
    @scala.inline
    implicit class IOnlineIdServiceTicketMutableBuilder[Self <: IOnlineIdServiceTicket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: OnlineIdServiceTicketRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOnlineIdServiceTicketRequest extends StObject {
    
    var policy: String = js.native
    
    var service: String = js.native
  }
  object IOnlineIdServiceTicketRequest {
    
    @scala.inline
    def apply(policy: String, service: String): IOnlineIdServiceTicketRequest = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnlineIdServiceTicketRequest]
    }
    
    @scala.inline
    implicit class IOnlineIdServiceTicketRequestMutableBuilder[Self <: IOnlineIdServiceTicketRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOnlineIdServiceTicketRequestFactory extends StObject {
    
    def createOnlineIdServiceTicketRequest(service: String): OnlineIdServiceTicketRequest = js.native
    def createOnlineIdServiceTicketRequest(service: String, policy: String): OnlineIdServiceTicketRequest = js.native
  }
  
  @js.native
  trait IUserIdentity extends StObject {
    
    var firstName: String = js.native
    
    var id: String = js.native
    
    var isBetaAccount: Boolean = js.native
    
    var isConfirmedPC: Boolean = js.native
    
    var lastName: String = js.native
    
    var safeCustomerId: String = js.native
    
    var signInName: String = js.native
    
    var tickets: IVectorView[OnlineIdServiceTicket] = js.native
  }
  object IUserIdentity {
    
    @scala.inline
    def apply(
      firstName: String,
      id: String,
      isBetaAccount: Boolean,
      isConfirmedPC: Boolean,
      lastName: String,
      safeCustomerId: String,
      signInName: String,
      tickets: IVectorView[OnlineIdServiceTicket]
    ): IUserIdentity = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUserIdentity]
    }
    
    @scala.inline
    implicit class IUserIdentityMutableBuilder[Self <: IUserIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBetaAccount(value: Boolean): Self = StObject.set(x, "isBetaAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConfirmedPC(value: Boolean): Self = StObject.set(x, "isConfirmedPC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeCustomerId(value: String): Self = StObject.set(x, "safeCustomerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignInName(value: String): Self = StObject.set(x, "signInName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickets(value: IVectorView[OnlineIdServiceTicket]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnlineIdAuthenticator extends IOnlineIdAuthenticator
  
  @js.native
  trait OnlineIdServiceTicket extends IOnlineIdServiceTicket
  object OnlineIdServiceTicket {
    
    @scala.inline
    def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicket]
    }
  }
  
  @js.native
  trait OnlineIdServiceTicketRequest extends IOnlineIdServiceTicketRequest
  object OnlineIdServiceTicketRequest {
    
    @scala.inline
    def apply(policy: String, service: String): OnlineIdServiceTicketRequest = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicketRequest]
    }
  }
  
  @js.native
  trait SignOutUserOperation extends IAsyncAction {
    
    @JSName("done")
    def done_MSignOutUserOperation[U](): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      progress: js.Function1[/* progress */ js.Any, Unit]
    ): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* error */ js.Any, _],
      progress: js.Function1[/* progress */ js.Any, Unit]
    ): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.Function0[_]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: js.Function0[_],
      error: js.UndefOr[scala.Nothing],
      progress: js.Function1[/* progress */ js.Any, Unit]
    ): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: js.Function0[_],
      error: js.Function1[/* error */ js.Any, _],
      progress: js.Function1[/* progress */ js.Any, Unit]
    ): Unit = js.native
    
    var operation: CompletedGetResults = js.native
  }
  
  @js.native
  trait UserAuthenticationOperation
    extends IAsyncOperation[UserIdentity]
       with IAsyncInfo {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
    
    def getResults(): UserIdentity = js.native
    
    @JSName("operation")
    var operation_UserAuthenticationOperation: `6` = js.native
  }
  
  @js.native
  trait UserIdentity extends IUserIdentity
  object UserIdentity {
    
    @scala.inline
    def apply(
      firstName: String,
      id: String,
      isBetaAccount: Boolean,
      isConfirmedPC: Boolean,
      lastName: String,
      safeCustomerId: String,
      signInName: String,
      tickets: IVectorView[OnlineIdServiceTicket]
    ): UserIdentity = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
  }
}
