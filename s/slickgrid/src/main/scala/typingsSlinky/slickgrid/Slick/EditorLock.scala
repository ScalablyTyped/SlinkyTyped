package typingsSlinky.slickgrid.Slick

import typingsSlinky.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorLock[T /* <: SlickData */] extends js.Object {
  /***
  		* Sets the specified edit controller as the active edit controller (acquire edit lock).
  		* If another edit controller is already active, and exception will be thrown.
  		* @method activate
  		* @param editController {EditController} edit controller acquiring the lock
  		*/
  def activate(editController: Editor[T]): Unit = js.native
  /***
  		* Attempts to cancel the current edit by calling "cancelCurrentEdit" method on the active edit
  		* controller and returns whether the edit was successfully cancelled.  If no edit controller is
  		* active, returns true.
  		* @method cancelCurrentEdit
  		* @return {Boolean}
  		*/
  def cancelCurrentEdit(): Boolean = js.native
  /***
  		* Attempts to commit the current edit by calling "commitCurrentEdit" method on the active edit
  		* controller and returns whether the commit attempt was successful (commit may fail due to validation
  		* errors, etc.).  Edit controller's "commitCurrentEdit" must return true if the commit has succeeded
  		* and false otherwise.  If no edit controller is active, returns true.
  		* @method commitCurrentEdit
  		* @return {Boolean}
  		*/
  def commitCurrentEdit(): Boolean = js.native
  /***
  		* Unsets the specified edit controller as the active edit controller (release edit lock).
  		* If the specified edit controller is not the active one, an exception will be thrown.
  		* @method deactivate
  		* @param editController {EditController} edit controller releasing the lock
  		*/
  def deactivate(editController: Editor[T]): Unit = js.native
  /***
  		* Returns true if a specified edit controller is active (has the edit lock).
  		* If the parameter is not specified, returns true if any edit controller is active.
  		* @method isActive
  		* @param editController {EditController}
  		* @return {Boolean}
  		*/
  def isActive(editController: Editor[T]): Boolean = js.native
}

object EditorLock {
  @scala.inline
  def apply[T](
    activate: Editor[T] => Unit,
    cancelCurrentEdit: () => Boolean,
    commitCurrentEdit: () => Boolean,
    deactivate: Editor[T] => Unit,
    isActive: Editor[T] => Boolean
  ): EditorLock[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit), deactivate = js.Any.fromFunction1(deactivate), isActive = js.Any.fromFunction1(isActive))
    __obj.asInstanceOf[EditorLock[T]]
  }
  @scala.inline
  implicit class EditorLockOps[Self[t] <: EditorLock[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActivate(value: Editor[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancelCurrentEdit(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelCurrentEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommitCurrentEdit(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCurrentEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeactivate(value: Editor[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsActive(value: Editor[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

