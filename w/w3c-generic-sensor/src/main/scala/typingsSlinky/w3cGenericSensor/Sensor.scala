package typingsSlinky.w3cGenericSensor

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventTarget
import typingsSlinky.w3cGenericSensor.w3cGenericSensorStrings.activate
import typingsSlinky.w3cGenericSensor.w3cGenericSensorStrings.error
import typingsSlinky.w3cGenericSensor.w3cGenericSensorStrings.reading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sensor extends EventTarget {
  
  val activated: Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_activate(`type`: activate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SensorErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(`type`: reading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reading(
    `type`: reading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  def onactivate(ev: Event): js.Any = js.native
  
  def onerror(ev: SensorErrorEvent): js.Any = js.native
  
  def onreading(ev: Event): js.Any = js.native
  
  // Should be DOMHighResTimeStamp.
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  val timestamp: js.UndefOr[Double] = js.native
}
