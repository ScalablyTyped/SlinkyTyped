package typingsSlinky.winrtUwp.global.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides depth frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
@js.native
abstract class PerceptionDepthFrameSource ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource
/* static members */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
@js.native
object PerceptionDepthFrameSource extends js.Object {
  
  /**
    * Creates a new depth frame source watcher.
    * @return A new depth frame source watcher.
    */
  def createWatcher(): typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher = js.native
  
  /**
    * Finds all depth frame sources.
    * @return When the method completes, it asynchronously returns a list of depth frame sources.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Finds an depth frame source by looking up its unique ID.
    * @param id The unique ID of the depth frame source.
    * @return When this method completes, it asynchronously returns a depth frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource] = js.native
  
  /**
    * Requests access to use depth frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ] = js.native
}
