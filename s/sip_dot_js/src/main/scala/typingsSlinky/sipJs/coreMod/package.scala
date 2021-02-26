package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object coreMod {
  
  @scala.inline
  def constructOutgoingResponse(
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
  ): typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse = (typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse]
  
  @scala.inline
  def fromBodyLegacy(bodyLegacy: java.lang.String): typingsSlinky.sipJs.bodyMod.Body = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sipJs.bodyMod.Body]
  @scala.inline
  def fromBodyLegacy(bodyLegacy: typingsSlinky.sipJs.anon.Body): typingsSlinky.sipJs.bodyMod.Body = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sipJs.bodyMod.Body]
  
  @scala.inline
  def getBody(message: typingsSlinky.sipJs.bodyMod.Body): js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.sipJs.bodyMod.Body]]
  @scala.inline
  def getBody(message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.sipJs.bodyMod.Body]]
  @scala.inline
  def getBody(message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.sipJs.bodyMod.Body]]
  @scala.inline
  def getBody(message: typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.sipJs.bodyMod.Body]]
  
  @scala.inline
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean = typingsSlinky.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean]
}
