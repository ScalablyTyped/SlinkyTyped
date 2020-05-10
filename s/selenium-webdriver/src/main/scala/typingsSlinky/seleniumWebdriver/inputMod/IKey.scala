package typingsSlinky.seleniumWebdriver.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKey extends js.Object {
  var ADD: String = js.native
  var ALT: String = js.native
  var ARROW_DOWN: String = js.native
  var ARROW_LEFT: String = js.native
  var ARROW_RIGHT: String = js.native
  var ARROW_UP: String = js.native
  var BACK_SPACE: String = js.native
  var CANCEL: String = js.native
  var CLEAR: String = js.native
  var COMMAND: String = js.native
  var CONTROL: String = js.native
  var DECIMAL: String = js.native
  var DELETE: String = js.native
  var DIVIDE: String = js.native
  var DOWN: String = js.native
  var END: String = js.native
  var ENTER: String = js.native
  var EQUALS: String = js.native
  var ESCAPE: String = js.native
  var F1: String = js.native
  var F10: String = js.native
  var F11: String = js.native
  var F12: String = js.native
    // function keys
  var F2: String = js.native
  var F3: String = js.native
  var F4: String = js.native
  var F5: String = js.native
  var F6: String = js.native
  var F7: String = js.native
  var F8: String = js.native
  var F9: String = js.native
    // ^break
  var HELP: String = js.native
  var HOME: String = js.native
  var INSERT: String = js.native
  var LEFT: String = js.native
    // Apple command key
  var META: String = js.native
  var MULTIPLY: String = js.native
  var NULL: String = js.native
  var NUMPAD0: String = js.native
    // number pad keys
  var NUMPAD1: String = js.native
  var NUMPAD2: String = js.native
  var NUMPAD3: String = js.native
  var NUMPAD4: String = js.native
  var NUMPAD5: String = js.native
  var NUMPAD6: String = js.native
  var NUMPAD7: String = js.native
  var NUMPAD8: String = js.native
  var NUMPAD9: String = js.native
  var PAGE_DOWN: String = js.native
  var PAGE_UP: String = js.native
  var PAUSE: String = js.native
  var RETURN: String = js.native
  var RIGHT: String = js.native
  var SEMICOLON: String = js.native
  var SEPARATOR: String = js.native
  var SHIFT: String = js.native
  var SPACE: String = js.native
  var SUBTRACT: String = js.native
  var TAB: String = js.native
  var UP: String = js.native
       // alias for Windows key
  /**
    * Simulate pressing many keys at once in a 'chord'. Takes a sequence of
    * keys or strings, appends each of the values to a string,
    * and adds the chord termination key ({@link Key.NULL}) and returns
    * the resulting string.
    *
    * Note: when the low-level webdriver key handlers see Keys.NULL, active
    * modifier keys (CTRL/ALT/SHIFT/etc) release via a keyup event.
    *
    * @param {...string} var_args The key sequence to concatenate.
    * @return {string} The null-terminated key sequence.
    */
  def chord(var_args: (String | IKey)*): String = js.native
}

object IKey {
  @scala.inline
  def apply(
    ADD: String,
    ALT: String,
    ARROW_DOWN: String,
    ARROW_LEFT: String,
    ARROW_RIGHT: String,
    ARROW_UP: String,
    BACK_SPACE: String,
    CANCEL: String,
    CLEAR: String,
    COMMAND: String,
    CONTROL: String,
    DECIMAL: String,
    DELETE: String,
    DIVIDE: String,
    DOWN: String,
    END: String,
    ENTER: String,
    EQUALS: String,
    ESCAPE: String,
    F1: String,
    F10: String,
    F11: String,
    F12: String,
    F2: String,
    F3: String,
    F4: String,
    F5: String,
    F6: String,
    F7: String,
    F8: String,
    F9: String,
    HELP: String,
    HOME: String,
    INSERT: String,
    LEFT: String,
    META: String,
    MULTIPLY: String,
    NULL: String,
    NUMPAD0: String,
    NUMPAD1: String,
    NUMPAD2: String,
    NUMPAD3: String,
    NUMPAD4: String,
    NUMPAD5: String,
    NUMPAD6: String,
    NUMPAD7: String,
    NUMPAD8: String,
    NUMPAD9: String,
    PAGE_DOWN: String,
    PAGE_UP: String,
    PAUSE: String,
    RETURN: String,
    RIGHT: String,
    SEMICOLON: String,
    SEPARATOR: String,
    SHIFT: String,
    SPACE: String,
    SUBTRACT: String,
    TAB: String,
    UP: String,
    chord: /* repeated */ String | IKey => String
  ): IKey = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], ALT = ALT.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any], BACK_SPACE = BACK_SPACE.asInstanceOf[js.Any], CANCEL = CANCEL.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DIVIDE = DIVIDE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F10 = F10.asInstanceOf[js.Any], F11 = F11.asInstanceOf[js.Any], F12 = F12.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], F3 = F3.asInstanceOf[js.Any], F4 = F4.asInstanceOf[js.Any], F5 = F5.asInstanceOf[js.Any], F6 = F6.asInstanceOf[js.Any], F7 = F7.asInstanceOf[js.Any], F8 = F8.asInstanceOf[js.Any], F9 = F9.asInstanceOf[js.Any], HELP = HELP.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], MULTIPLY = MULTIPLY.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMPAD0 = NUMPAD0.asInstanceOf[js.Any], NUMPAD1 = NUMPAD1.asInstanceOf[js.Any], NUMPAD2 = NUMPAD2.asInstanceOf[js.Any], NUMPAD3 = NUMPAD3.asInstanceOf[js.Any], NUMPAD4 = NUMPAD4.asInstanceOf[js.Any], NUMPAD5 = NUMPAD5.asInstanceOf[js.Any], NUMPAD6 = NUMPAD6.asInstanceOf[js.Any], NUMPAD7 = NUMPAD7.asInstanceOf[js.Any], NUMPAD8 = NUMPAD8.asInstanceOf[js.Any], NUMPAD9 = NUMPAD9.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PAUSE = PAUSE.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SEMICOLON = SEMICOLON.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], SUBTRACT = SUBTRACT.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any], chord = js.Any.fromFunction1(chord))
    __obj.asInstanceOf[IKey]
  }
  @scala.inline
  implicit class IKeyOps[Self <: IKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_DOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_LEFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_RIGHT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_UP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBACK_SPACE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BACK_SPACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANCEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMMAND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMAND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONTROL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTROL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDECIMAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DECIMAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDELETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIVIDE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIVIDE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEQUALS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withESCAPE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF10(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF11(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF12(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF9(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("F9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHELP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HELP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINSERT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INSERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMETA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("META")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMULTIPLY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MULTIPLY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNULL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NULL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMPAD9(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_DOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_UP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_UP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAUSE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAUSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRETURN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEMICOLON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEMICOLON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEPARATOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHIFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHIFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPACE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTRACT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTRACT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChord(value: /* repeated */ String | IKey => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chord")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

