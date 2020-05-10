package typingsSlinky.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditChange extends js.Object {
  /**
    * Adds a text edit.
    * @param edit the text edit to add.
    */
  def add(edit: TextEdit): Unit = js.native
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    */
  def all(): js.Array[TextEdit] = js.native
  /**
    * Clears the edits for this change.
    */
  def clear(): Unit = js.native
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    */
  def delete(range: Range): Unit = js.native
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    */
  def insert(position: Position, newText: String): Unit = js.native
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    */
  def replace(range: Range, newText: String): Unit = js.native
}

object TextEditChange {
  @scala.inline
  def apply(
    add: TextEdit => Unit,
    all: () => js.Array[TextEdit],
    clear: () => Unit,
    delete: Range => Unit,
    insert: (Position, String) => Unit,
    replace: (Range, String) => Unit
  ): TextEditChange = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), all = js.Any.fromFunction0(all), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditChange]
  }
  @scala.inline
  implicit class TextEditChangeOps[Self <: TextEditChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: TextEdit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAll(value: () => js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: Range => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Position, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplace(value: (Range, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

