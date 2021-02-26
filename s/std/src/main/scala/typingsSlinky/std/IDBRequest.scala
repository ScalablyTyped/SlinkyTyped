package typingsSlinky.std

import typingsSlinky.std.stdStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance. */
@js.native
trait IDBRequest[T] extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending.
    */
  val error: org.scalajs.dom.raw.DOMException | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onsuccess: (js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  /**
    * Returns "pending" until a request is complete, then returns "done".
    */
  val readyState: IDBRequestReadyState = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsSlinky.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.IDBRequest, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending.
    */
  val result: T = js.native
  
  /**
    * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request.
    */
  val source: org.scalajs.dom.raw.IDBObjectStore | org.scalajs.dom.raw.IDBIndex | org.scalajs.dom.raw.IDBCursor = js.native
  
  /**
    * Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
    */
  val transaction: org.scalajs.dom.raw.IDBTransaction | Null = js.native
}
