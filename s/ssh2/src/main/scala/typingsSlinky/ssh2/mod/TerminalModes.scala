package typingsSlinky.ssh2.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ssh2.ssh2Numbers.`0`
import typingsSlinky.ssh2.ssh2Numbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalModes
  extends /* mode */ StringDictionary[js.UndefOr[Double]] {
  /** 7 bit mode. */
  var CS7: js.UndefOr[`0` | `1`] = js.native
  /** 8 bit mode. */
  var CS8: js.UndefOr[`0` | `1`] = js.native
  /** Enable echoing. */
  var ECHO: js.UndefOr[`0` | `1`] = js.native
  /** Echo control characters as ^(Char). */
  var ECHOCTL: js.UndefOr[`0` | `1`] = js.native
  /** Visually erase chars. */
  var ECHOE: js.UndefOr[`0` | `1`] = js.native
  /** Kill character discards current line. */
  var ECHOK: js.UndefOr[`0` | `1`] = js.native
  /** Visual erase for line kill. */
  var ECHOKE: js.UndefOr[`0` | `1`] = js.native
  /** Echo NL even if ECHO is off. */
  var ECHONL: js.UndefOr[`0` | `1`] = js.native
  /** Canonicalize input lines. */
  var ICANON: js.UndefOr[`0` | `1`] = js.native
  /** Map CR to NL on input. */
  var ICRNL: js.UndefOr[`0` | `1`] = js.native
  /** Enable extensions. */
  var IEXTEN: js.UndefOr[`0` | `1`] = js.native
  /** Ignore CR on input. */
  var IGNCR: js.UndefOr[`0` | `1`] = js.native
  /** The ignore parity flag.  The parameter SHOULD be `0` if this flag is FALSE, and `1` if it is TRUE. */
  var IGNPAR: js.UndefOr[`0` | `1`] = js.native
  /** Ring bell on input queue full. */
  var IMAXBEL: js.UndefOr[`0` | `1`] = js.native
  /** Map NL into CR on input. */
  var INLCR: js.UndefOr[`0` | `1`] = js.native
  /** Enable checking of parity errors. */
  var INPCK: js.UndefOr[`0` | `1`] = js.native
  /** Enable signals INTR, QUIT, [D]SUSP. */
  var ISIG: js.UndefOr[`0` | `1`] = js.native
  /** Strip 8th bit off characters. */
  var ISTRIP: js.UndefOr[`0` | `1`] = js.native
  /** Translate uppercase characters to lowercase. */
  var IUCLC: js.UndefOr[`0` | `1`] = js.native
  /** Any char will restart after stop. */
  var IXANY: js.UndefOr[`0` | `1`] = js.native
  /** Enable input flow control. */
  var IXOFF: js.UndefOr[`0` | `1`] = js.native
  /** Enable output flow control. */
  var IXON: js.UndefOr[`0` | `1`] = js.native
  /** Don't flush after interrupt. */
  var NOFLSH: js.UndefOr[`0` | `1`] = js.native
  /** Translate carriage return to newline (output). */
  var OCRNL: js.UndefOr[`0` | `1`] = js.native
  /** Convert lowercase to uppercase. */
  var OLCUC: js.UndefOr[`0` | `1`] = js.native
  /** Map NL to CR-NL. */
  var ONLCR: js.UndefOr[`0` | `1`] = js.native
  /** Newline performs a carriage return (output). */
  var ONLRET: js.UndefOr[`0` | `1`] = js.native
  /** Translate newline to carriage return-newline (output). */
  var ONOCR: js.UndefOr[`0` | `1`] = js.native
  /** Enable output processing. */
  var OPOST: js.UndefOr[`0` | `1`] = js.native
  /** Parity enable. */
  var PARENB: js.UndefOr[`0` | `1`] = js.native
  /** Mark parity and framing errors. */
  var PARMRK: js.UndefOr[`0` | `1`] = js.native
  /** Odd parity, else even. */
  var PARODD: js.UndefOr[`0` | `1`] = js.native
  /** Retype pending input. */
  var PENDIN: js.UndefOr[`0` | `1`] = js.native
  /** Stop background jobs from output. */
  var TOSTOP: js.UndefOr[`0` | `1`] = js.native
  /** Specifies the input baud rate in bits per second. */
  var TTY_OP_ISPEED: js.UndefOr[Double] = js.native
  /** Specifies the output baud rate in bits per second. */
  var TTY_OP_OSPEED: js.UndefOr[Double] = js.native
  /** Toggles the flushing of terminal output. */
  var VDISCARD: js.UndefOr[Double] = js.native
  /** Another suspend character. */
  var VDSUSP: js.UndefOr[Double] = js.native
  /** End-of-file character (sends `EOF` from the terminal). */
  var VEOF: js.UndefOr[Double] = js.native
  /** End-of-line character in addition to carriage return and/or linefeed. */
  var VEOL: js.UndefOr[Double] = js.native
  /** Additional end-of-line character. */
  var VEOL2: js.UndefOr[Double] = js.native
  /** Erase the character to left of the cursor. */
  var VERASE: js.UndefOr[Double] = js.native
  /** Character to flush output. */
  var VFLUSH: js.UndefOr[Double] = js.native
  /** Interrupt character; `255` if none. Not all of these characters are supported on all systems. */
  var VINTR: js.UndefOr[Double] = js.native
  /** Kill the current input line. */
  var VKILL: js.UndefOr[Double] = js.native
  /** Enter the next character typed literally, even if it is a special character */
  var VLNEXT: js.UndefOr[Double] = js.native
  /** The quit character (sends `SIGQUIT` signal on POSIX systems). */
  var VQUIT: js.UndefOr[Double] = js.native
  /** Reprints the current input line. */
  var VREPRINT: js.UndefOr[Double] = js.native
  /** Continues paused output (normally control-Q). */
  var VSTART: js.UndefOr[Double] = js.native
  /** Prints system status line (load, command, pid, etc). */
  var VSTATUS: js.UndefOr[Double] = js.native
  /** Pauses output (normally control-S). */
  var VSTOP: js.UndefOr[Double] = js.native
  /** Suspends the current program. */
  var VSUSP: js.UndefOr[Double] = js.native
  /** Switch to a different shell layer. */
  var VSWTCH: js.UndefOr[Double] = js.native
  /** Erases a word left of cursor. */
  var VWERASE: js.UndefOr[Double] = js.native
  /** Enable input and output of uppercase characters by preceding their lowercase equivalents with `\`. */
  var XCASE: js.UndefOr[`0` | `1`] = js.native
}

object TerminalModes {
  @scala.inline
  def apply(): TerminalModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalModes]
  }
  @scala.inline
  implicit class TerminalModesOps[Self <: TerminalModes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCS7(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CS7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCS7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CS7")(js.undefined)
        ret
    }
    @scala.inline
    def withCS8(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CS8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCS8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CS8")(js.undefined)
        ret
    }
    @scala.inline
    def withECHO(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHO")(js.undefined)
        ret
    }
    @scala.inline
    def withECHOCTL(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOCTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHOCTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOCTL")(js.undefined)
        ret
    }
    @scala.inline
    def withECHOE(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHOE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOE")(js.undefined)
        ret
    }
    @scala.inline
    def withECHOK(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHOK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOK")(js.undefined)
        ret
    }
    @scala.inline
    def withECHOKE(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOKE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHOKE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHOKE")(js.undefined)
        ret
    }
    @scala.inline
    def withECHONL(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHONL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutECHONL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECHONL")(js.undefined)
        ret
    }
    @scala.inline
    def withICANON(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICANON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICANON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICANON")(js.undefined)
        ret
    }
    @scala.inline
    def withICRNL(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRNL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICRNL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICRNL")(js.undefined)
        ret
    }
    @scala.inline
    def withIEXTEN(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEXTEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIEXTEN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEXTEN")(js.undefined)
        ret
    }
    @scala.inline
    def withIGNCR(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNCR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIGNCR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNCR")(js.undefined)
        ret
    }
    @scala.inline
    def withIGNPAR(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNPAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIGNPAR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNPAR")(js.undefined)
        ret
    }
    @scala.inline
    def withIMAXBEL(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMAXBEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIMAXBEL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMAXBEL")(js.undefined)
        ret
    }
    @scala.inline
    def withINLCR(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INLCR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutINLCR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INLCR")(js.undefined)
        ret
    }
    @scala.inline
    def withINPCK(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPCK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutINPCK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPCK")(js.undefined)
        ret
    }
    @scala.inline
    def withISIG(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISIG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISIG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISIG")(js.undefined)
        ret
    }
    @scala.inline
    def withISTRIP(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISTRIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISTRIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISTRIP")(js.undefined)
        ret
    }
    @scala.inline
    def withIUCLC(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IUCLC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIUCLC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IUCLC")(js.undefined)
        ret
    }
    @scala.inline
    def withIXANY(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXANY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIXANY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXANY")(js.undefined)
        ret
    }
    @scala.inline
    def withIXOFF(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXOFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIXOFF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXOFF")(js.undefined)
        ret
    }
    @scala.inline
    def withIXON(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIXON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IXON")(js.undefined)
        ret
    }
    @scala.inline
    def withNOFLSH(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOFLSH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNOFLSH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOFLSH")(js.undefined)
        ret
    }
    @scala.inline
    def withOCRNL(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCRNL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOCRNL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCRNL")(js.undefined)
        ret
    }
    @scala.inline
    def withOLCUC(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OLCUC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOLCUC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OLCUC")(js.undefined)
        ret
    }
    @scala.inline
    def withONLCR(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONLCR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutONLCR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONLCR")(js.undefined)
        ret
    }
    @scala.inline
    def withONLRET(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONLRET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutONLRET: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONLRET")(js.undefined)
        ret
    }
    @scala.inline
    def withONOCR(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONOCR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutONOCR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONOCR")(js.undefined)
        ret
    }
    @scala.inline
    def withOPOST(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOPOST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPOST")(js.undefined)
        ret
    }
    @scala.inline
    def withPARENB(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARENB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPARENB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARENB")(js.undefined)
        ret
    }
    @scala.inline
    def withPARMRK(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARMRK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPARMRK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARMRK")(js.undefined)
        ret
    }
    @scala.inline
    def withPARODD(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARODD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPARODD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARODD")(js.undefined)
        ret
    }
    @scala.inline
    def withPENDIN(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PENDIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPENDIN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PENDIN")(js.undefined)
        ret
    }
    @scala.inline
    def withTOSTOP(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOSTOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTOSTOP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOSTOP")(js.undefined)
        ret
    }
    @scala.inline
    def withTTY_OP_ISPEED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTY_OP_ISPEED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTTY_OP_ISPEED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTY_OP_ISPEED")(js.undefined)
        ret
    }
    @scala.inline
    def withTTY_OP_OSPEED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTY_OP_OSPEED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTTY_OP_OSPEED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTY_OP_OSPEED")(js.undefined)
        ret
    }
    @scala.inline
    def withVDISCARD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VDISCARD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVDISCARD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VDISCARD")(js.undefined)
        ret
    }
    @scala.inline
    def withVDSUSP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VDSUSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVDSUSP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VDSUSP")(js.undefined)
        ret
    }
    @scala.inline
    def withVEOF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVEOF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOF")(js.undefined)
        ret
    }
    @scala.inline
    def withVEOL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVEOL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOL")(js.undefined)
        ret
    }
    @scala.inline
    def withVEOL2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOL2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVEOL2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VEOL2")(js.undefined)
        ret
    }
    @scala.inline
    def withVERASE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVERASE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERASE")(js.undefined)
        ret
    }
    @scala.inline
    def withVFLUSH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VFLUSH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVFLUSH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VFLUSH")(js.undefined)
        ret
    }
    @scala.inline
    def withVINTR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VINTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVINTR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VINTR")(js.undefined)
        ret
    }
    @scala.inline
    def withVKILL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VKILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVKILL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VKILL")(js.undefined)
        ret
    }
    @scala.inline
    def withVLNEXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VLNEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVLNEXT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VLNEXT")(js.undefined)
        ret
    }
    @scala.inline
    def withVQUIT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VQUIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVQUIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VQUIT")(js.undefined)
        ret
    }
    @scala.inline
    def withVREPRINT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VREPRINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVREPRINT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VREPRINT")(js.undefined)
        ret
    }
    @scala.inline
    def withVSTART(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTART")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVSTART: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTART")(js.undefined)
        ret
    }
    @scala.inline
    def withVSTATUS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTATUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVSTATUS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTATUS")(js.undefined)
        ret
    }
    @scala.inline
    def withVSTOP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVSTOP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSTOP")(js.undefined)
        ret
    }
    @scala.inline
    def withVSUSP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSUSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVSUSP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSUSP")(js.undefined)
        ret
    }
    @scala.inline
    def withVSWTCH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSWTCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVSWTCH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VSWTCH")(js.undefined)
        ret
    }
    @scala.inline
    def withVWERASE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VWERASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVWERASE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VWERASE")(js.undefined)
        ret
    }
    @scala.inline
    def withXCASE(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XCASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXCASE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XCASE")(js.undefined)
        ret
    }
  }
  
}

