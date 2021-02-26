package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the calling app to read through the changes to appointments in its appointment store. */
@js.native
trait AppointmentStoreChangeReader extends StObject {
  
  /** Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync have been addressed by the app. */
  def acceptChanges(): Unit = js.native
  
  /**
    * Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync , up to the specified AppointmentStoreChange , have been addressed by the app.
    * @param lastChangeToAccept The AppointmentStoreChange object indicating the latest change that has been addressed by the app.
    */
  def acceptChangesThrough(lastChangeToAccept: AppointmentStoreChange): Unit = js.native
  
  /**
    * Returns a list of the changes that have occurred in the appointment store that have not yet been accepted by the calling app.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}
object AppointmentStoreChangeReader {
  
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: AppointmentStoreChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): AppointmentStoreChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[AppointmentStoreChangeReader]
  }
  
  @scala.inline
  implicit class AppointmentStoreChangeReaderMutableBuilder[Self <: AppointmentStoreChangeReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptChanges(value: () => Unit): Self = StObject.set(x, "acceptChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAcceptChangesThrough(value: AppointmentStoreChange => Unit): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
