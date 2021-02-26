package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxAutoReplyMessageResponseKind extends StObject
/** Defines the encoding schema used for automatic replies. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind")
@js.native
object EmailMailboxAutoReplyMessageResponseKind extends StObject {
  
  /** The autoreply message is encoded as HTML. */
  @js.native
  sealed trait html extends EmailMailboxAutoReplyMessageResponseKind
  
  /** The autoreply message is encoded as plain text. */
  @js.native
  sealed trait plainText extends EmailMailboxAutoReplyMessageResponseKind
}
