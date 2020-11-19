package typingsSlinky.sipJs.apiSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionDescriptionHandler extends js.Object {
  
  /**
    * Destructor.
    */
  def close(): Unit = js.native
  
  /**
    * Gets the local description from the underlying media implementation.
    * @param options - Options object to be used by getDescription.
    * @param modifiers - Array with one time use description modifiers.
    * @returns Promise that resolves with the local description to be used for the session.
    * Rejects with `ClosedSessionDescriptionHandlerError` when this method
    * is called after close or when close occurs before complete.
    */
  def getDescription(): js.Promise[BodyAndContentType] = js.native
  def getDescription(options: js.UndefOr[scala.Nothing], modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[BodyAndContentType] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions): js.Promise[BodyAndContentType] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[BodyAndContentType] = js.native
  
  /**
    * Returns true if the Session Description Handler can handle the Content-Type described by a SIP message.
    * @param contentType - The content type that is in the SIP Message.
    * @returns True if the content type is  handled by this session description handler. False otherwise.
    */
  def hasDescription(contentType: String): Boolean = js.native
  
  /**
    * Rolls back the current local/remote offer to the prior stable state.
    */
  var rollbackDescription: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /**
    * Send DTMF via RTP (RFC 4733).
    * Returns true if DTMF send is successful, false otherwise.
    * @param tones - A string containing DTMF digits.
    * @param options - Options object to be used by sendDtmf.
    * @returns True if DTMF send is successful, false otherwise.
    */
  def sendDtmf(tones: String): Boolean = js.native
  def sendDtmf(tones: String, options: js.Any): Boolean = js.native
  
  /**
    * Sets the remote description to the underlying media implementation.
    * @param  sessionDescription - The description provided by a SIP message to be set on the media implementation.
    * @param options - Options object to be used by setDescription.
    * @param modifiers - Array with one time use description modifiers.
    * @returns Promise that resolves once the description is set.
    * Rejects with `ClosedSessionDescriptionHandlerError` when this method
    * is called after close or when close occurs before complete.
    */
  def setDescription(sdp: String): js.Promise[Unit] = js.native
  def setDescription(
    sdp: String,
    options: js.UndefOr[scala.Nothing],
    modifiers: js.Array[SessionDescriptionHandlerModifier]
  ): js.Promise[Unit] = js.native
  def setDescription(sdp: String, options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
  def setDescription(
    sdp: String,
    options: SessionDescriptionHandlerOptions,
    modifiers: js.Array[SessionDescriptionHandlerModifier]
  ): js.Promise[Unit] = js.native
}
