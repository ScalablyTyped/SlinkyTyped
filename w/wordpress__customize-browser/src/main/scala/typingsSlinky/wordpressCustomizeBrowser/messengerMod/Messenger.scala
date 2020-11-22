package typingsSlinky.wordpressCustomizeBrowser.messengerMod

import org.scalajs.dom.raw.Window
import typingsSlinky.jquery.JQuery.Callbacks
import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.std.Record
import typingsSlinky.wordpressCustomizeBrowser.classMod.Class
import typingsSlinky.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.wordpressCustomizeBrowser.eventsMod.Events because Inheritance from two classes. Inlined topics, trigger, bind, unbind */ @JSImport("@wordpress/customize-browser/Messenger", "Messenger")
@js.native
class Messenger[T] () extends Class {
  
  def add(key: String, initial: T): Value[T] = js.native
  def add(key: String, initial: T, options: js.Object): Value[T] = js.native
  
  def bind(id: String): this.type = js.native
  
  var channel: Value[String] = js.native
  
  def destroy(): Unit = js.native
  
  def initialize(params: MessengerParams): Unit = js.native
  def initialize(params: MessengerParams, options: js.Object): Unit = js.native
  
  var origin: Value[String] = js.native
  
  def receive(): Unit = js.native
  def receive(event: Event): Unit = js.native
  
  def send(id: String): Unit = js.native
  def send(id: String, data: js.Object): Unit = js.native
  
  var targetWidow: Value[Window | Null] = js.native
  
  // TODO: class with statics instead?
  var topics: Record[String, Callbacks[js.Function]] = js.native
  
  def trigger(id: String): this.type = js.native
  
  def unbind(id: String): this.type = js.native
  
  var url: Value[String] = js.native
}
