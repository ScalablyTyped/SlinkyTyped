package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatItemKind extends StObject
/** Specifies the type of a chat item. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatItemKind")
@js.native
object ChatItemKind extends StObject {
  
  /** A conversation */
  @js.native
  sealed trait conversation extends ChatItemKind
  
  /** A message */
  @js.native
  sealed trait message extends ChatItemKind
}
