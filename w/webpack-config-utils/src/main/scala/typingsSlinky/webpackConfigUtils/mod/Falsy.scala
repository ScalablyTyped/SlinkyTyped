package typingsSlinky.webpackConfigUtils.mod

import typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings._empty
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.`false`
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.webpackConfigUtils.webpackConfigUtilsNumbers.`0`
*/
trait Falsy extends js.Object

object Falsy {
  @scala.inline
  def `false`: typingsSlinky.webpackConfigUtils.webpackConfigUtilsBooleans.`false` = false.asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsBooleans.`false`]
  @scala.inline
  def _empty: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings._empty = "".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings._empty]
  @scala.inline
  def false_ : `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def `0`: typingsSlinky.webpackConfigUtils.webpackConfigUtilsNumbers.`0` = 0.asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsNumbers.`0`]
  @scala.inline
  implicit def apply(value: Null): Falsy = value.asInstanceOf[Falsy]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Falsy): Falsy = value.asInstanceOf[Falsy]
}

