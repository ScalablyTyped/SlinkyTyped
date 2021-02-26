package typingsSlinky.sinonChrome.mod

import typingsSlinky.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Workaround for debugger being a reserved word and can't be exported as a namespace normally
// until https://github.com/Microsoft/TypeScript/issues/7840 is fixed
object debugger {
  
  @JSImport("sinon-chrome", "debugger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "debugger.attach")
  @js.native
  def attach: SinonChromeStub = js.native
  @scala.inline
  def attach_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "debugger.detach")
  @js.native
  def detach: SinonChromeStub = js.native
  @scala.inline
  def detach_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "debugger.getTargets")
  @js.native
  def getTargets: SinonChromeStub = js.native
  @scala.inline
  def getTargets_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTargets")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "debugger.onDetach")
  @js.native
  def onDetach: Event = js.native
  @scala.inline
  def onDetach_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "debugger.onEvent")
  @js.native
  def onEvent: Event = js.native
  @scala.inline
  def onEvent_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "debugger.sendCommand")
  @js.native
  def sendCommand: SinonChromeStub = js.native
  @scala.inline
  def sendCommand_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendCommand")(x.asInstanceOf[js.Any])
}
