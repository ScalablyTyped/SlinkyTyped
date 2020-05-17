package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.AccidentalNote
import typingsSlinky.vexflow.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyManager extends js.Object {
  def getAccidental(key: String): AccidentalNote = js.native
  def getKey(): String = js.native
  def reset(): KeyManager = js.native
  def selectNote(note: String): Change = js.native
  def setKey(key: String): KeyManager = js.native
}

object KeyManager {
  @scala.inline
  def apply(
    getAccidental: String => AccidentalNote,
    getKey: () => String,
    reset: () => KeyManager,
    selectNote: String => Change,
    setKey: String => KeyManager
  ): KeyManager = {
    val __obj = js.Dynamic.literal(getAccidental = js.Any.fromFunction1(getAccidental), getKey = js.Any.fromFunction0(getKey), reset = js.Any.fromFunction0(reset), selectNote = js.Any.fromFunction1(selectNote), setKey = js.Any.fromFunction1(setKey))
    __obj.asInstanceOf[KeyManager]
  }
  @scala.inline
  implicit class KeyManagerOps[Self <: KeyManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccidental(value: String => AccidentalNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccidental")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => KeyManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectNote(value: String => Change): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNote")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetKey(value: String => KeyManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

