package typingsSlinky.webix.mod.ui

import typingsSlinky.webix.mod.DataCollection
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.comments")
@js.native
class comments ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$exportView")
  def $exportView(): typingsSlinky.webix.webix.ui.baseview = js.native
  
  @JSName("$onLoad")
  def $onLoad(args: js.Any*): js.Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  @JSName("$skin")
  var $skin_Original_comments: WebixCallback = js.native
  
  def attachEvent(`type`: commentsEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: commentsEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_comments: commentsConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def edit(id: String): Unit = js.native
  def edit(id: Double): Unit = js.native
  
  def getMenu(): js.Any = js.native
  
  def getUsers(): DataCollection = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  def setCurrentUser(id: String): Unit = js.native
  def setCurrentUser(id: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
