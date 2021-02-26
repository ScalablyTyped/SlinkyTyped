package typingsSlinky.zchatBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def addTags(tags: js.Array[java.lang.String]): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def addTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearVisitorDefaultDepartment(): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")().asInstanceOf[scala.Unit]
  @scala.inline
  def clearVisitorDefaultDepartment(callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearVisitorDefaultDepartment")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAccountStatus(): typingsSlinky.zchatBrowser.zchatBrowserStrings.online | typingsSlinky.zchatBrowser.zchatBrowserStrings.offline | typingsSlinky.zchatBrowser.zchatBrowserStrings.away = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountStatus")().asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.online | typingsSlinky.zchatBrowser.zchatBrowserStrings.offline | typingsSlinky.zchatBrowser.zchatBrowserStrings.away]
  
  @scala.inline
  def getAllDepartments(): js.Array[typingsSlinky.zchatBrowser.mod.Department] = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAllDepartments")().asInstanceOf[js.Array[typingsSlinky.zchatBrowser.mod.Department]]
  
  @scala.inline
  def getChatInfo(): typingsSlinky.zchatBrowser.anon.Comment = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChatInfo")().asInstanceOf[typingsSlinky.zchatBrowser.anon.Comment]
  
  @scala.inline
  def getChatLog(): js.Array[typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData] = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChatLog")().asInstanceOf[js.Array[typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData]]
  
  @scala.inline
  def getConnectionStatus(): typingsSlinky.zchatBrowser.zchatBrowserStrings.connected | typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting | typingsSlinky.zchatBrowser.zchatBrowserStrings.closed = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionStatus")().asInstanceOf[typingsSlinky.zchatBrowser.zchatBrowserStrings.connected | typingsSlinky.zchatBrowser.zchatBrowserStrings.connecting | typingsSlinky.zchatBrowser.zchatBrowserStrings.closed]
  
  @scala.inline
  def getDepartment(id: scala.Double): typingsSlinky.zchatBrowser.mod.Department = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.zchatBrowser.mod.Department]
  
  @scala.inline
  def getQueuePosition(): scala.Double = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getQueuePosition")().asInstanceOf[scala.Double]
  
  @scala.inline
  def getVisitorDefaultDepartment(): typingsSlinky.zchatBrowser.mod.Department = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")().asInstanceOf[typingsSlinky.zchatBrowser.mod.Department]
  @scala.inline
  def getVisitorDefaultDepartment(id: scala.Double): typingsSlinky.zchatBrowser.mod.Department = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.zchatBrowser.mod.Department]
  
  @scala.inline
  def getVisitorInfo(): typingsSlinky.zchatBrowser.mod.VisitorInfo = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorInfo")().asInstanceOf[typingsSlinky.zchatBrowser.mod.VisitorInfo]
  
  @scala.inline
  def init(initProps: typingsSlinky.zchatBrowser.mod.InitProps): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(initProps.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isChatting(): scala.Boolean = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isChatting")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def on(
    event_name: typingsSlinky.zchatBrowser.mod.EventName,
    handler: js.Function1[/* event_data */ js.UndefOr[typingsSlinky.zchatBrowser.mod.EventData], scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def removeTags(tags: js.Array[java.lang.String]): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def removeTags(tags: js.Array[java.lang.String], callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(tags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendChatComment(comment: java.lang.String): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendChatComment(comment: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatComment")(comment.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendChatMsg(msg: java.lang.String): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendChatMsg(msg: java.lang.String, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatMsg")(msg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendChatRating(): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")().asInstanceOf[scala.Unit]
  @scala.inline
  def sendChatRating(rating: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendChatRating_bad(rating: typingsSlinky.zchatBrowser.zchatBrowserStrings.bad): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendChatRating_bad(
    rating: typingsSlinky.zchatBrowser.zchatBrowserStrings.bad,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendChatRating_good(rating: typingsSlinky.zchatBrowser.zchatBrowserStrings.good): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendChatRating_good(
    rating: typingsSlinky.zchatBrowser.zchatBrowserStrings.good,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendChatRating")(rating.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendFile(file: org.scalajs.dom.raw.File): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendFile(
    file: org.scalajs.dom.raw.File,
    callback: js.Function2[
      /* err */ typingsSlinky.zchatBrowser.mod.SendFileErrorMessage, 
      /* data */ typingsSlinky.zchatBrowser.anon.Mimetype, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendOfflineMsg(
    options: typingsSlinky.zchatBrowser.anon.Department,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendOfflineMsg")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendTyping(is_typing: scala.Boolean): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendTyping")(is_typing.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sendVisitorPath(options: typingsSlinky.zchatBrowser.anon.Title): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def sendVisitorPath(
    options: typingsSlinky.zchatBrowser.anon.Title,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendVisitorPath")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setVisitorDefaultDepartment(id: scala.Double): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setVisitorDefaultDepartment(id: scala.Double, callback: js.Function1[/* err */ js.Error, scala.Unit]): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorDefaultDepartment")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setVisitorInfo(options: typingsSlinky.zchatBrowser.anon.PartialVisitorInfo): scala.Unit = typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setVisitorInfo(
    options: typingsSlinky.zchatBrowser.anon.PartialVisitorInfo,
    callback: js.Function1[/* err */ js.Error, scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorInfo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def un(
    event_name: typingsSlinky.zchatBrowser.mod.EventName,
    handler: js.Function1[/* event_data */ js.UndefOr[typingsSlinky.zchatBrowser.mod.EventData], scala.Unit]
  ): scala.Unit = (typingsSlinky.zchatBrowser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("un")(event_name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
