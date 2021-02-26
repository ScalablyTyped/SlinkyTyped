package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.taskrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates the 3D printing experience. */
@js.native
trait Print3DManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskrequested(`type`: taskrequested, listener: TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs]): Unit = js.native
  
  /** Occurs when a new 3D print job has been created. */
  def ontaskrequested(ev: Print3DTaskRequestedEventArgs with WinRTEvent[Print3DManager]): Unit = js.native
  /** Occurs when a new 3D print job has been created. */
  @JSName("ontaskrequested")
  var ontaskrequested_Original: TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_taskrequested(`type`: taskrequested, listener: TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs]): Unit = js.native
}
