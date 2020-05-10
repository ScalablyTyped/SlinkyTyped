package typingsSlinky.xrm.Xrm

import typingsSlinky.xrm.XrmEnum.ClientFormFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the client context.
  */
@js.native
trait ClientContext extends js.Object {
  /**
    * Returns a value to indicate which client the script is executing in.
    * @returns The client, as either "Web", "Outlook", or "Mobile"
    */
  def getClient(): Client = js.native
  /**
    * Gets client's current state.
    * @returns The client state, as either "Online" or "Offline"
    */
  def getClientState(): ClientState = js.native
  /**
    * Use this method to get information about the kind of device the user is using.
    */
  def getFormFactor(): ClientFormFactor = js.native
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean = js.native
}

object ClientContext {
  @scala.inline
  def apply(
    getClient: () => Client,
    getClientState: () => ClientState,
    getFormFactor: () => ClientFormFactor,
    isOffline: () => Boolean
  ): ClientContext = {
    val __obj = js.Dynamic.literal(getClient = js.Any.fromFunction0(getClient), getClientState = js.Any.fromFunction0(getClientState), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
    __obj.asInstanceOf[ClientContext]
  }
  @scala.inline
  implicit class ClientContextOps[Self <: ClientContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClient(value: () => Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClient")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClientState(value: () => ClientState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormFactor(value: () => ClientFormFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormFactor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOffline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOffline")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

