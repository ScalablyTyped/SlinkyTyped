package typingsSlinky.std

import typingsSlinky.std.stdStrings.processorerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioWorkletNode extends AudioNode {
  
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var onprocessorerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  val parameters: AudioParamMap = js.native
  
  val port: org.scalajs.dom.raw.MessagePort = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
}
