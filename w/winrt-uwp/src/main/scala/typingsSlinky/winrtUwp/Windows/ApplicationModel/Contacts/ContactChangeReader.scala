package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to monitor and react to changes to contacts. */
@js.native
trait ContactChangeReader extends js.Object {
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  def acceptChanges(): Unit = js.native
  /**
    * Call this method to indicate that you have processed and accepted up through the specified change.
    * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
    */
  def acceptChangesThrough(lastChangeToAccept: ContactChange): Unit = js.native
  /**
    * Asynchronously gets a list of ContactChange objects.
    * @return A list of ContactChange objects.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

object ContactChangeReader {
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: ContactChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): ContactChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ContactChangeReader]
  }
  @scala.inline
  implicit class ContactChangeReaderOps[Self <: ContactChangeReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAcceptChangesThrough(value: ContactChange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChangesThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBatchAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

