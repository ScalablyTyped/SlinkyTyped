package typingsSlinky.wonderJs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
class EventManager ()
  extends typingsSlinky.wonderJs.eventManagerMod.EventManager

/* static members */
@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
object EventManager extends js.Object {
  def broadcast(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event
  ): js.Any = js.native
  def broadcast(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def emit(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event
  ): js.Any = js.native
  def emit(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(eventName: String): FromEventPatternStream = js.native
  def fromEvent(eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: typingsSlinky.wonderJs.entityObjectMod.EntityObject, eventName: String): FromEventPatternStream = js.native
  def fromEvent(target: typingsSlinky.wonderJs.entityObjectMod.EntityObject, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
  def off(): Unit = js.native
  def off(dom: HTMLElement): Unit = js.native
  def off(dom: HTMLElement, eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  def off(eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent): Unit = js.native
  def off(eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def off(eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def off(target: typingsSlinky.wonderJs.entityObjectMod.EntityObject): Unit = js.native
  def off(target: typingsSlinky.wonderJs.entityObjectMod.EntityObject, eventName: String): Unit = js.native
  def off(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent
  ): Unit = js.native
  def off(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
  ): Unit = js.native
  def off(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def on(
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def on(
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def setBubbleParent(target: typingsSlinky.wonderJs.entityObjectMod.EntityObject, parent: js.Any): Unit = js.native
  def trigger(dom: HTMLElement, event: typingsSlinky.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typingsSlinky.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typingsSlinky.wonderJs.eventMod.Event, userData: js.Any): Unit = js.native
  def trigger(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event
  ): Unit = js.native
  def trigger(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event,
    userData: js.Any
  ): Unit = js.native
  def trigger(
    target: typingsSlinky.wonderJs.entityObjectMod.EntityObject,
    event: typingsSlinky.wonderJs.eventMod.Event,
    userData: js.Any,
    notSetTarget: Boolean
  ): Unit = js.native
}

