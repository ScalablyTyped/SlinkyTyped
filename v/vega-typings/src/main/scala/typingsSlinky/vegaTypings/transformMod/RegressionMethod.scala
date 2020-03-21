package typingsSlinky.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.linear
  - typingsSlinky.vegaTypings.vegaTypingsStrings.exp
  - typingsSlinky.vegaTypings.vegaTypingsStrings.log
  - typingsSlinky.vegaTypings.vegaTypingsStrings.quad
  - typingsSlinky.vegaTypings.vegaTypingsStrings.poly
  - typingsSlinky.vegaTypings.vegaTypingsStrings.pow
*/
trait RegressionMethod extends js.Object

object RegressionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exp: typingsSlinky.vegaTypings.vegaTypingsStrings.exp = this.cast("exp")
  @scala.inline
  def linear: typingsSlinky.vegaTypings.vegaTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsSlinky.vegaTypings.vegaTypingsStrings.log = this.cast("log")
  @scala.inline
  def poly: typingsSlinky.vegaTypings.vegaTypingsStrings.poly = this.cast("poly")
  @scala.inline
  def pow: typingsSlinky.vegaTypings.vegaTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def quad: typingsSlinky.vegaTypings.vegaTypingsStrings.quad = this.cast("quad")
}

