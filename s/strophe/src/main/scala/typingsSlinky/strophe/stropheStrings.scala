package typingsSlinky.strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stropheStrings {
  
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  
  @scala.inline
  def groupchat: groupchat = "groupchat".asInstanceOf[groupchat]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @scala.inline
  def presence: presence = "presence".asInstanceOf[presence]
  
  @scala.inline
  def roster: roster = "roster".asInstanceOf[roster]
  
  @js.native
  sealed trait chat extends js.Object
  
  @js.native
  sealed trait groupchat extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait presence extends js.Object
  
  @js.native
  sealed trait roster extends js.Object
}
