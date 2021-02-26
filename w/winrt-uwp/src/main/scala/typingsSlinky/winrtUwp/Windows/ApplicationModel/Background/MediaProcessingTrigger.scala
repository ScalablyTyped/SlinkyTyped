package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task for performing media processing. */
@js.native
trait MediaProcessingTrigger extends StObject {
  
  /**
    * Triggers the background task and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
    * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
    */
  def requestAsync(): IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
  /**
    * Triggers the background task with the provided collection of arguments and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
    * @param arguments A collection of arguments that will be passed to the media processing background task.
    * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
    */
  def requestAsync(args: ValueSet): IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
}
