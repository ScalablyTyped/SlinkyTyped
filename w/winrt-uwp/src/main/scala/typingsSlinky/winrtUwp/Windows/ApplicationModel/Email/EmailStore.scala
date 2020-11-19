package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailStore extends js.Object {
  
  /**
    * Allows an app to create an email account from an account name and an email address.
    * @param accountName The name of the account.
    * @param accountAddress The email address associated with the account.
    * @return An email mailbox.
    */
  def createMailboxAsync(accountName: String, accountAddress: String): IPromiseWithIAsyncOperation[EmailMailbox] = js.native
  /**
    * Allows an app to create an email account from an account name, an email address, and the user data account in which the mailbox will reside.
    * @param accountName The name of the account.
    * @param accountAddress The email address associated with the account.
    * @param userDataAccountId The user data account identifier associated with this user.
    * @return An email mailbox.
    */
  def createMailboxAsync(accountName: String, accountAddress: String, userDataAccountId: String): IPromiseWithIAsyncOperation[EmailMailbox] = js.native
  
  /**
    * Gets all mailboxes within the current scope.
    * @return A collection of mailboxes.
    */
  def findMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets an email conversation from the provided identifier.
    * @param id The identifier of the conversation.
    * @return An email conversation.
    */
  def getConversationAsync(id: String): IPromiseWithIAsyncOperation[EmailConversation] = js.native
  
  /**
    * Gets a batch of email conversations.
    * @return A batch of email conversations.
    */
  def getConversationReader(): EmailConversationReader = js.native
  /**
    * Gets a batch of email conversations using the specified email query options.
    * @param options The email query options.
    * @return A batch of email conversations.
    */
  def getConversationReader(options: EmailQueryOptions): EmailConversationReader = js.native
  
  /**
    * Gets an email folder from an identifier.
    * @param id The identifier for the email folder.
    * @return The folder described by the identifier.
    */
  def getFolderAsync(id: String): IPromiseWithIAsyncOperation[EmailFolder] = js.native
  
  /**
    * Gets a mailbox from an identifier.
    * @param id The identifier for the mailbox.
    * @return The mailbox described by the identifier.
    */
  def getMailboxAsync(id: String): IPromiseWithIAsyncOperation[EmailMailbox] = js.native
  
  /**
    * Gets the specified email message.
    * @param id The identifier for the email message.
    * @return The specified email message.
    */
  def getMessageAsync(id: String): IPromiseWithIAsyncOperation[EmailMessage] = js.native
  
  /**
    * Gets a message reader.
    * @return The email message reader.
    */
  def getMessageReader(): EmailMessageReader = js.native
  /**
    * Gets a message reader using the specified query options.
    * @param options Specified query options.
    * @return An email message reader.
    */
  def getMessageReader(options: EmailQueryOptions): EmailMessageReader = js.native
}
