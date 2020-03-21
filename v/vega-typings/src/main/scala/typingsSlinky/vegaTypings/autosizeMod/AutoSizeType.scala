package typingsSlinky.vegaTypings.autosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.pad
  - typingsSlinky.vegaTypings.vegaTypingsStrings.fit
  - typingsSlinky.vegaTypings.vegaTypingsStrings.`fit-x`
  - typingsSlinky.vegaTypings.vegaTypingsStrings.`fit-y`
  - typingsSlinky.vegaTypings.vegaTypingsStrings.none
*/
trait AutoSizeType extends AutoSize

object AutoSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fit: typingsSlinky.vegaTypings.vegaTypingsStrings.fit = this.cast("fit")
  @scala.inline
  def `fit-x`: typingsSlinky.vegaTypings.vegaTypingsStrings.`fit-x` = this.cast("fit-x")
  @scala.inline
  def `fit-y`: typingsSlinky.vegaTypings.vegaTypingsStrings.`fit-y` = this.cast("fit-y")
  @scala.inline
  def none: typingsSlinky.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def pad: typingsSlinky.vegaTypings.vegaTypingsStrings.pad = this.cast("pad")
}

