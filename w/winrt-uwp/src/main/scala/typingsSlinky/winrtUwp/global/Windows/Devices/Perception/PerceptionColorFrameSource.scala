package typingsSlinky.winrtUwp.global.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides color frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
abstract class PerceptionColorFrameSource ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource
object PerceptionColorFrameSource {
  
  /**
    * Creates a new color frame source watcher.
    * @return A new color frame source watcher.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource.createWatcher")
  @js.native
  def createWatcher(): typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSourceWatcher = js.native
  
  /**
    * Finds all color frame sources.
    * @return When the method completes, it asynchronously returns a list of color frame sources.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource.findAllAsync")
  @js.native
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Finds an color frame source by looking up its unique ID.
    * @param id The unique ID of the color frame source.
    * @return When this method completes, it asynchronously returns a color frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource.fromIdAsync")
  @js.native
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource] = js.native
  
  /**
    * Requests access to use color frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource.requestAccessAsync")
  @js.native
  def requestAccessAsync(): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ] = js.native
}
