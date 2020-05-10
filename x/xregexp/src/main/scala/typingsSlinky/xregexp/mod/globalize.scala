package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "globalize")
@js.native
object globalize extends js.Object {
  /**
    * Copies a regex object and adds flag `g`. The copy maintains extended data, is augmented with
    * `XRegExp.prototype` properties, and has a fresh `lastIndex` property (set to zero). Native
    * regexes are not recompiled using XRegExp syntax.
    *
    * @param regex - Regex to globalize.
    * @returns Copy of the provided regex with flag `g` added.
    * @example
    *
    * const globalCopy = XRegExp.globalize(/regex/);
    * globalCopy.global; // -> true
    */
  def apply(regex: js.RegExp): js.RegExp = js.native
}

