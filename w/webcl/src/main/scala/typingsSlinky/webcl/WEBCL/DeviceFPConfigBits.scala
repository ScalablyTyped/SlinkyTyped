package typingsSlinky.webcl.WEBCL

import typingsSlinky.webcl.webclNumbers.`0x10`
import typingsSlinky.webcl.webclNumbers.`0x1`
import typingsSlinky.webcl.webclNumbers.`0x20`
import typingsSlinky.webcl.webclNumbers.`0x2`
import typingsSlinky.webcl.webclNumbers.`0x40`
import typingsSlinky.webcl.webclNumbers.`0x4`
import typingsSlinky.webcl.webclNumbers.`0x8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webcl.webclNumbers.`0x1`
  - typingsSlinky.webcl.webclNumbers.`0x2`
  - typingsSlinky.webcl.webclNumbers.`0x4`
  - typingsSlinky.webcl.webclNumbers.`0x8`
  - typingsSlinky.webcl.webclNumbers.`0x10`
  - typingsSlinky.webcl.webclNumbers.`0x20`
  - typingsSlinky.webcl.webclNumbers.`0x40`
*/
trait DeviceFPConfigBits extends js.Object

object DeviceFPConfigBits {
  @scala.inline
  def FP_DENORM: `0x1` = 0x1.asInstanceOf[`0x1`]
  @scala.inline
  def FP_FMA: `0x20` = 0x20.asInstanceOf[`0x20`]
  @scala.inline
  def FP_INF_NAN: `0x2` = 0x2.asInstanceOf[`0x2`]
  @scala.inline
  def FP_ROUND_TO_INF: `0x10` = 0x10.asInstanceOf[`0x10`]
  @scala.inline
  def FP_ROUND_TO_NEAREST: `0x4` = 0x4.asInstanceOf[`0x4`]
  @scala.inline
  def FP_ROUND_TO_ZERO: `0x8` = 0x8.asInstanceOf[`0x8`]
  @scala.inline
  def FP_SOFT_FLOAT: `0x40` = 0x40.asInstanceOf[`0x40`]
}

